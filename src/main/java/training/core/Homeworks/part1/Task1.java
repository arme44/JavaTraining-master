package training.core.Homeworks.part1;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task1 {
/**

 * ZGADUJ ZGADULA

 * 1. program losuje liczbę od 1 - 100

 * int randomInt = new Random().nextInt(100);

 * 2. user podaje swoja liczbę

 * int fromuser = new Scanner(System.in).nextInt();

 * 3. program ocenia czy trafiona

 * 3a. sukcess

 * 3b. user ma info czy przestrzelił od góry czy od dołu

 */

public static void main(String[] args) {

    int fromUser = new Scanner(System.in).nextInt();



    int randomInt = new Random().nextInt(49);

    int randomIntPlus1 = randomInt + 1;

    System.out.println(randomIntPlus1);



    if(fromUser==randomIntPlus1) {
        System.out.println("Sukcess");
    } else {
        System.out.println("Fail");
        if(fromUser>randomIntPlus1) {
            System.out.println("Too hight!");
        } else {
            System.out.println("Too low!");
        }
    }

}

}
