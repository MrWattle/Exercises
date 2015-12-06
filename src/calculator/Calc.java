/*               Smple Calculator
        ------------------------------------
        Calc reads an expressions such as:
        x (OP) -x (OP) x.x (OP) .xe+x (OP) .xE-x (OP) xEx  ,
        where: "x" is one or more digits;
        "(OP)" - one of the next operations "+" "-" "/" "*" "%":
        "e" or "E" - exponential representation of the number.
        Always use a WHITESPACE between numbers and operators
*/

package calculator;

import java.io.*;
import java.util.ArrayList;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String[] arrayS;
        ArrayList<Float> values = new ArrayList<>();
        ArrayList<Character> operations = new ArrayList<>();
        while ((s = stdin.readLine()) != null  &&  s.length()!= 0 ) {

            arrayS = s.split(" ");
            for (String str : arrayS ) {
                //обрабатывает значени€ вида х/-х/х.х/.хе+х/.х≈-х/xEx, где х цыфры
                if ( str.matches("^-?[0-9]*[.]?[0-9]+[eE]?[+-]?[0-9]*$") )
                    values.add(Float.valueOf(str));
                else if ( str.matches("[-+*/%]{1}") )
                    operations.add(str.charAt(0));
                else {
                    System.err.println("Another symbol");
                    System.exit(1);
                }
            }
            System.out.println("\t = " +calculate(values, operations) );
            values.clear();
        }
    }
    private static float calculate (ArrayList<Float> val, ArrayList<Character> op) {
        for (int i = 0; i < op.size() ; i++) {
            if ( (op.get(i) == '*') || (op.get(i) == '/') || (op.get(i) == '%')  ) {
                val.set(i, basisOperations(val.get(i), val.get(i + 1), op.get(i)));
                val.remove(i+1);
                op.remove(i);
                i--;
            }
        }
        while ( op.size()!= 0 ){
            val.set( 0, basisOperations(val.get(0), val.get(1), op.get(0)) ) ;
            val.remove(1);
            op.remove(0);
        }
        return val.get(0);

    }
    private static float basisOperations (float v1, float v2, char op){
        float result = 0;
        switch (op) {
            case '*': result = v1 * v2;
                break;
            case '/': result = v1 / v2;
                break;
            case '+': result = v1 + v2;
                break;
            case '-': result = v1 - v2;
                break;
            case '%': result = v1 % v2;
                break;
            default: break;
        }
        return result;
    }
}
