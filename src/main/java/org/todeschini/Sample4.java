package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample4 {

    /**
     * this sample show how to use for loop and if as a text run in Java code
     */
    public static void main(String[] args) {


        var script = new StringBuilder()
                .append(" result = 0; ")
                .append(" for (i = 0; i < 10; i++) {")
                .append("    result += i;")
                .append("    if (debug) {")
                .append("       print(result);")
                .append("    }")
                .append(" }") // end for loop
                .append("return result;");

        Interpreter i = new Interpreter();


        try {
            i.set("debug", true);

            var callBack = i.eval(script.toString()); // will return null if your code return any
            System.out.println(callBack);

            System.out.println(i.get("result"));

        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
