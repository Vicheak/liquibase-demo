package com.vicheak.liquibasedemoproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long id;
    @Column(name = "brand_name", nullable = false, unique = true)
    private String name;
    @OneToMany(mappedBy = "brand")
    private List<Model> models;

}
