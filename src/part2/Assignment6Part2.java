
package part2;
import java.util.Scanner;

    public class Assignment6Part2 {
        static Scanner cin = new Scanner(System.in); //scanner initialization
        public static int magicNumber(){
            int a= (int)(Math.random() * 20 + 1);//This command generates a double-precision number between 0.0 and 1.0
                                //We multiply the number by 20 and convert it to an integer.
        return a;
        };
        public static int getUserInput(){
            int a;

            do {
                a = cin.nextInt();
                if (a <= 0||a>20) {
                    System.out.println("Only between 1 and 20!!! Try again!");
                }
            } while (a <= 0 || a>20);
            return a;
        };
        public static boolean getUserYes(){
            char a;
            do {
                a = cin.next().charAt(0);
                if (a !=  'y' && a!= 'n') {
                    System.out.println("Pleas enter only letter y and n !!! Try again!");
                } else if (a=='y') {
                    return true;
                }
            } while (a !=  'y' && a!= 'n');
            return false;
        };
        public static void main(String[] args) {
            System.out.println("Welcome to the incredible, wonderful, exciting, extraordinary, interesting, and unrivaled \"Guess the Number\" game! " +
                    "The rules are simple: I’ll pick a number between 1 and 20, " +
                    "and you have to guess it within 5 attempts. I" +
                    "’ll give you hints—telling you if your guess is too high or too low. Good luck!");
            char cont;
            do {

                int number = magicNumber();
                int i =0;
                boolean win = false;
                System.out.println("Gues nubber between 1 and 21 ");
                while (i<5 && !win){
                    int userNumber = getUserInput();
                    if (number>userNumber){
                        System.out.print("too low :(( \n" +
                                "try again!\n");
                    } else if (number<userNumber) {
                        System.out.print("too high :(( \n"+
                                "try again!\n");
                    } else  {
                        System.out.print("you win!!!\n");
                        win=true;
                    }
                    i++;
                    if (i==5&&!win){
                        System.out.println("You looser " +
                                "¯\\_(ツ)_/¯");
                    }
                }
                System.out.print("Try guess other number (y/n)? ");

            }while (getUserYes());
            System.out.print("Thank you for game, bye  ");

        }
    }
