package com.edu.springboot.app.springbootweb.dependencyInjection.models.domain;

import lombok.Data;

@Data
public class ItemBill {

  public ItemBill(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  private Product product;

  private int quantity;
}
