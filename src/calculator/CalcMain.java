package calculator;

import java.io.*;
/*
    class Calculate {
        Operation op;
        double x1 , x2;
        double result;
        Calculate(double v1, String s, double v2){
            this.x1 = v1;
            this.x2 = v2;
            this.op = new DetermOfOperation(s).op;
            result = op.function ( x1, x2);
        }
    }
*/
public class CalcMain {

    class Reader{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    }

    public double calculate (double v1, String s, double v2){
        Functions f = new Functions();
        return f.detOfOperation(s).function(v1, v2);
    }

    class Priority{
    }

    public static void main(String[] args) {
        Data d = new Data(3, "+", 5);
        CalcMain calc = new CalcMain();
        System.out.println( "x1 + x2 = " + calc.calculate( d.getV1(), d.getS(), d.getV2() ) );

    }
}

