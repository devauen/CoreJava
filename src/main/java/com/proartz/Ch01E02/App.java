package com.proartz.Ch01E02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int angle = readAngle();

        System.out.println("You entered: " + angle);

        System.out.println("Normalize angle is: " + normalizeAngle(angle));
    }

    public static int readAngle() {
        int angle = 0;

        System.out.print("Enter the angle: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {
            angle = scanner.nextInt();
        }

        return angle;
    }

    public static int normalizeAngle(int angle) {
        //angle = (((angle % 360) + 360) % 360);

        angle = Math.floorMod(angle, 360);

        return angle;
    }
}
