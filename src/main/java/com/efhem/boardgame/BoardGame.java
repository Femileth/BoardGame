package com.efhem.boardgame;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fadegbite
 */
/**
 * BoardGame class that manages the game, players and playerTurn
 *
 */
public class BoardGame {

    static final int PLAYER_COUNT = 3;
    static final String RED = "Red";
    static final String GREEN = "Green";
    static final String BLUE = "Blue";
    static final String BLACK = "Black";

    private Player player1;
    private Player player2;
    private Player player3;
    private Player playerTurn;
    private boolean startedGame = false;
    private boolean playersReady = false;

    private int moves = 0;

    public BoardGame() {
        player1 = new Player(1, "Player 1", Color.RED);
        player2 = new Player(1, "Player 1", Color.RED);
        player3 = new Player(1, "Player 1", Color.RED);
    }

    void setPlayer1Color(String colorName) {
        player1 = new Player(1, "Player 1", fromName(colorName));
        playersReady = arePlayersReady();
    }

    void setPlayer2Color(String colorName) {
        player2 = new Player(2, "Player 2", fromName(colorName));
        playersReady = arePlayersReady();
    }

    void setPlayer3Color(String colorName) {
        player3 = new Player(3, "Player 3", fromName(colorName));
        playersReady = arePlayersReady();
    }

    public boolean arePlayerReady() {
        return playersReady;
    }

    public boolean isCurrentlyPlaying() {
        return startedGame;
    }

    public void startedGame(boolean start) {
        startedGame = start;
        playerTurn = player1;
    }

    public Player getPlayerTurn() {
        return playerTurn;
    }

    /**
     * This method sets the next player's turn based on the current playerTurn.
     * It switches the current playerTurn to the next player in the sequence: If
     * playerTurn is 1, it sets the playerTurn to player2. If playerTurn is 2,
     * it sets the playerTurn to player3. If playerTurn is any other number, it
     * sets the playerTurn back to player1.
     */
    public void setNextPlayerTurn() {
        playerTurn = switch (playerTurn.getNumber()) {
            case 1 ->
                player2;
            case 2 ->
                player3;
            default ->
                player1;
        };
    }

    /**
     * Checks if all players are ready by verifying if they are initialized and
     * have unique colors. Returns true if all players are ready, false
     * otherwise.
     */
    private Boolean arePlayersReady() {

        if (player1 == null || player2 == null || player3 == null) {
            return false;
        }

        Set<Color> selectedColor = new HashSet<>();
        selectedColor.add(player1.getColor());
        selectedColor.add(player2.getColor());
        selectedColor.add(player3.getColor());

        return selectedColor.size() == PLAYER_COUNT;
    }

    Color fromName(String colorName) {
        return switch (colorName) {
            case RED ->
                Color.RED;
            case GREEN ->
                Color.GREEN;
            case BLUE ->
                Color.BLUE;
            default ->
                Color.BLACK;
        };
    }

    public int getMoves() {
        return moves;
    }

    public void updateMoves() {
        moves++;
    }

    public void resetMoves() {
        moves = 0;
    }

}
