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
@Table(name = "Presupuesto_Ensayo")
public class PresupuestoEnsayoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_pe")
    private Integer id;
    @Column (name = "descuento")
    private Double descuento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tarifa")
    private TarifaEntity tarifa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_presupuesto")
    private PresupuestoEntity presupuesto;


}
