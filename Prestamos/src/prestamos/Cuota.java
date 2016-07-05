/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

/**
 *
 * @author Alexy jr
 */
public class Cuota {
    String Fecha;
    double Pago;
    double Intereses;
    double PagoAEfectuar;
    double PagoEfectuado;
    double Saldo;
    String Cliente;

    public Cuota() {
    }

    public Cuota(String Fecha, double Pago, double Intereses, double PagoAEfectuar, double PagoEfectuado, double Saldo, String Cliente) {
        this.Fecha = Fecha;
        this.Pago = Pago;
        this.Intereses = Intereses;
        this.PagoAEfectuar = PagoAEfectuar;
        this.PagoEfectuado = PagoEfectuado;
        this.Saldo = Saldo;
        this.Cliente = Cliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    public double getIntereses() {
        return Intereses;
    }

    public void setIntereses(double Intereses) {
        this.Intereses = Intereses;
    }

    public double getPagoAEfectuar() {
        return PagoAEfectuar;
    }

    public void setPagoAEfectuar(double PagoAEfectuar) {
        this.PagoAEfectuar = PagoAEfectuar;
    }

    public double getPagoEfectuado() {
        return PagoEfectuado;
    }

    public void setPagoEfectuado(double PagoEfectuado) {
        this.PagoEfectuado = PagoEfectuado;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public String toString() {
        return "Cuota{" + "Saldo=" + Saldo + ", Cliente=" + Cliente + '}';
    }
}
