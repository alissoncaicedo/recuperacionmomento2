package org.example;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.Date;

public abstract class Analgesicos {

    private String nombre;
    private Double precio = 20000d;
    private String registroInvima;
    private String fabricantes;
    private LocalDate fechadecreacion;
    private Double preciosiniva;
    private Double descuento;
    private LocalDate fechadevencimiento;

    public Analgesicos() {
    }

    public Analgesicos(String nombre, Double precio, String registroInvima, String fabricantes, LocalDate fechadecreacion, Double preciosiniva, Double descuento, LocalDate fechadevencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.registroInvima = registroInvima;
        this.fabricantes = fabricantes;
        this.fechadecreacion = fechadecreacion;
        this.preciosiniva = preciosiniva;
        this.descuento = descuento;
        this.fechadevencimiento = fechadevencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public String getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(String fabricantes) {
        this.fabricantes = fabricantes;
    }

    public LocalDate getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(LocalDate fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public Double getPreciosiniva() {
        return preciosiniva;
    }

    public void setPreciosiniva(Double preciosiniva) {
        this.preciosiniva = preciosiniva;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public LocalDate getFechadevencimiento() {
        return fechadevencimiento;
    }

    public void setFechadevencimiento(LocalDate fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    public double descuento(double descuento) {
        descuento = descuento - (precio * 0.05);
        return descuento;


    }

}