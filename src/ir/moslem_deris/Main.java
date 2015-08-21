package ir.moslem_deris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mPassword mP=new mPassword();
        do {
            mP.setRandomPassword();
        }while (mP.getRatePercent()!=100);
        System.out.println("A powerful password:");
        System.out.println(mP.getPassword());

        System.out.println("\nTry yours! Enter a password so I'll tell you how strong it is!\nEnter a password: ");
        Scanner scanner = new Scanner(System.in);
        String tempPass = scanner.next();
        mP.setPassword(tempPass);
        System.out.print("Rate: " + mP.getRatePercent() + "%");
    }
}
