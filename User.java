package com.example.fraps.tictactoe;

import java.util.Scanner;

/**
 * Created by fraps on 11.03.2016.
 */
public class User {
    private String User_Name;
    private int User_Go_X, User_Go_Y;
    private Scanner sc = new Scanner(System.in);

    User () {
        User_Name = "UNKNOWN";
    }

    void Set_Uname () {
        System.out.print("Enter your name: ");
        User_Name = sc.nextLine();
        System.out.println("Hey " + User_Name);
    }

    void Go_User (Game_Field Field) {
        System.out.println();
        do {
            User_Go_X = sc.nextInt();
            User_Go_Y = sc.nextInt();
        } while (Field.field[User_Go_X][User_Go_Y] != '_');
        Field.field[User_Go_X][User_Go_Y] = 'X';
    }
}