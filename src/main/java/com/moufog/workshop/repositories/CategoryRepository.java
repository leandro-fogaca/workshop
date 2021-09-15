package com.moufog.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moufog.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
