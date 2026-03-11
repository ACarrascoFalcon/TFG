package com.presupuesto.tfg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "contacto")
public class ContactoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "p_apellido")
    private String primerApellido;
    @Column(name = "s_apellido")
    private String segundoApellido;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private EmpresaEntity empresa;

}
