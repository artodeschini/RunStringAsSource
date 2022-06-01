package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample3 {
    /**
     * this sample show how to use concatenate as a text run in Java code
     */
    public static void main(String[] args) {
        var text = "result = arg0 + arg1";

        Interpreter i = new Interpreter();


        try {
            i.set("arg0", "a");
            i.set("arg1", "b");

            var callBack = i.eval(text);
            System.out.println(callBack);

            System.out.println(i.get("result"));

        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
