package com.example.Backend.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    
}
