package org.example;

import java.time.LocalDate;

public class Antiinfeccioso extends Analgesicos{

    public Antiinfeccioso() {
    }

    public Antiinfeccioso(String nombre, Double precio, String registroInvima, String fabricantes, LocalDate fechadecreacion, Double preciosiniva, Double descuento, LocalDate fechadevencimiento) {
        super(nombre, precio, registroInvima, fabricantes, fechadecreacion, preciosiniva, descuento, fechadevencimiento);
    }

}
