package com.example.demo.controllers;

import com.example.demo.models.USAState;
import com.example.demo.repositories.MediaManagementRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

@CrossOrigin
@RestController
public class DatabaseRestController {


    @Resource
    UserRepository userRepo;

    @Resource
    MediaManagementRepository mediaManagementRepo;


    @RequestMapping("/fetch-all-USAStates")
    public Collection<String> getTheStatesList() {
        Collection<String> listOfStates = new ArrayList<>();

        for (USAState state : USAState.values()) {
            listOfStates.add(state.toString());
        }
        return listOfStates;
    }
}
