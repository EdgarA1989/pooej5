/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author EANDRADA
 */
public class Cuenta {

    private int numeroCuenta;
    private Integer dni;
    private double saldoActual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, Integer dni, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public Integer getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }

}
