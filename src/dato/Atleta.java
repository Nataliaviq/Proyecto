/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nat22
 */
public class Atleta extends Persona{

    private String fileName = "ciclista.dat";

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    private String id;
    private String nivel;

    public Atleta(String pid,String nom,String ap,String sex,String ed,String fn, String pnivel) {

        super(pid, nom, ap, sex, ed, fn);
        this.setId(pid);
        this.setNivel(pnivel);

    }

    public Boolean existencia() {
        File file = new File(fileName);

        return file.exists();
    }

    public void addCiclista() {
        try {
            
            
            
        } catch (Exception e) {
            
            
        }
    }

    public void writeFile(String cadena) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(cadena);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public String readFile() throws IOException {
        String line = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));

            while ((line = reader.readLine()) != null) {
                line += reader.readLine();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {

            reader.close();

        }

        return line;
    }

    public Boolean versiesnumero(String valor) {

        try {
            Integer.parseInt(valor);
            return true;

        } catch (Exception e) {

            return false;

        }
    }

    public void buscardatos() {
        try {
        } catch (Exception e) {
        }
    }

    public Boolean versiesfecha(String valor) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            format.parse(valor);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
