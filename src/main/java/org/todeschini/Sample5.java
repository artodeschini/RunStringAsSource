package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

public class Sample5 {

    /**
     * this sample show how to work Date as a text run in Java code
     */
    public static void main(String[] args) {
        var script = new StringBuilder()
                .append(" data = new Date();")
                .append(" cal = Calendar.getInstance();")
                .append(" cal.setTime(data); ")
                .append(" cal.add(Calendar.DATE, 1); ")
                .append(" data = cal.getTime(); ")
                .append(" return data;");


        Interpreter i = new Interpreter();


        try {

            var callBack = i.eval(script.toString()); // will return null if your code return any
            System.out.println(callBack);

            System.out.println(i.get("data"));

        } catch (
                EvalError evalError) {
            evalError.printStackTrace();
        }
    }
}
