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
public class accountMapper {

  private String profile;
  private String accountNumber;
  private double amount;
  private Date dateCreated;
  private String typeAccount;
  private List<movementsMapper> movements = new ArrayList<movementsMapper>();
  private String idCustomer;
}
