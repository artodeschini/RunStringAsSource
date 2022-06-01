package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample6 {

    /**
     * this sample show how to handling exception as a text run in Java code
     */
    public static void main(String[] args) {
        var script = new StringBuilder()
                .append(" try {")
                .append("   sample =  1/arg0; ")
                .append(" } catch (e) {")
                .append("   print(e); ")
                .append("}");

        Interpreter i = new Interpreter();

        try {
            i.set("arg0", 0); // set 0 throws ArithmeticException
            i.eval(script.toString());

        } catch (
                EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
