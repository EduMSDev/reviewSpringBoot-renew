package com.edu.springboot.app.springbootweb.dependencyInjection.controller;

import com.edu.springboot.app.springbootweb.dependencyInjection.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/di")
@Controller
public class DIIndexController {

  @Autowired
  private IService myService;

  @GetMapping({"/index", "/"})
  public String index(Model model) {
    model.addAttribute("object", myService.operation());
    return "dependencyInjection/index";
  }
}
