package com.insight.threads;

public class Manager extends Thread {
 private final String name;
 private final ConferenceRoomBookingJob bookingJob;

 public Manager(String name, ConferenceRoomBookingJob bookingJob) {
     this.name = name;
     this.bookingJob = bookingJob;
 }

 @Override
 public void run() {
     System.out.println(name + " is checking room availability.");
     

     if (bookingJob.checkAvailability()) {
         System.out.println(name + " found the room available.");
       
         if (bookingJob.bookRoom()) {
             System.out.println(name + " has booked the room and is conducting the meeting.");
         
             try {
                 Thread.sleep(3000); 
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
             
             System.out.println(name + " has finished the meeting.");
             
            
             bookingJob.releaseRoom();
         }
     } else {
         System.out.println(name + " found the room is already booked.");
     }
 }
}
