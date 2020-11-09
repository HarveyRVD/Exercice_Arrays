package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
/////////////////////////////////////////////////////////
//                Q1. ARRAY EXERCICES                  //
/////////////////////////////////////////////////////////
        System.out.println("\n--------------Question 1-------------");

        int TwelveInts[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i = 0; i < 12; i++)                     // Affichage
            System.out.print(TwelveInts[i] + " ");      // de la 1ere à la dernière case

        System.out.println();

        for(int i = 11; i > -1; i--)                    // Affichage
            System.out.print(TwelveInts[i] + " ");      // de la dernière à la 1ere case


/////////////////////////////////////////////////////////
//                Q2. ARRAY EXERCICES                  //
/////////////////////////////////////////////////////////
        System.out.print("\n\n--------------Question 2-------------");

        int TenInts[] = new int[10];

        for(int i = 0; i < 10; i++)
            TenInts[i] = -113;

        System.out.println();

        for(int j = 0; j < 10; j++)
            System.out.println("Slot " + j + " contains " + TenInts[j] + " ");

/////////////////////////////////////////////////////////
//                Q4. ARRAY EXERCICES                  //
/////////////////////////////////////////////////////////
        System.out.print("\n--------------Question 4-------------\n");

        Random r = new Random();

        int TenIntsQ4[] = new int[10];
        for(int i = 0; i < 10; i++)
            TenIntsQ4[i] = 1 + r.nextInt(100);       //rempli l'array avec un nombre compris entre 1 et 100
        for(int i = 0; i < 10; i++)
            System.out.println("Slot " + i + " contains " + TenIntsQ4[i]);


/////////////////////////////////////////////////////////
//                Q5. ARRAY EXERCICES                  //
/////////////////////////////////////////////////////////
        System.out.print("\n--------------Question 5-------------\n");
        int Q5Array[] = new int[1000];

        for(int i = 0; i < 1000; i++)
            Q5Array[i] = 10 + r.nextInt(90);       //rempli l'array avec un nombre compris entre 10 et 99
        for(int i = 0; i < 1000; i++)
            System.out.print(Q5Array[i] + "\t");

/////////////////////////////////////////////////////////
//                Q6. ARRAY EXERCICES                  //
/////////////////////////////////////////////////////////
        System.out.print("\n\n--------------Question 6-------------\n");

        Scanner s = new Scanner(System.in);
        int Q6[] = new int[20];
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for(int i = 0; i < Q6.length; i++) {
            System.out.print("Type a random value for Q6[" + i + "]: ");
            Q6[i] = s.nextInt();

            if(Q6[i] > 0)
                pos++;
                else if (Q6[i] < 0)
                    neg++;
                else
                    zero++;

            if(Q6[i]%2 == 0)
                even++;
                else
                    odd++;
        }

        System.out.println("\nThe array Q6 contains :");
        System.out.println("     - Positive numbers : " + pos);
        System.out.println("     - Negative numbers : " + neg);
        System.out.println("     - Zeros : " + zero);
        System.out.println("     - Even numbers : " + even);
        System.out.println("     - Odd numbers : " + odd);

        }
}
