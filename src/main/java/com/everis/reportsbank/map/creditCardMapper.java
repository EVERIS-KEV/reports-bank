package com.everis.reportsbank.map;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class creditCardMapper {
	private String numberCard;

	private Date dateCreated;
	private String password;

	public creditCardMapper(String password) {
		this.password = password;
	}
}
