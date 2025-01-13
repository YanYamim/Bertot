package com.example.Backend.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name = "Cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cli")
    private Long clienteId;

    @Column(name = "nome_cli")
    private String clienteNome;

    // O joinTable é para mapear uma tabela de junção, nesse caso será de Cliente com Lanche
    @ManyToMany
    @JsonIgnoreProperties("clientes")
    @JoinTable(
                name = "Cliente_Lanche",
                joinColumns = @JoinColumn(name = "id_cli"),
                inverseJoinColumns = @JoinColumn(name = "id_lan")
            )
    private List<Lanche> lanches;
}
