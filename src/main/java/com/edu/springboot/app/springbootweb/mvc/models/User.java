package com.edu.springboot.app.springbootweb.mvc.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {

  String name;

  String surname;

  String email;
}