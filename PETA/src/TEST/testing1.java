/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import MODEL.PETA;

/**
 *
 * @author user only
 */
public class testing1 {

    public static void main(String[] args) {
        PETA test = new PETA();
        System.out.println(" LAPANGAN YANG AKAN DIHITUNG ");
        
        test.setIsi("######"
                + "\n#...O#"
                + "\n#..O.#"
                + "\n######");
        System.out.println("--------------------------------");
        System.out.println(""+test.getIsi());
        System.out.println("--------------------------------");
        int jumlahKress = test.HitungKress();
        System.out.println(" Jumlah Kress    = " + jumlahKress);
        int jumlahDot = test.HitungDOT();
        System.out.println(" Jumlah Dot      = "+ jumlahDot);
        int jumlahO = test.HitungO();
        System.out.println(" Jumlah O        = "+jumlahO);
        
    }
}
