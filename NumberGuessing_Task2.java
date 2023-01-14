import java.util.Random;
import java.util.Scanner;
public class NumberGuessing_Task2 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("************ Game Instruction ************");
        System.out.println("System will choose random number between 1 and 100");
        System.out.println("You have to guess the number in 5 attempt");
        System.out.println("Initially your and system score is 0");
        System.out.println("If your guessed number is right then your score will be incresed by 1 ");
        System.out.println("If your guessed number is wrong then system score will be increased by 1");
        System.out.println("If your score is greater , then you win");
        System.out.println("*******************************************");
        System.out.println("Enter your guess between 1 - 100 : ");
        int comp = rand.nextInt(100)+1;
        int systemscore = 0;
        int userscore = 0;
        int attempt = 5;
        while(true){
                int user = sc.nextInt();
                if(user<0){
                    System.out.println("Enter valid number");
                    attempt -= 1;
                    System.out.println("Attempt left : "+attempt);
                   
                }
                else if(user>comp){
                    System.out.println("Your Guess is too high");
                    attempt -= 1;
                    System.out.println("Attempt left : "+attempt);
                    systemscore +=1;
                }
                else if(user<comp){
                    System.out.println("Your Guess is too low");
                    attempt -= 1;
                    System.out.println("Attempt left : "+attempt);
                    systemscore +=1;
                }
                else if(user == comp){
                    System.out.println("you guess it right in "+(6-attempt)+" attempt");
                    userscore +=1;
                    System.out.println("Your score"+userscore);
                    System.out.println("System score"+systemscore);

                    if(userscore>systemscore){
                        System.out.println("You");
                    }
                    else if(userscore<systemscore){
                        System.out.println("System win");
                    }
                    break;
                }
                if(attempt==0){
                    System.out.println("Game-Over");
                    System.out.println("Your score "+userscore);
                    System.out.println("System Score "+systemscore);
                    if(userscore>systemscore){
                        System.out.println("You");
                    }
                    else if(userscore<systemscore){
                        System.out.println("System win");
                    }
                    break;
                }

    }
    sc.close();


    }
    
}
