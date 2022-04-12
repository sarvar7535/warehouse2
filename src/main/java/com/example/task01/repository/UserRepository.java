package com.example.task01.repository;


import com.example.task01.entity.Currency;
import com.example.task01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User,Integer> {

}
