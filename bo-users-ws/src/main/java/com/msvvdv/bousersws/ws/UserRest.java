package com.msvvdv.bousersws.ws;

import com.msvvdv.bouserscore.dto.UserDTO;
import com.msvvdv.bouserscore.entity.User;
import com.msvvdv.bouserscore.service.UserService;
import io.swagger.annotations.Api;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
@Api(value = "Manage Users", tags = "User")
public class UserRest {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody UserDTO userDTO){
        userService.save(convertToEntity(userDTO));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> findAll(){
        return convertToDto(userService.findAll());
    }

    private User convertToEntity(UserDTO usetDto){
        return modelMapper.map(usetDto, User.class);
    }

    private UserDTO convertToDto(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    private List<UserDTO> convertToDto(List<User> users) {
        List<UserDTO> usersDTO = new ArrayList<>();
        users.forEach(u->{
            usersDTO.add(convertToDto(u));
        });
        return usersDTO;
    }
}
