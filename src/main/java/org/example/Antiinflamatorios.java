package org.example;

import java.time.LocalDate;

public class Antiinflamatorios extends Analgesicos {

    public Antiinflamatorios() {
    }

    public Antiinflamatorios(String nombre, Double precio, String registroInvima, String fabricantes, LocalDate fechadecreacion, Double preciosiniva, Double descuento, LocalDate fechadevencimiento) {
        super(nombre, precio, registroInvima, fabricantes, fechadecreacion, preciosiniva, descuento, fechadevencimiento);
    }
    public double descuento(double descuento) {
        descuento = descuento - (this.getPrecio() * 0.10);
        return descuento;


    }
}
