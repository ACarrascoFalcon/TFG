package com.presupuesto.tfg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "presupuesto")
public class PresupuestoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presupuesto")
    private Integer id;
    @Column(name = "id_relativo")
    private Integer idRelativo;
    @Column(name = "fecha_peticion")
    private LocalDate fechaPeticion;
    @Column(name = "fecha_envio")
    private LocalDate fechaEnvio;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "aceptado")
    private Boolean aceptado;
    @Column(name = "habitual")
    private Boolean habitual;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacto")
    private ContactoEntity contacto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pago")
    private PagosEntity pago;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;


}
