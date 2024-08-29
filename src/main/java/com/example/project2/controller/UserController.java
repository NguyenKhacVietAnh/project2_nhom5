package com.example.project2.controller;

import com.example.project2.entity.User;
import com.example.project2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userlist")
    public String g(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("list", users);
        return "userlist";
    }
    @GetMapping("/adduser")
    public String adduser(Model model) {
        model.addAttribute("user", new User());
        return "adduser";
    }
    @PostMapping("/save1")
    public String save(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/userlist";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        userService.delete(id);
        return "redirect:/userlist";
    }
    @GetMapping("/edit")
    public String edit(@RequestParam("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "edituser";
    }
}
