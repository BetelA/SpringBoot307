package com.example.demo;

import javax.persistence.*;

@Entity
public class Laptop {
    public class Laptop {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String brand;
        private String model;

        @OneToOne(mappedBy ="laptop")
        private Laptop laptop;
    }
}
