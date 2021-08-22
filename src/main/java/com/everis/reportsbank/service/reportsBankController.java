package com.everis.reportsbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.reportsbank.consumer.webclient;
import com.everis.reportsbank.map.accountData;

import reactor.core.publisher.Flux;

@Service
public class reportsBankController {

	private List<accountData> listCurrentAccountByNumber(String id) {
		return webclient.currentAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountData.class)
				.collectList().block();
	}

	private List<accountData> listFixedAccountByNumber(String id) {
		return webclient.fixedAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountData.class)
				.collectList().block();
	}

	private List<accountData> listSavingAccountByNumber(String id) {
		return webclient.savingAccount.get().uri("/byCustomer/{id}", id).retrieve().bodyToFlux(accountData.class)
				.collectList().block();
	}

	public Flux<accountData> getProductsByCustomer(String id) {
		List<accountData> list = new ArrayList<>(listCurrentAccountByNumber(id));
		list.addAll(listFixedAccountByNumber(id));
		list.addAll(listSavingAccountByNumber(id));


		return Flux.fromIterable(list);
	}
}
