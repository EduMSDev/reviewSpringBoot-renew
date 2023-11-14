package com.edu.springboot.app.springbootweb.dependencyInjection.models.domain;

import lombok.Data;

@Data
public class Product {

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  private String name;

  private int price;

}
