package com.edu.springboot.app.springbootweb.form.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Usuario {

  @NotEmpty
  private String username;

  @NotEmpty
  private String password;

  @NotEmpty
  private String email;
}