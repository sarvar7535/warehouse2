package com.example.task01.projection;

import com.example.task01.entity.Category;
import com.example.task01.entity.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "categoryProjection", types = Category.class)
public interface CategoryProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.parent}")
    Category getParent();

    @Value("#{target.active}")
    boolean isActive();

}
