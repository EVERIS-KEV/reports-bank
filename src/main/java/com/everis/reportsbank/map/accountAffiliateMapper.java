package com.everis.reportsbank.map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class accountAffiliateMapper {
	private String numberAccount;
	private Boolean principal;

	public accountAffiliateMapper() {
		this.principal = false;
	}

	public accountAffiliateMapper(String numberAccount) {
		this.numberAccount = numberAccount;
		this.principal = false;
	}

	public accountAffiliateMapper(String numberAccount, Boolean principal) {
		this.numberAccount = numberAccount;
		this.principal = principal;
	}
}
