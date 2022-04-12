package com.example.task01.repository;

import com.example.task01.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse")
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
