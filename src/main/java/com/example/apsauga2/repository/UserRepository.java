package com.example.apsauga2.repository;

import com.example.apsauga2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    User findByUsername(String username); //turi atitikti duombazes fielda pagal kuri ieskom
}
