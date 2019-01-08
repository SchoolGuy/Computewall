package main;

import main.view.NumberWallTerminalGame;

/**
 * Main entry point for the application.
 */
public class Main {
    public static void main (String[] args) {
        NumberWallTerminalGame terminalGame = new NumberWallTerminalGame();
        terminalGame.startGame();
        terminalGame.printSolution();
    }
}
