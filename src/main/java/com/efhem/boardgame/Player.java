package com.efhem.boardgame;

import java.awt.Color;

/**
 *
 * @author fadegbite
 */
public class Player {

    private int number;
    private String name;
    private Color color;

    public Player(int number, String name, Color color) {
        this.number = number;
        this.name = name;
        this.color = color;
    }

    Color getColor() {
        return color;
    }

    String getName() {
        return name;
    }
    
    int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "number: " + number +"\n" + 
            "name: " + name + "\n" + 
            "color: " + color.toString() + "\n";
    }
   
}
