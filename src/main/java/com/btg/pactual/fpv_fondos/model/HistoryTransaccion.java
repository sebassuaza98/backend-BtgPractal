package com.btg.pactual.fpv_fondos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.time.LocalDateTime;

@Data
@Document(collection = "history_transacciones")
public class HistoryTransaccion {
    @Id
    private String id; // Agrega un campo id para MongoDB
    private String fondoId;
    private String tipo; // APERTURA o CANCELACION
    private double monto;
    private LocalDateTime fecha;
    private String clienteId;

    // Constructor
    public HistoryTransaccion(String fondoId, String tipo, double monto, LocalDateTime fecha, String clienteId) {
        this.fondoId = fondoId;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.clienteId = clienteId;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFondoId() {
        return fondoId;
    }

    public void setFondoId(String fondoId) {
        this.fondoId = fondoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

}