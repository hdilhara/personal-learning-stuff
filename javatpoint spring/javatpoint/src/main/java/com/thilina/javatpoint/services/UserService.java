package com.thilina.javatpoint.services;

import com.thilina.javatpoint.model.UserRecord;
import com.thilina.javatpoint.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<UserRecord> getAll(){
        List<UserRecord> userRecords=new ArrayList<>();
        userRepo.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public Optional<UserRecord> getUser(Integer id){
        return userRepo.findById(id);
    }

    public void addUser(UserRecord userRecord){
        userRepo.save(userRecord);
    }

    public void deleteUser(Integer id){
        userRepo.deleteById(id);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userRepo=" + userRepo +
                '}';
    }
}
