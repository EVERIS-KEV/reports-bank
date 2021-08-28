package com.everis.reportsbank.map;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class creditMapper {

  private String idCustomer;
  private String typeAccount;
  private double baseCreditLimit;
  private double amount;

  private creditCardMapper creditcard;

  private Date dateCreated;
  private List<operationMapper> operation = new ArrayList<operationMapper>();
}
