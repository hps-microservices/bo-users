package com.msvvdv.bousersws.ws;

import com.msvvdv.bouserscore.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(value = "Manage Users", tags = "User")
public class UserRest {

    @GetMapping("/teste")
    public void  test(){}
}
