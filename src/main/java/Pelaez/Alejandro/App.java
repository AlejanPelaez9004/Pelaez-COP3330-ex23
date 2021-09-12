/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean answer;
        System.out.print("Is the car silent when you turn the key? (Use y or n to respond) ");
        answer = ParseBool();
        if (answer)
        {
            System.out.print("Are the battery terminals corroded? ");
            answer = ParseBool();
            if (answer) {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            answer = ParseBool();
            if (answer)
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up and fail to start? ");
                answer = ParseBool();
                if (answer)
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    answer = ParseBool();
                    if (answer)
                    {
                        System.out.print("Does your car have fuel injection? ");
                        answer = ParseBool();
                        if (answer)
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

    private static boolean ParseBool()
    {
        String temp;
        boolean tempBool = false;
        temp = input.next();

        if (temp.equalsIgnoreCase("Y"))
            tempBool = true;
        if (temp.equalsIgnoreCase(("N")))
            tempBool = false;

        return tempBool;
    }
}

