/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.efhem.boardgame;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fadegbite
 */
//8x8 game board
// won when any player has selected 4 adjacent cells in a straight line
//Initially have all the cells on the board disabled
//Start game buttons should enable cells when all player have a unique color
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
    
    
    public boolean arePlayerReady(){
        return playersReady;
    }
    
    public boolean isCurrentlyPlaying(){
        return startedGame;
    }
    
    public void startedGame(boolean start){
        startedGame = start;
        playerTurn = player1;
    }
    
    public Player getPlayerTurn() {
        return playerTurn;
    }
    
    public void setNextPlayerTurn() {
        playerTurn = switch (playerTurn.getNumber()) {
            case 1 -> player2;
            case 2 -> player3;
            default -> player1;
        };
        System.out.println("Set next player");
        System.out.println(playerTurn);
    }
    
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
    
    Color fromName(String colorName){
        return switch (colorName) {
            case RED -> Color.RED;
            case GREEN -> Color.GREEN;
            case BLUE -> Color.BLUE;
            default -> Color.BLACK;
        };
    }

    public void findPlayerName() {        
        
    }

}
