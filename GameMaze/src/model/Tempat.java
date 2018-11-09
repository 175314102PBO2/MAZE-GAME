/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Tempat {
    private int Tinggi;
    private int Lebar;
    private ArrayList<Sel>isiTempat = new ArrayList<Sel>();

    public int getTinggi() {
        return Tinggi;
    }

    public void setTinggi(int Tinggi) {
        this.Tinggi = Tinggi;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public ArrayList<Sel> getIsiTempat() {
        return isiTempat;
    }

    public void setIsiTempat(ArrayList<Sel> isiTempat) {
        this.isiTempat = isiTempat;
    }
    public void bacaFileKonfigurasi(File file) {
        try {

            String HasilBaca = "";
            int dataInt = 0;
            FileInputStream fis = new FileInputStream(file);
            int baris = 0;

            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt == '\n') {
                    for (int i = 0; i < HasilBaca.length(); i++) {
                        Sel sel = new Sel();
                        sel.setNilai(HasilBaca.charAt(i));
                        sel.setPosisiX(baris);
                        sel.setPosisiY(i);
                        isiTempat.add(sel);
                    }
                    tinggi++;
                    baris++;
                    HasilBaca = "";
                } else {
                    HasilBaca = HasilBaca + (char) dataInt;
                    lebar++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
}
