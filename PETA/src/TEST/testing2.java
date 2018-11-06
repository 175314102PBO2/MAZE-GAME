/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.File;
import java.io.IOException;
import MODEL.PETA;

/**
 *
 * @author user only
 */
public class testing2 {
    public static void main(String[] args)  {
        PETA test = new PETA();
        test.setIsi("@@#@##@#@#");
        test.simpanKeFile(new File("dok.dat"));
    }
}
