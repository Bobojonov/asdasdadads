package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class validmathematicalexpression {

    static class FastReader {
        BufferedReader reader;

        FastReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextLine() {
            String line = "";
            try {
                line = reader.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            return line;
        }
    }
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        String expression = reader.nextLine();

        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(expression);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
