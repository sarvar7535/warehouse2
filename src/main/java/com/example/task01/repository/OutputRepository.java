package com.example.task01.repository;


import com.example.task01.entity.Currency;
import com.example.task01.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "output")
public interface OutputRepository extends JpaRepository<Output,Integer> {

}
