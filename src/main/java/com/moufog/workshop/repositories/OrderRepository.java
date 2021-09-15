package com.moufog.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moufog.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
