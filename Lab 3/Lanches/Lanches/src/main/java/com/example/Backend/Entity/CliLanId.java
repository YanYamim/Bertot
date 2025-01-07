package com.example.Backend.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class CliLanId implements Serializable {
    
    private Long idCliente;
    private Long idLanche;
}
