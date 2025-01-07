package com.example.Backend.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    private Long idCompra;

    @ManyToMany
    @JoinColumn(name = "id_cli", referencedColumnName = "id_cli", nullable = false)
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "Compra_Lanche", joinColumns = @JoinColumn(name = "id_comp"), inverseJoinColumns = @JoinColumn(name = "id_lan"))
    private Lanche idLanche;

    @Column(name = "data_comp")
    private Date dataCompra;
}
