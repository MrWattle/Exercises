package calculator;

interface Operation {
    public double function (double x, double y );
}

class Add implements Operation{
    public double function (double x, double y ){
        return x + y;
    }
}

class Reader{
}

class Data{
}

class DetermOfOperation{
    String s;
    Operation op;
    DetermOfOperation (String s){
        this.s = s;
        if (s.equals("+") )
            op = new Add();
    }

}

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

public class CalcMain {
    public static void main(String[] args) {
        double x1=3, x2=5;
        String s = "+";
        Calculate calc = new Calculate(x1, s, x2);
        System.out.println("x1 + x2 = " + calc.result );

    }
}

