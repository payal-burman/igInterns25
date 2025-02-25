package com.insight.threads;

public class ConferenceRoomBookingSystem {
 public static void main(String[] args) {
    
     ConferenceRoomBookingJob conferenceRoomBookingJob = new ConferenceRoomBookingJob();

     Manager manager1 = new Manager("Manager 1", conferenceRoomBookingJob);
     Manager manager2 = new Manager("Manager 2", conferenceRoomBookingJob);

     manager1.start();
     manager2.start();

     try {
         manager1.join();
         manager2.join();
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
     }

     System.out.println("All meetings are completed.");
 }
}
