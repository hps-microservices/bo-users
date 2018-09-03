package com.msvvdv.bousersws.ws;

import com.msvvdv.bouserscore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserRest {

    @Autowired
    private UserService service;
}
