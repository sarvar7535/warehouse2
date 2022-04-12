package com.example.task01.repository;

import com.example.task01.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
