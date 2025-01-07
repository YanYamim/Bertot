package com.example.Backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cliente_Lanche")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteLanche {
    
    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_cli", referencedColumnName = "id_cli")
    private Cliente idCliente;

    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_lan", referencedColumnName = "id_lan")
    private Lanche idLanche;
}
