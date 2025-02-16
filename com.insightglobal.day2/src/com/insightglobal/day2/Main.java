package com.insightglobal.day2;


public class Main {
 public static void main(String[] args) {
    
     Instrument[] instruments = new Instrument[10];
     
     instruments[0] = new Piano();
     instruments[1] = new Flute();
     instruments[2] = new Guitar();
     instruments[3] = new Piano();
     instruments[4] = new Guitar();
     instruments[5] = new Flute();
     instruments[6] = new Piano();
     instruments[7] = new Guitar();
     instruments[8] = new Flute();
     instruments[9] = new Piano();
     
     for (int i = 0; i < instruments.length; i++) {
         System.out.print("Instrument at index " + i + ": ");
         instruments[i].play();  
     }
     
     for (int i = 0; i < instruments.length; i++) {
         if (instruments[i] instanceof Piano) {
             System.out.println("Instrument at index " + i + " is a Piano.");
         } else if (instruments[i] instanceof Flute) {
             System.out.println("Instrument at index " + i + " is a Flute.");
         } else if (instruments[i] instanceof Guitar) {
             System.out.println("Instrument at index " + i + " is a Guitar.");
         }
     }
 }
}
