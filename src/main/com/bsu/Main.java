package com.bsu;

import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try (Scanner scanner = new Scanner(new FileReader(args[0]))) {
                int count = 0;
                int invalidNumbers = 0;
                while (scanner.hasNextLine()) {
                    count++;
                    String number = scanner.nextLine();
                    if (!isPhoneNumber(number)) {
                        System.out.println("Not a phone number in line: " + count);
                        ++invalidNumbers;
                    }
                }
                System.out.println("Invalid numbers found: " + invalidNumbers);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static boolean isPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("(\\+375|80)-?(\\((25|29|44|17|33)\\)||(25|29|44|17|33))-?(\\d{3}-?\\d{2}-?\\d{2})");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
