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
 * @author jarkom
 */
public class testing2 {
    public static void main(String[] args) {
        PETA test = new PETA();
        test.setIsi("######"
                + "\n#...O#"
                + "\n#..O.#"
                + "\n######");
        test.simpanKeFile(new File("PETA.txt"));
    }
}
