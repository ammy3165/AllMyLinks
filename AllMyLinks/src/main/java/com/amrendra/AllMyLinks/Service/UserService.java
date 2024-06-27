package com.amrendra.AllMyLinks.Service;

import com.amrendra.AllMyLinks.Entity.Link;
import com.amrendra.AllMyLinks.Entity.User;
import com.amrendra.AllMyLinks.Repository.UserLinkRepo;
import com.amrendra.AllMyLinks.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserLinkRepo userLinkRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }
    public List<User> getUser(User user) {
        return userRepo.findAll();
    }
    public Link createLink(@RequestBody Link link){
       return userLinkRepo.save(link);

    }
}
