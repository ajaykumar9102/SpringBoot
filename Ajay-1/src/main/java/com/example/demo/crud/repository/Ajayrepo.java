package com.example.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.crud.model.Ajay;

@Repository
public interface Ajayrepo extends JpaRepository<Ajay,Integer> {

}
