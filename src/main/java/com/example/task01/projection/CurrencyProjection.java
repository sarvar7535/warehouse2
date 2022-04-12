package com.example.task01.projection;

import com.example.task01.entity.Currency;
import com.example.task01.entity.Measurement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
