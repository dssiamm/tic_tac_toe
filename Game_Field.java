package com.example.fraps.tictactoe;

/**
 * Created by fraps on 11.03.2016.
 */
public class Game_Field {
    private int x = 3;
    private int y = 3;
    private boolean Game_over;
    char[][] field = new char[x][y];

    Game_Field () {
        Game_over = false;
        for (int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                field[i][j]='_';
            }
    }

    void Show_Game_Field () {
        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                System.out.print(field[i][j]);
                System.out.print(' ');
            }
        }
        System.out.println();
    }

    void Rules () {
        System.out.println("Game rules");
    }

    boolean Chek_Empty_Space_on_Field () {
        int index = 0;
        for (int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                if (field[i][j] != '_')
                    index++;
            }
        if(index == 9)
            Game_over = true;
        return Game_over;
    }

    void Chek_Win () {
        for (int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                if(field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != '_') {
                    Game_over = true;
                    break;
                }
                if(field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != '_') {
                    Game_over = true;
                    break;
                }
                if(field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != '_') {
                    Game_over = true;
                    break;
                }
                if(field[2][0] == field[1][1] && field[1][1] == field[0][2] && field[0][2] != '_') {
                    Game_over = true;
                    break;
                }
            }
    }

    boolean Show_Game_Status() {
        return Game_over;
    }
}