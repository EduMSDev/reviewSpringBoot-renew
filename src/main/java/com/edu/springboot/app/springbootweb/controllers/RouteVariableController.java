package com.edu.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vars")
public class RouteVariableController {

  @GetMapping("/")
  public String index() {
    return "vars/index";
  }

  @GetMapping("/string/{text}")
  public String vars(@PathVariable String text, Model model) {
    model.addAttribute("title", "Recibir parametros de la ruta (@PathVariable)");
    model.addAttribute("result", "El texto enviado en la ruta es: ".concat(text));
    return "vars/see";
  }

  @GetMapping("/string/{text}/{num}")
  public String vars(@PathVariable String text, @PathVariable int num, Model model) {
    model.addAttribute("title", "Recibir parametros de la ruta (@PathVariable)");
    model.addAttribute("result", "El texto enviado en la ruta es: ".concat(text).concat("y el numero es ") + num);
    return "vars/see";
  }
}