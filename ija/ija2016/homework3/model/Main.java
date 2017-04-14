package ija.ija2016.homework3.model;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
// javac ija/ija2016/homework2/HomeWork2Test.java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ija.ija2016.homework2.HomeWork2Test
public class Main {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(HomeWork2Test.class);
    }
}
