package com.edu.springboot.app.springbootweb.controllers;

import com.edu.springboot.app.springbootweb.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

  @Value("${texto.indexcontroller.index.titulo}")
  private String textIndex;

  @Value("${texto.indexcontroller.profile.titulo}")
  private String textProfile;

  @Value("${texto.indexcontroller.list.titulo}")
  private String textList;

  @GetMapping({"/index", "/", "/home"})
  public String index(Model model) {
    model.addAttribute("title", textIndex + " framework");
    return "index";
  }

  @GetMapping("/profile")
  public String profile(Model model) {
    User user = User.builder()
        .name("Alberto")
        .surname("Martinez")
        .email("alberto@gmail.com")
        .build();

    model.addAttribute("user", user);
    model.addAttribute("title", textProfile.concat(user.getName()));

    return "profile";
  }

  @GetMapping("/list")
  public String list(Model model) {
    model.addAttribute("title", textList);

    return "list";
  }

  @ModelAttribute("users")
  public List<User> refillUsers() {
    List<User> users = new ArrayList<>();
    users.add(User.builder().name("Jose").surname("Perez").email("jose@gmail.com").build());
    users.add(User.builder().name("Alberto.").surname("Martinez").email("Alberto@gmail.com").build());
    return users;
  }
}