package com.edu.springboot.app.springbootweb.dependencyInjection.models.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class Bill {

  private String description;

  @Autowired
  private Client client;

  @Autowired
  @Qualifier("itemsOffice")
  private List<ItemBill> itemBills;

  @PostConstruct()
  public void init() {
    client.setName("casa");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Factura destruida");
  }
}
