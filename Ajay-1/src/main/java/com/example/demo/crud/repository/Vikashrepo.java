package com.example.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.crud.model.Vikash;

@Repository
public interface Vikashrepo extends JpaRepository<Vikash,Integer> {

}
