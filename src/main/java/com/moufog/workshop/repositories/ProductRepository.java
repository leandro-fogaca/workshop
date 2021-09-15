package com.moufog.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moufog.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
