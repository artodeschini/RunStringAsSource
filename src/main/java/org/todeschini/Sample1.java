package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample1 {

    /**
     * this sample show how to use sum arithmetic as a text run in Java code
     */
    public static void main(String[] args) {
        var text = "result = arg0 + arg1";

        Interpreter i = new Interpreter();


        try {
            i.set("arg0", 1);
            i.set("arg1", 2);

            var callBack = i.eval(text);
            System.out.println(callBack);

            System.out.println(i.get("result"));

        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
