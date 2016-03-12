package com.example.fraps.tictactoe;

import java.util.Random;

/**
 * Created by fraps on 11.03.2016.
 */
public class Computer {
    private String Comp_Name;
    private int Comp_Go_X, Comp_Go_Y;
    Random r = new Random();

    Computer () {
        Comp_Name = "I am Droid";
    }

    void Show () {
        System.out.println(Comp_Name);
    }

    void Go_Comp (Game_Field Field) {
        do {
            Comp_Go_X = r.nextInt(3);
            Comp_Go_Y = r.nextInt(3);
        } while(Field.field[Comp_Go_X][Comp_Go_Y] != '_');
        Field.field[Comp_Go_X][Comp_Go_Y] = 'O';
    }

}
