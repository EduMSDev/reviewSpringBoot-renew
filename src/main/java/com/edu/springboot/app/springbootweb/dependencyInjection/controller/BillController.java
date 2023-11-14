package com.edu.springboot.app.springbootweb.dependencyInjection.controller;


import com.edu.springboot.app.springbootweb.dependencyInjection.models.domain.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bill")
public class BillController {

  @Autowired
  private Bill bill;

  @GetMapping("/see")
  public String see(Model model) {
    model.addAttribute("bill", bill);
    model.addAttribute("title", "Ejemplo FActura con injeccion");
    return "dependencyInjection/bill/see";
  }
}
