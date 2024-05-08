package Main;

import Play.Computer;
import Play.Person;

import java.util.Scanner;
public class Main{
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        switch(Enter()){
            case 1:
                Person per=new Person();
                System.out.println("Enter the symbol of player 1:");
                String p1=input.nextLine();
                per.setPlayer1(p1);
                System.out.println("Enter the symbol of player2:");
                String p2=input.nextLine();
                per.setPlayer2(p2);
                outer : do{
                    per.choice1();
                    if(per.win1()==true)
                        break outer;
                    per.choice2();
                    if(per.win2()==true)
                        break outer;
                }while(per.win1()==false|| per.win2()==false);
                System.out.println("Finish!!!");
                break;
            case 2:
                Computer com=new Computer();
                System.out.println("Enter the symbol of player:");
                String p=input.nextLine();
                com.setPlayer(p);
                inner : do{
                    com.choice1();
                    if(com.win1()==true)
                        break inner;
                    com.choice2();
                    if(com.win2()==true)
                        break inner;
                }while(com.win1()==false|| com.win2()==false);
                System.out.println("Finish!!!");
                break;
            case 3:
                System.out.println("GoodBye!!!");
        }
    }
    static int Enter(){
        System.out.println("1:Play with person / 2:Play with computer / 3:Exit");
        System.out.println("Enter a game model :");
        int play=scanner.nextInt();
        return play;
    }
}