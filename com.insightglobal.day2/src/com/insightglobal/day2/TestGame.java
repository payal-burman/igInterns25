package com.insightglobal.day2;

public class TestGame {
    public static void main(String[] args) {
        
        Game[] games = new Game[5];
        games[0] = new Cricket();
        games[1] = new Football();
        games[2] = new Tennis();
        games[3] = new Cricket();
        games[4] = new Football();

        for (Game game : games) {
            game.displayInfo();
        }
    }
}
