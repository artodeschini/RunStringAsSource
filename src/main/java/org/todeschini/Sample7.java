package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample7 {

    /**
     * this sample show how to set get and unset variable a text run in Java code
     */
    public static void main(String[] args) {
        Interpreter i = new Interpreter();


        try {
            i.eval("myObject = object(); ");

            i.set("myObject.attribute1", 0); // set 0 in attribute
            i.set("myObject.attribute2", new int[3]); // set int[] in attribute2

            i.set("myObject.attribute2[0]", 1);
            i.set("myObject.attribute2[1]", 2);
            i.set("myObject.attribute2[2]", 3);

            System.out.println(i.get("myObject.attribute1"));

            System.out.println(i.get("myObject.attribute2[0]"));
            System.out.println(i.get("myObject.attribute2[1]"));
            System.out.println(i.get("myObject.attribute2[2]"));

            i.eval("a = 5");

            i.unset("a"); //this is same is set a = null

            System.out.println(i.get("a"));


        } catch (
                EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}

