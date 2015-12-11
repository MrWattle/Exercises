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

    public Operation detOfOperation (String s){
        if (s.equals("+") )
            return new Add();
        else
            return null;
    }
}

/*
    class DetermOfOperation{
        String s;
        Operation op;
        DetermOfOperation (String s){
            this.s = s;
            if (s.equals("+") )
                op = new Add();
        }
    }
*/