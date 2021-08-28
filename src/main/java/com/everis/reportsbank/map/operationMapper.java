package com.everis.reportsbank.map;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class operationMapper {

  private double amount;

  private Date dateCreated;
  private String type;

  public operationMapper(double amount, String type) {
    this.type = type;
    this.amount = amount;
  }
}
