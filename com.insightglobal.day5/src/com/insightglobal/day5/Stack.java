package com.insightglobal.day5;

public class Stack {

    private Contact[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new Contact[capacity];
        this.top = -1;
    }

    public void push(Contact contact) throws StackFullException, InvalidContactException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full. Cannot push more contacts.");
        }
        if (contact == null || !contact.isValid()) {
            throw new InvalidContactException("Contact validation failed. Cannot push invalid contact.");
        }
        stackArray[++top] = contact;
        System.out.println("Contact pushed: " + contact);
    }

    public Contact pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty. Cannot pop contacts.");
        }
        Contact poppedContact = stackArray[top--];
        System.out.println("Contact popped: " + poppedContact);
        return poppedContact;
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }
}
