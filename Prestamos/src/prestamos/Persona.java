/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.util.ArrayList;

/**
 *
 * @author Alexy jr
 */
public class Persona {
    String Nombre;
    int Monto;
    int Meses;
    ArrayList <Integer> Pagos= new ArrayList();

    public Persona() {
    }

    public Persona(String Nombre, int Monto, int Meses) {
        this.Nombre = Nombre;
        this.Monto = Monto;
        this.Meses = Meses;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int Meses) {
        this.Meses = Meses;
    }

    public ArrayList<Integer> getPagos() {
        return Pagos;
    }

    public void setPagos(ArrayList<Integer> Pagos) {
        this.Pagos = Pagos;
    }

    @Override
    public String toString() {
        return Nombre;
    }

    
}
