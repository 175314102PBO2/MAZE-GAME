/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class PETA {

    private String isi;
    private int tinggi;
    private int lebar;

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void BacaPeta(File file) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            String hasil = ".";
            int dataInt;
            while ((dataInt = fis.read()) != -1) {
                hasil = hasil + (char) dataInt;
            }
            setIsi(hasil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PETA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PETA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void HitungTinggi() {
        int hitung;
        hitung = HitungDOT() + HitungKress() + HitungO();
    }

    public void HitungLebar() {

    }

    public int HitungKress() {
        return isi.split("#").length;
    }

    public int HitungO() {
        return isi.split("O").length;

    }

    public int HitungDOT() {
        return isi.split(".").length;

    }

    public void simpanKeFile(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            String data = this.getIsi();
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PETA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PETA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
