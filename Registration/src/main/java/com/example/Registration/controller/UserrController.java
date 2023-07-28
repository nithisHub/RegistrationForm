package com.example.Registration.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.Registration.entity.Userr;
import com.example.Registration.service.UserrService;

@Controller
public class UserrController {
 
@Autowired
private UserrService userrService;

  @GetMapping("/")
  public String registrationHome() {
    return "home";
  }
  
  @PostMapping("/save")
  public String saveDetails(Userr userr) {
    userrService.saveDetails(userr);
    return "redirect:/showAll";
  }
  
  @GetMapping("/showAll")
  public ModelAndView showDetails() {
   List<Userr> list= userrService.showAllDetails();
    return new ModelAndView("showRecords","records",list);
  }
}
