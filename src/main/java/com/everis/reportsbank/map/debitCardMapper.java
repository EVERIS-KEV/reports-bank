package com.everis.reportsbank.map;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class debitCardMapper {
	private String idDebitCard;
	private String idCustomer;
	private String password;

	private Date dateCreated = new Date();
	private String accountNumber;

	private List<accountAffiliateMapper> accounts = new ArrayList<accountAffiliateMapper>();

	public debitCardMapper(String idCustomer, String password) {
		this.idCustomer = idCustomer;
		this.password = password;

	}

}
