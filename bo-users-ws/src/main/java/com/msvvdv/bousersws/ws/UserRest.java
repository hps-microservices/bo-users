package com.msvvdv.bousersws.ws;

import com.msvvdv.bouserscore.entity.User;
import com.msvvdv.bouserscore.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Api(value = "Manage Users", tags = "User")
public class UserRest {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody  User user){
        userService.save(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll(){
        return userService.findAll();
    }
}
