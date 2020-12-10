package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Prime: ");
        Main prime = new Main();
        prime.disPlay();
    }

    public boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void disPlay() {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int count = 0;
        int i = 0;
        while (count <= number) {
            if (checkPrime(i)) {
                if (i < 100) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            i++;
        }
    }
}
