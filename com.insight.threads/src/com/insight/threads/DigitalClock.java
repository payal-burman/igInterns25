package com.insight.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends Thread {

 public void displayTime() {
   
     SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
     String currentTime = formatter.format(new Date());
  
     System.out.print("\r" + currentTime); 
 }

 @Override
 public void run() {
     try {
         while (true) {
          
             displayTime();
             
             Thread.sleep(500);
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}
