package com.example.classworknovember2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClassworkNovember2Application {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Borislav";
        int age = 17;
        String city = "Grudovo";
        String string = scanner.nextLine();
        if(string=="/home") {
            System.out.println("Welcome user!");
        }
        String user = scanner.nextLine();
        if(user=="/user") {
            System.out.println("User: " + name);
            System.out.println("Age: " + age);
            System.out.println("From: " + city );
        }

    }


}
