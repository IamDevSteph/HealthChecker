package com.alumni.HealthChecker.controllers;

import com.alumni.HealthChecker.models.User;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import com.alumni.HealthChecker.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

public class UserController {
    @RestController

    @Resource
    private UserRepository userRepo;

    @GetMapping("/user/{id}")
    public User getOneUser(@PathVariable Long id) throws JSONException{
        Optional<User> findOneUser = userRepo.findById(id);
        return findOneUser.get();
    }

    @GetMapping("/user/email/{email}")
    public User getOneUserByEmail(@PathVariable String email) throws JSONException{
        Optional<User> findEmail = userRepo.findByEmail(email);
        return  findEmail.get();
    }

    @GetMapping("/user/phone/{phone}")
    public User getOneUserByPhone(@PathVariable String phone) throws JSONException{
        Optional<User> findPhone = userRepo.findByPhone(phone);
        return  findPhone.get();
    }

//    public Collection<User> updateUser(@PathVariable Long id, @RequestBody String body) throws JSONException {
//        JSONObject newUser = new JSONObject(body);
//        String firstName = newUser.getString("firstName");
//    }

}
