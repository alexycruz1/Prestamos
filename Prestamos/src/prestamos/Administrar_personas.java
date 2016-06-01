/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexy jr
 */
public class Administrar_personas {

    private ArrayList<Persona> Lista_Personas = new ArrayList();
    private File Archivo = null;

    public Administrar_personas(String path) {
        Archivo = new File(path);
    }

    public File getArchivo() {
        return Archivo;
    }

    public ArrayList<Persona> getLista_Personas() {
        return Lista_Personas;
    }

    public void setLista_Personas(ArrayList<Persona> Lista_Personas) {
        this.Lista_Personas = Lista_Personas;
    }

    @Override
    public String toString() {
        return Lista_Personas + "";
    }

    //examinar
    public void setPersona(Persona p) {
        this.Lista_Personas.add(p);
    }

    //metodos de administracion
    public void EscribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);

            for (Persona t : Lista_Personas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getMonto()+ ";");
                bw.write(t.getMeses()+ ";");
            }
            bw.flush();
        } catch (Exception e) {

        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {

            }
        }
    }

    public void CargarArchivo() {
        Scanner sc = null;
        Lista_Personas = new ArrayList();

        try {
            sc = new Scanner(Archivo);
            sc.useDelimiter(";");

            while (sc.hasNext()) {
                Lista_Personas.add(new Persona(sc.next(), sc.nextInt(), sc.nextInt()));
            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }
    }
}
