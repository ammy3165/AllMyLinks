package com.amrendra.AllMyLinks.Controller;

import com.amrendra.AllMyLinks.Entity.Link;
import com.amrendra.AllMyLinks.Entity.User;
import com.amrendra.AllMyLinks.Repository.UserLinkRepo;
import com.amrendra.AllMyLinks.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LogInController {
    @Autowired
    private UserService userService;
    @Autowired
    UserLinkRepo userLinkRepo;

    @PostMapping("/register")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User added successfully.";
    }
    @GetMapping("/getUser")
       public List<User> getUser(@RequestBody User user){
        return userService.getUser(user);
    }
    @PostMapping("/registerLink")
    public String createLink(@RequestBody Link link){
         userService.createLink(link) ;
        return "link created";
    }
    @GetMapping("/getLink")
    public List<Link> getLink(@RequestBody Link link){
        return userLinkRepo.findAll();
    }

}
