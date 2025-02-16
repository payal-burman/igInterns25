package com.insightglobal.day5;

import com.insightglobal.day5.Activity;
import com.insightglobal.day5.OperatorException;

public class Source {

    public static void main(String[] args) {
        Activity activity = new Activity("Hello", "Welcome", "+");
        Source source = new Source();

        try {
            if (!source.validate(activity)) {
                throw new OperatorException("Invalid parameters");
            }

            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (OperatorException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    public boolean validate(Activity activity) throws OperatorException {
       
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("String1, String2 or Operator is null.");
        }

        String operator = activity.getOperator();
        if (!operator.equals("+") && !operator.equals("-")) {
            throw new OperatorException("Operator must be either '+' or '-'.");
        }

        return true; 
    }


    public String doOperation(Activity activity) {
        String string1 = activity.getString1();
        String string2 = activity.getString2();
        String operator = activity.getOperator();

        if (operator.equals("+")) {
            return string1 + string2;
        } else if (operator.equals("-")) {
            
            return string1.replaceAll("[" + string2 + "]", "");
        }
        return null;
    }
}
