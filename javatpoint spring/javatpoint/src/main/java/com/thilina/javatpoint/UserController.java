package com.thilina.javatpoint;

import com.thilina.javatpoint.model.UserRecord;
import com.thilina.javatpoint.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public List<UserRecord> getAllUsers(){
        return userService.getAll();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void AddUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public Optional<UserRecord> getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.POST)//method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
}
