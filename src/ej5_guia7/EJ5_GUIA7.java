/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_guia7;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;

/**
 *
 * @author EANDRADA
 */
public class EJ5_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCuenta servicioCuenta = new ServicioCuenta();
        Cuenta bancaria = servicioCuenta.crearcuenta();
        int opcion = 0;
        while (opcion != 6) {
            opcion = servicioCuenta.Menu(opcion);

            switch (opcion) {
                case 1:
                    servicioCuenta.ingresarDinero(bancaria);
                    break;
                case 2:
                    servicioCuenta.retirarDinero(bancaria);
                    break;
                case 3:
                    servicioCuenta.extraccionRapida(bancaria);
                    break;

                case 4:
                    servicioCuenta.mostrarSaldo(bancaria);
                    break;
                case 5:
                    servicioCuenta.mostrarTodo(bancaria);
                    break;
            }
        }
    }

}
