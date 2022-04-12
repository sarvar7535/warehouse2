package com.example.task01.repository;


import com.example.task01.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

}
