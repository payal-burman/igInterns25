package com.insight.threads;

public class AdvisorProgram {
 public static void main(String[] args) {
    
     Advisor advisor = new Advisor();

     String advice = advisor.getRandomAdvice();
     System.out.println("Advisor's Advice: " + advice);
 }
}
