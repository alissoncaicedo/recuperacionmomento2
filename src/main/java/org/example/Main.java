package org.example;

public class Main {
    public static void main(String[] args) {
        Analgesicos acetaminofen = new Analgesicos() {
            @Override
            public String getNombre() {
                return super.getNombre();
            }
        };
        

        System.out.println(acetaminofen.descuento(20000));
    }
}