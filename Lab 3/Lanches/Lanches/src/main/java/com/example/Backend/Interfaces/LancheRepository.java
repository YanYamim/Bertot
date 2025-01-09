package com.example.Backend.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Entity.Lanche;

@Repository
public interface LancheRepository extends JpaRepository<Lanche, Long> {
    
}
