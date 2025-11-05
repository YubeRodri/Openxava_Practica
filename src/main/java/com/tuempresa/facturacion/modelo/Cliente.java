package com.tuempresa.facturacion.modelo;

import org.openxava.annotations.*;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@View(name="Simple",
members = "numero, nombre"
)
public class Cliente {

    @Id
    @Column(length=6)
    int numero;

    @Column(length=50)
    @Required
    String nombre;

    @Embedded @NoFrame
    Direccion direccion;

}
