package com.example.task01.projection;

import com.example.task01.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "productProjection", types = Product.class)
public interface ProductProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.code}")
    String getCode();

    @Value("#{target.photo}")
    Attachment getPhoto();

    @Value("#{target.category}")
    Category getCategory();

    @Value("#{target.measurement}")
    Measurement getMeasurement();

    @Value("#{target.inputProduct}")
    InputProduct getInputProduct();

    @Value("#{target.active}")
    boolean isActive();

}
