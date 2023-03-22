package com.example.myspringdemo22.Controller;

import com.example.myspringdemo22.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){ //Model ui Maven
        model.addAttribute("Ikhra", person);
        /*
        String first_name = wr.getParameter("first_name");
        String last_name = wr.getParameter("last_name");

        model.addAttribute("first_name", first_name); //Mapper de to værdier i model
        model.addAttribute("last_name", last_name);
         */ //Kode fra tidligere, husk det her i paramtere: WebRequest wr
        return "home/personData"; //returner en html formula
    }
}
