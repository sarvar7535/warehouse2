package com.example.task01.projection;

import com.example.task01.entity.Supplier;
import com.example.task01.entity.Warehouse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "supplierProjection", types = Supplier.class)
public interface SupplierProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.phoneNumber}")
    String getPhoneNumber();

    @Value("#{target.active}")
    boolean isActive();

}
