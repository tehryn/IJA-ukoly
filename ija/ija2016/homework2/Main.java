
package ija.ija2016.homework2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author xcisar07
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(HomeWork2Test.class);
    }
    
}
