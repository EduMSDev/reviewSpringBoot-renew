package com.edu.springboot.app.springbootweb.form;

import com.edu.springboot.app.springbootweb.form.domain.Usuario;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

  @GetMapping("/form")
  public String form(Model model) {
    return "form/form";
  }

  @PostMapping("/form")
  public String procesar(@Valid Model model, @Valid Usuario usuario, BindingResult result) {
    model.addAttribute("usuario", usuario);
    if (result.hasErrors()) {
      Map<String, String> errors = new HashMap<>();
      result.getFieldErrors().forEach(fieldError -> {
        errors.put(fieldError.getField(), "El campo no puede estar vacio");
      });
      model.addAttribute("error", errors);
      return "form/form";
    }

    return "form/resultado";
  }

}
