package org.todeschini;

import bsh.EvalError;
import bsh.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class Sample8 {

    public static void main(String[] args) {
        try {
            Sample8 s = new Sample8();
            var i = new Interpreter();

            var source = readFromInputStream(Sample8.class.getClassLoader().getResourceAsStream("myScript.bsh"));
            var target = i.eval(source);

            System.out.println(target);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EvalError evalError) {
            evalError.printStackTrace();
        }
    }

    public static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder out = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.append(line);
            }
        }

        return out.toString();
    }
}
