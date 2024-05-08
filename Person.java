package Play;

import java.util.Scanner;
public class Person{
    Scanner input=new Scanner(System.in);
    private String player1;
    private String player2;
    String[][] board=new String[3][3];
    public void setPlayer1(String p1) {
        player1=p1;
    }
    public void setPlayer2(String p2) {
        player2 = p2;
    }
    public void choice1(){
        System.out.println("row=1-3 / column=1-3");
        System.out.println("Enter The first player's choice:");
        int row1=input.nextInt();
        int column1=input.nextInt();
        check1(row1,column1);
    }
    public void choice2(){
        System.out.println("row=1-3 / column=1-3");
        System.out.println("Enter The second player's choice:");
        int row2=input.nextInt();
        int column2=input.nextInt();
        check2(row2,column2);
    }
    public void check1(int r1,int c1){
        if(board[r1-1][c1-1]==player1||board[r1-1][c1-1]==player2) {
            System.out.println("not available");
            choice1();
        }
            else{
                board[r1-1][c1-1]=player1;
                if(win1()==true)
                System.out.println("The first player wins!!!");
                else
                choice2();
            }
    }
    public void check2(int r2,int c2){
        if(board[r2-1][c2-1]==player1||board[r2-1][c2-1]==player2){
            System.out.println("not available");
            choice2();
        }
        else{
            board[r2-1][c2-1]=player2;
            if(win2()==true)
                System.out.println("The second player wins!!!");
            else
                choice1();
        }
    }
    public boolean win1(){
        if ((board[0][0] == player1 && board[1][1] == player1 && board[2][2] == player1)
                ||(board[0][0] == player1 && board[0][1] == player1 && board[0][2] == player1)
                ||(board[0][0]==player1&&board[1][0]==player1&&board[2][0]==player1)
                ||(board[1][0]==player1&&board[1][1]==player1&&board[1][2]==player1)
                ||(board[2][0]==player1&&board[2][1]==player1&&board[2][2]==player1)
                ||(board[2][0]==player1&&board[1][1]==player1&&board[0][2]==player1)
                ||(board[0][1]==player1&&board[1][1]==player1&&board[2][1]==player1)
                ||(board[0][2]==player1&&board[1][2]==player1&&board[2][2]==player1))
            return true;
        return false;
        }
    public boolean win2(){
        if ((board[0][0] == player2 && board[1][1] == player2 && board[2][2] == player2)
                ||(board[0][0] == player2 && board[0][1] == player2 && board[0][2] == player2)
                ||(board[0][0]==player2&&board[1][0]==player2&&board[2][0]==player2)
                ||(board[1][0]==player2&&board[1][1]==player2&&board[1][2]==player2)
                ||(board[2][0]==player2&&board[2][1]==player2&&board[2][2]==player2)
                ||(board[2][0]==player2&&board[1][1]==player2&&board[0][2]==player2)
                ||(board[0][1]==player2&&board[1][1]==player2&&board[2][1]==player2)
                ||(board[0][2]==player2&&board[1][2]==player2&&board[2][2]==player2))
            return true;
        else
            return false;
    }
}