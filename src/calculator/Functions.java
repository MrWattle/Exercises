package calculator;

public class Functions {
    interface Operation {
        public double function (double x, double y );
    }

    class Add implements Operation{
        public double function (double x, double y ){
            return x + y;
        }
    }

    class Sub implements Operation{
        public double function (double x, double y ){
            return x - y;
        }
    }

    class Mul implements Operation{
        public double function (double x, double y ){
            return x * y;
        }
    }

    class Div implements Operation{
        public double function (double x, double y ){
            return x / y;
        }
    }

    public Operation detOfOperation (String s){
        if (s.equals("+") )
            return new Add();
        else if (s.equals("-") )
            return new Sub();
        else if (s.equals("*") )
            return new Mul();
        else if (s.equals("/") )
            return new Div();
        else
            return null;
    }

    class Priority{
    }
}
