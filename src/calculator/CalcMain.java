package calculator;

//import java.io.*;
import java.util.*;

public class CalcMain {

    class ReadAndSeparete {
    }

    public double calculate (Data d){
        Functions f = new Functions();
        return f.detOfOperation(d.getS()).function(d.getV1(), d.getV2());
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNext()) {
            Data d = new Data(stdin.nextDouble(), stdin.next(), stdin.nextDouble());
            CalcMain calc = new CalcMain();
            System.out.println("    = " + calc.calculate(d));
        }
        stdin.close();

    }
}

