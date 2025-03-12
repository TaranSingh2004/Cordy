package com.taran.cordy.Controller;

import com.taran.cordy.forms.UserForm;
import com.taran.cordy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home(Model m){
        System.out.println("home page");
        m.addAttribute("name", "Taran Singh Duggal");
        m.addAttribute("Class", "cse1");
        m.addAttribute("rollno", "01813202721");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        return "services";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        userForm.setName("Taran");
        return "register";
    }

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){
//        userService
        return "redirect:/register";
    }

}
