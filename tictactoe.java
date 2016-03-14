package com.example.fraps.tictactoe;

/**
 * Created by fraps on 11.03.2016.
 */

public class tictactoe {
    public static void main(String[] args) {

        Game_Field GameField = new Game_Field();
        User User1 = new User();
        Computer Comp = new Computer();

        GameField.Rules();
        User1.Set_Uname();
        Comp.Show();

        do{
            Comp.Go_Comp(GameField);
            GameField.Show_Game_Field();
            GameField.Chek_Win();
            if(GameField.Show_Game_Status()) {
                System.out.println("Droid, win!");
                break;
            }
            if(GameField.Chek_Empty_Space_on_Field())
                break;


            User1.Go_User(GameField);
            GameField.Show_Game_Field();
            GameField.Chek_Win();
            if(GameField.Show_Game_Status()) {
                System.out.println("WELL, i win!");
                break;
            }
            if(GameField.Chek_Empty_Space_on_Field())
                break;

        }while(true);


    }
}

