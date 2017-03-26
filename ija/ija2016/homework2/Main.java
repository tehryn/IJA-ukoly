package ija.ija2016.homework2;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
public class Main {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(HomeWork2Test.class);
    }
}
