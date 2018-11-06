/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.File;
import MODEL.PETA;

/**
 *
 * @author user only
 */
public class testing3 {
    public static void main(String[] args) {
        PETA test = new PETA();
        test.BacaPeta(new File("peta.dat"));
        System.out.println("Peta = ");
        System.out.println(test.getIsi());
    }
}
