package com.everis.reportsbank.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.reportsbank.dto.message;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping()
public class reportController {

	public Mono<Object> errorResult(BindingResult bindinResult) {
		String msg = "";

		for (int i = 0; i < bindinResult.getAllErrors().size(); i++)
			msg = bindinResult.getAllErrors().get(0).getDefaultMessage();

		return Mono.just(new message(msg));
	}

	@GetMapping("/")
	public Mono<Object> getByNumber() {
		return Mono.just(new message("A"));
	}

}
