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
            String hasil = "";
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
        int jumlah = 0;
        String[] data = getIsi().split("");
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals("#")) {
                jumlah = jumlah + 1;
            }
        }
        return jumlah;
    }

    public int HitungO() {
        //awal mulanya adalah 0, dikarenakan belum ada data yang dihiung
        int jumlah = 0;
        //untuk mendapatkan data yang telah ada
        String[] data = getIsi().split("");
        //perulangan sebanyak panjang data yang ada
        for (int i = 0; i < data.length; i++) {
            //percabangan jika data yang ada adalah O
            if (data[i].equals("O")) {
                //jika datanya adalah O, maka jumlahnya akan ditambah dengan1, hingga semua data O terjumlahkan.
                jumlah = jumlah + 1;
            }
        }
        return jumlah;

    }

    public int HitungDOT() {
        int jumlah = 0;
        String[] data = getIsi().split("");
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(".")) {
                jumlah = jumlah + 1;
            }
        }
        return jumlah;

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
