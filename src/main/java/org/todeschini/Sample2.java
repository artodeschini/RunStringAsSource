package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample2 {

    public static void main(String[] args) {
        var script = new StringBuilder()
                .append(" int addMethod(a, b) {")
                .append("       return a + b; ")
                .append("}")
                .append("sum = addMethod(arg0, arg1);");

        Interpreter i = new Interpreter();

        try {
            i.set("arg0", 1);
            i.set("arg1", 2);

            var callBack = i.eval(script.toString());
            System.out.println(callBack);

            System.out.println(i.get("sum"));

        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
