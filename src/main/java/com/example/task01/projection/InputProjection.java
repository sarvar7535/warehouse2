package com.example.task01.projection;

import com.example.task01.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;


@Projection(name = "inputProjection", types = Input.class)
public interface InputProjection {

    Integer getId();

    @Value("#{target.code}")
    String getCode();

    @Value("#{target.factureNumber}")
    String getFactureNumber();

    @Value("#{target.date}")
    Timestamp getDate();

    @Value("#{target.warehouse}")
    Warehouse getWarehouse();

    @Value("#{target.currency}")
    Currency getCurrency();

    @Value("#{target.supplier}")
    Supplier getSupplier();

}
