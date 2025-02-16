package com.insightglobal.day2;

public class Game {
    
    public void displayInfo() {
        System.out.println("This is a game.");
    }
}

class Cricket extends Game {
    @Override
    public void displayInfo() {
        System.out.println("Cricket is played by 11 players.");
    }
}

class Football extends Game {
    @Override
    public void displayInfo() {
        System.out.println("Football is a best sport");
    }
}

class Tennis extends Game {
    @Override
    public void displayInfo() {
        System.out.println("Tennis is a sport played between two players.");
    }
}


