package com.edu.springboot.app.springbootweb.controllers;

import com.edu.springboot.app.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

  @GetMapping({"/index", "/", "/home"})
  public String index(Model model) {
    model.addAttribute("title", "hola spring framework");
    return "index";
  }

  @GetMapping("/profile")
  public String profile(Model model) {
    User user = new User();
    user.setName("Alberto");
    user.setSurname("apellido");
    user.setEmail("alberto@gmail.com");

    model.addAttribute("user", user);
    model.addAttribute("title", "Perfil de usuario: ".concat(user.getName()));

    return "profile";
  }

}