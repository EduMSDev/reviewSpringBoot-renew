package com.edu.springboot.app.springbootweb.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("params")
public class ParamController {

  @GetMapping("/")
  public String index() {
    return "params/index";
  }

  @GetMapping("/string")
  public String param(@RequestParam(name = "text", required = false, defaultValue = "algun valor") String text, Model model) {
    model.addAttribute("result", "El texto enviado es: ".concat(text));
    return "params/see";
  }

  @GetMapping("/mix-params")
  public String param(@RequestParam String hi, @RequestParam int num, Model model) {
    model.addAttribute("result", "El saludo enviado es ".concat(hi).concat("y el numero es") + num);
    return "params/see";
  }

  @GetMapping("/mix-params-request")
  public String param(HttpServletRequest request, Model model) {
    String hi = request.getParameter("hi");
    String num = request.getParameter("num");
    model.addAttribute("result", "El saludo enviado es ".concat(hi).concat("y el numero es") + num);
    return "params/see";
  }
}