package com.example.task01.repository;


import com.example.task01.entity.Attachment;
import com.example.task01.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
