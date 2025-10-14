package org.example;

import entidades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n______ Cuenta Bancaria ______");
        //Parte 1 : Cuenta Bancaria

        // Crear una persona
        Persona persona = new Persona(1, "Franco", "Molinier", "46327948");

        //Leer datos de persona
        persona.leerDatos();

        // Crear cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(1, 1000, "0001", persona);

        // Mostrar saldo inicial
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        // Depositar dinero
        cuenta1.ingresarDinero(500);
        System.out.println("Despues de ingresar dinero, saldo: " + cuenta1.getSaldo());

        // Retirar dinero
        boolean exito = cuenta1.retirarDinero(300);
        if (exito) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("No se pudo realizar el retiro (fondos insuficientes).");
        }

        // Intentar retirar más de lo disponible
        boolean exito2 = cuenta1.retirarDinero(2000);
        if (exito2) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("No se pudo realizar el retiro (fondos insuficientes).");
        }

        System.out.println("\n______ Conversor De Temperatura ______");
        //Parte 2 : Conversor Temperatura

        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();

        System.out.println("0 C = " + conversorTemperatura.celAfahr(0) + " F");
        System.out.println("56 F = " + conversorTemperatura.farhAcel(56 ) + " C");

        System.out.println("\n______ Validador de Nombres ______");
        //Parte 3 : Validador de Nombre

        ValidarNombre validador = new ValidarNombre();

        try {
            validador.validarNombre(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            validador.validarNombre("   ");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        validador.validarNombre("Franco");
        
        validador.validarNombre("Juan");






    }
}
