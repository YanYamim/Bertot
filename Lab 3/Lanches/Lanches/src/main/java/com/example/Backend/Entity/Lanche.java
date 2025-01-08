package com.example.Backend.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Lanche")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lanche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lan")
    private Long idLanche;

    @Column(name = "nome_lan")
    private String nomeLanche;

    @Column(name = "tipo_lan", nullable = false)
    private String tipoLanche;

    @ManyToMany(mappedBy = "lanches")
    List<Cliente> clientes;

}
