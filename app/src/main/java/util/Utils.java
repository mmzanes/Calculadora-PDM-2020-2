package util;

import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Utils {
    public static String calculator(String s) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        Object result = null;
        if (Pattern.matches("([-+]?[0-9]*\\.?[0-9]+[\\/\\+\\-\\*])+([-+]?[0-9]*\\.?[0-9]+)", s)) {
            try {
                result = engine.eval(s);
                return result.toString();
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        } else if (Pattern.matches("[0-9]\\^[0-9]", s)) {
           try {
               result = Math.pow(Double.parseDouble(s.split("\\^")[0]), Double.parseDouble(s.split("\\^")[1]));
               return result.toString();
           } catch (Exception e){
               e.printStackTrace();
           }
        }
        return "ERROR";
    }

    public static String sqrt(String s) {
        Object result = null;
        try {
            result =Math.sqrt(Double.parseDouble(s));
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    }