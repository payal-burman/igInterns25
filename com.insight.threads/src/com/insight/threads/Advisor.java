package com.insight.threads;

public class Advisor {

 private String[] advices = {
     "Never begin to stop and never stop to begin.",
     "Only destination isn’t important, one should enjoy the journey.",
     "Impossible itself says ‘I’m possible’.",
     "The best way to predict the future is to create it.",
     "Success is not the key to happiness. Happiness is the key to success.",
     "Don’t watch the clock; do what it does. Keep going.",
     "Believe in yourself and all that you are.",
     "Don’t limit your challenges, challenge your limits.",
     "The harder you work for something, the greater you’ll feel when you achieve it."
 };

 public String getRandomAdvice() {
 
     int randomIndex = (int) (Math.random() * advices.length);
     return advices[randomIndex];
 }
}
