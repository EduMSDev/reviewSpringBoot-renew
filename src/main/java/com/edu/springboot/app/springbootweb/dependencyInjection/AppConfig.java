package com.edu.springboot.app.springbootweb.dependencyInjection;

import com.edu.springboot.app.springbootweb.dependencyInjection.models.domain.ItemBill;
import com.edu.springboot.app.springbootweb.dependencyInjection.models.domain.Product;
import com.edu.springboot.app.springbootweb.dependencyInjection.models.service.IService;
import com.edu.springboot.app.springbootweb.dependencyInjection.models.service.MyService;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public IService iService() {
    return new MyService();
  }

  @Bean
  public List<ItemBill> register() {
    Product product1 = new Product("Cama", 100);
    Product product2 = new Product("Bici", 50);

    ItemBill line1 = new ItemBill(product1, 2);
    ItemBill line2 = new ItemBill(product2, 4);

    return Arrays.asList(line1, line2);
  }

  @Bean("itemsOffice")
  public List<ItemBill> registerOffice() {
    Product product1 = new Product("Monitor", 100);
    Product product2 = new Product("Notebook", 50);

    ItemBill line1 = new ItemBill(product1, 2);
    ItemBill line2 = new ItemBill(product2, 4);

    return Arrays.asList(line1, line2);
  }
}