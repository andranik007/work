package com.example.podgotovca.Controller;

import com.example.podgotovca.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor

public class IndexController {
    private final UserService userService;
    @PreAuthorize("hasRole('/ADMIN')")
    @GetMapping("/admin")
    public String adminPage(){return "admin";}

    @GetMapping()
    public String indexPage(Model model, @AuthenticationPrincipal User user){
        model.addAttribute("user", userService.findByName(user.getUsername()));

        return "index";
    }


}
