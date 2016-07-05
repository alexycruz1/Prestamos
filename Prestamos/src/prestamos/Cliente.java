/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexy jr
 */
public class Cliente {
    String Nombre;
    String TipoPrestamo;
    double ValorPrestamo;
    double TasaInteres;
    int Tiempo;
    String FechaSolicitud;
    ArrayList <Cuota> Cuotas = new ArrayList();

    public Cliente() {
    }

    public Cliente(String Nombre, String TipoPrestamo, double ValorPrestamo, double TasaInteres, int Tiempo, String FechaSolicitud) {
        this.Nombre = Nombre;
        this.TipoPrestamo = TipoPrestamo;
        this.ValorPrestamo = ValorPrestamo;
        this.TasaInteres = TasaInteres;
        this.Tiempo = Tiempo;
        this.FechaSolicitud = FechaSolicitud;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoPrestamo() {
        return TipoPrestamo;
    }

    public void setTipoPrestamo(String TipoPrestamo) {
        this.TipoPrestamo = TipoPrestamo;
    }

    public double getValorPrestamo() {
        return ValorPrestamo;
    }

    public void setValorPrestamo(double ValorPrestamo) {
        this.ValorPrestamo = ValorPrestamo;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(String FechaSolicitud) {
        this.FechaSolicitud = FechaSolicitud;
    }

    public ArrayList<Cuota> getCuotas() {
        return Cuotas;
    }

    public void setCuotas(ArrayList<Cuota> Cuotas) {
        this.Cuotas = Cuotas;
    }

    @Override
    public String toString() {
        return Nombre;
    }  
}
