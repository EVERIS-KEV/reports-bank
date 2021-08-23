package com.everis.reportsbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.reportsbank.consumer.webclient;
import com.everis.reportsbank.map.accountMapper;
import com.everis.reportsbank.map.creditMapper;
import com.everis.reportsbank.map.operationMapper;

import reactor.core.publisher.Flux;

@Service
public class reportsBankService {

	private List<accountMapper> listCurrentAccountByNumber(String id) {
		return webclient.currentAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountMapper.class)
				.collectList().block();
	}

	private List<accountMapper> listFixedAccountByNumber(String id) {
		return webclient.fixedAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountMapper.class)
				.collectList().block();
	}

	private List<accountMapper> listSavingAccountByNumber(String id) {
		return webclient.savingAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountMapper.class)
				.collectList().block();
	}

	private List<creditMapper> listcreditsByNumber(String id) {
		return webclient.creditAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(creditMapper.class)
				.collectList().block();
	}

	private creditMapper creditsByNumberCard(String number) {
		return webclient.creditAccount.get().uri("/byNumberCard/{number}", number).retrieve()
				.bodyToMono(creditMapper.class).block();
	}

	public Flux<operationMapper> tenLastMovementsCredits(String number) {
		return Flux.fromIterable(creditsByNumberCard(number).getOperation());
	}

	public Flux<Object> getProductsByCustomer(String id) {
		List<Object> list = new ArrayList<>(listcreditsByNumber(id));
		list.addAll(listSavingAccountByNumber(id));
		list.addAll(listFixedAccountByNumber(id));
		list.addAll(listCurrentAccountByNumber(id));
		return Flux.fromIterable(list);
	}
}
