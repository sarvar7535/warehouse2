package com.example.task01.repository;


import com.example.task01.entity.Currency;
import com.example.task01.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

}
