package com.example.task01.repository;


import com.example.task01.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Currency,Integer> {

}
