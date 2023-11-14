package com.edu.springboot.app.springbootweb.dependencyInjection.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyServiceComplex implements IService {

  public String operation() {
    return "ejecuntado un proceso importante completjo";
  }
}