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
        Set<Color> colors = new HashSet<Color>();
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        System.out.println("count: "+ colors.size());
    }
}
