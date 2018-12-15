package com.controllers;

import com.Service.UserService;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUsers", method= RequestMethod.GET)
    public String getUser() {
        List<User> userList = userService.getUsers();
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{\"users\":[");
        for (User user: userList) {
            jsonString.append("{\"Id\" : \"");
            jsonString.append(user.id);
            jsonString.append("\", \"name\" : \"");
            jsonString.append(user.name);
            jsonString.append("\", \"password\" : \"");
            jsonString.append(user.password);
            jsonString.append("\", \"email\" : \"");
            jsonString.append(user.email);
            jsonString.append("\"} ");
        }
        jsonString.append("]}");
        return jsonString.toString();
    }

    @RequestMapping(value = "/saveUser", method= RequestMethod.GET)
    public String saveUser() {
        userService.saveUser(new User("Jani", "jani", "janika@jani.hu"));
        return "User added to Database";
    }
}