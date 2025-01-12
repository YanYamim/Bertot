package com.example.Backend.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Compra")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comp")
    private Long compraId;
    
    @Column(name = "data_comp")
    private LocalDate compraData;

    // Vários clientes podem comprar vários lanches, mas aqui é ManyToOne porque cada Compra pertence a um cliente que está relacionado a um lanche
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Lanche lanche;

}
