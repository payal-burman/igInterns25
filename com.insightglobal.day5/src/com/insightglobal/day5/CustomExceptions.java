package com.insightglobal.day5;

//CustomExceptions.java

//StackFullException class
class StackFullException extends Exception {
 public StackFullException(String message) {
     super(message);
 }
}

//StackEmptyException class
class StackEmptyException extends Exception {
 public StackEmptyException(String message) {
     super(message);
 }
}

//InvalidContactException class
class InvalidContactException extends Exception {
 public InvalidContactException(String message) {
     super(message);
 }
}
