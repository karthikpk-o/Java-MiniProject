package com.itsallbinary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolveMath {

    public static String sol_math(String userInput)
    {
        Pattern p = Pattern.compile("([0-9]+)\\s*([+\\-*/])\\s*([0-9]+)");
        Matcher m = p.matcher(userInput);
        String answer = "";
        if (m.find()) {
            int num1 = Integer.parseInt(m.group(1));
            int num2 = Integer.parseInt(m.group(3));
            String operator = m.group(2);
            switch (operator) {
                case "+":
                    answer = answer + "The result is " + (num1 + num2);
                    break;
                case "-":
                    answer = answer + "The result is " + (num1 - num2);
                    break;
                case "*":
                    answer = answer + "The result is " + (num1 * num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        answer = answer + "The result is " + ((double) num1 / num2);
                        break;
                    } else {
                        answer = answer + "Division by zero is not allowed.";
                        break;
                    }
            }
        }
        return answer;
    }
}
