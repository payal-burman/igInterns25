package com.insight.threads;

public class ConferenceRoomBookingJob {
 private boolean roomAvailable = true; 

 private final Object lock = new Object();

 public boolean checkAvailability() {
     synchronized (lock) {
         return roomAvailable;
     }
 }


 public boolean bookRoom() {
     synchronized (lock) {
         if (roomAvailable) {
             roomAvailable = false;
             return true;
         }
         return false;
     }
 }

 public void releaseRoom() {
     synchronized (lock) {
         roomAvailable = true;
     }
 }
}
