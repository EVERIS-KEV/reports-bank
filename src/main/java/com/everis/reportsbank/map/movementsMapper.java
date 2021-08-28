package com.everis.reportsbank.map;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class movementsMapper {

  private Date dateCreated;
  private String type;
  private double amount;
  private String accountEmisor;
  private String accountRecep;
}
