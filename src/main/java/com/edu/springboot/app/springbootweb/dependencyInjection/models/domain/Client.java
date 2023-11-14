package com.edu.springboot.app.springbootweb.dependencyInjection.models.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class Client {

  @Value("$client.name")
  private String name;

  @Value("$client.surname")
  private String surname;

}