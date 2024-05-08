package Play;

import java.util.Random;
import java.util.Scanner;
public class Computer{
    Scanner input=new Scanner(System.in);
    Random rnd=new Random();
    private String player;
    private String computer="com";
    String[][] board=new String[3][3];

    public void setPlayer(String p) {
        player = p;
    }
    //for the person
    public void choice1(){
        System.out.println("row=1-3 / column=1-3");
        System.out.println("Enter your choice:");
        int row1=input.nextInt();
        int column1=input.nextInt();
        check1(row1,column1);
    }
    //for computer
    public void choice2(){
        //Formula baray zamani ke max , min daraim = rnd.nextInt(max-min+1)+min
        int row2=rnd.nextInt(3-1+1)+1;
        int column2=rnd.nextInt(3-1+1)+1;
        System.out.println("Choose a computer:"+row2+" "+column2);
        check2(row2,column2);
    }
    public void check1(int r1,int c1){
        if(board[r1-1][c1-1]==player||board[r1-1][c1-1]==computer) {
            System.out.println("not available");
            choice1();
        }
        else{
            board[r1-1][c1-1]=player;
            if(win1()==true)
                System.out.println("The player won!!!");
            else
                choice2();
        }
    }
    public void check2(int r2,int c2){
        if(board[r2-1][c2-1]==player||board[r2-1][c2-1]==computer){
            System.out.println("not available");
            choice2();
        }
        else{
            board[r2-1][c2-1]=computer;
            if(win2()==true)
                System.out.println("The computer won!!!");
            else
                choice1();
        }
    }
    public boolean win1(){
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
                ||(board[0][0] == player && board[0][1] == player && board[0][2] == player)
                ||(board[0][0]==player&&board[1][0]==player&&board[2][0]==player)
                ||(board[1][0]==player&&board[1][1]==player&&board[1][2]==player)
                ||(board[2][0]==player&&board[2][1]==player&&board[2][2]==player)
                ||(board[2][0]==player&&board[1][1]==player&&board[0][2]==player)
                ||(board[0][1]==player&&board[1][1]==player&&board[2][1]==player)
                ||(board[0][2]==player&&board[1][2]==player&&board[2][2]==player))
            return true;
        return false;
    }
    public boolean win2(){
        if ((board[0][0] == computer && board[1][1] == computer && board[2][2] == computer)
                ||(board[0][0] == computer && board[0][1] == computer && board[0][2] == computer)
                ||(board[0][0]==computer&&board[1][0]==computer&&board[2][0]==computer)
                ||(board[1][0]==computer&&board[1][1]==computer&&board[1][2]==computer)
                ||(board[2][0]==computer&&board[2][1]==computer&&board[2][2]==computer)
                ||(board[2][0]==computer&&board[1][1]==computer&&board[0][2]==computer)
                ||(board[0][1]==computer&&board[1][1]==computer&&board[2][1]==computer)
                ||(board[0][2]==computer&&board[1][2]==computer&&board[2][2]==computer))
            return true;
        else
            return false;
    }
}
