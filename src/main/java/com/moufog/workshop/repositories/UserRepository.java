package com.moufog.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moufog.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
