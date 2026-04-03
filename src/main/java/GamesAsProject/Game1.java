package GamesAsProject;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        int flag=0;
        int Secret=2;
        int k=0;
        int J=5;
        int num=0;
        int l=0;
        int Target = (int)(Math.random() * 1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Welcome !!! This is a Number Guessing Game 🎯\n"
                + "You have to guess the number in given 5 attempts.\n"
                + "You have a 0th attempt extra for help (only one time).\n"
                + "After that, you must put the secret code for extra attempts.\n"
                + "Thank You! Enjoy the Game 😄");

        for(int i=0;i<=100;i++){
            l++;
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("  -->>>  Guess the number ("+J+" attempts left) : ");
            num=sc.nextInt();
            if(num<Target){
                System.out.println(" -->> Your Number is Small , Try again with bigger one");
            } else if (num>Target) {
                System.out.println(" -->> Your Number is Big , Try again with smaller one ");
            }else{
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println(" -->  Congratulations !!!  , You found it in "+l+"th attempt You won , Now The Game is Over ");
                break;
            }
//                if(num==Target){
//                    break;
//                }

            J--;
            if(flag==5){
                System.out.println("_____________________________________________________________________");
                System.out.println(" --> Want 5 more attempts , put secret code :  ");
                k = sc.nextInt();
                if(k==Secret){
                    J=5;
                    flag=0;
                    Secret*=2;
                }else{
                    System.out.println(" -->  Oops you don't have any attempts left , you lost , Thanks for playing ");
                    break;}
            }
            flag++;



        }
        if(flag==5){ System.out.println(" -->>>>>>>> "+Target+" was the number  !!! ");}
    }
}
