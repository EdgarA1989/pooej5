/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioCuenta {

    public Cuenta crearcuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta aux = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        aux.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del Cliente");
        aux.setDni(leer.nextInt());
        System.out.println("Igrese saldo actual");
        aux.setSaldoActual(leer.nextInt());
        System.out.println("Leer porcentaje de interes");
        int porcentaje = leer.nextInt();
        aux.setInteres(porcentaje / 100);
        return aux;
    }

    public void ingresarDinero(Cuenta dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dinero a depositar:");
        double a = leer.nextDouble();
        dinero.setSaldoActual((double) a + dinero.getSaldoActual());
    }

    public void retirarDinero(Cuenta dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dinero que desea retirar:");
        double a = leer.nextDouble();
        if (a < dinero.getSaldoActual()) {
            dinero.setSaldoActual(dinero.getSaldoActual() - a);
        } else {
            System.out.println("Saldo insuficiente");
            dinero.setSaldoActual(0);
        }

    }

    public void extraccionRapida(Cuenta dinero) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar hasta un 20% de su Saldo Actual");
        double retiroRapido = leer.nextDouble();

        while (retiroRapido > (dinero.getSaldoActual() * 0.20)) {

            System.out.println("Supera el 20% vuelva a ingresar un valor");
            retiroRapido = leer.nextDouble();
        }
        dinero.setSaldoActual(dinero.getSaldoActual() - retiroRapido);
    }

    public void mostrarSaldo(Cuenta saldoActual) {
        System.out.println("Su saldo actual es de: " + saldoActual.getSaldoActual());
    }

    public void mostrarTodo(Cuenta cuentaBancaria) {
        cuentaBancaria.getDni();
        cuentaBancaria.getNumeroCuenta();
        cuentaBancaria.getSaldoActual();
        cuentaBancaria.getInteres();
        System.out.println("Su saldo actual es de: " + cuentaBancaria);
    }

    public int Menu(int opcion) {
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------MENU----------------");
        System.out.println("1-Ingresar dinero");
        System.out.println("2-Retirar Dinero");
        System.out.println("3-Retirar Dinero Rapido");
        System.out.println("4-Mostrar Saldo");
        System.out.println("5-Mostrar Datos de la Cuenta");
        System.out.println("6-Salir");
        opcion = leer.nextInt();
        return opcion;
    }

}
