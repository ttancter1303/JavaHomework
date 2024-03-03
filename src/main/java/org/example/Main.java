package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        Person person = new Person();
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        person.setAddress(address);
        System.out.println("Enter gender(M/F): ");
        String gender = scanner.nextLine();
        person.setGender(gender);
        System.out.println("Enter date of birth(dd/mm/yyyy): ");
        String dob = scanner.nextLine();
        person.setDob(dob);
        scanner.close();
        System.out.println(person);
    }
}