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
public class TestClass {
 
    public static void main(String[] args) {
        char[][] table = new char[8][8];
        // Initialize table with some characters

        // Search diagonally from top-left to bottom-right
        System.out.println("Diagonal search from top-left to bottom-right:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int row = i;
                int col = j;
                while (row < 8 && col < 8) {
                    System.out.print(table[row][col] + " ");
                    row++;
                    col++;
                }
                System.out.println();
            }
        }

        // Search diagonally from top-right to bottom-left
        System.out.println("\nDiagonal search from top-right to bottom-left:");
        for (int i = 0; i < 8; i++) {
            for (int j = 7; j >= 0; j--) {
                int row = i;
                int col = j;
                while (row < 8 && col >= 0) {
                    System.out.print(table[row][col] + " ");
                    row++;
                    col--;
                }
                System.out.println();
            }
        }
    }
}
