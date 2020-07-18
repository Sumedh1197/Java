package com.Sumedh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0304456788");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        PrintActions();
        while (!quit) {
            System.out.println("\n Enter action(Enter 6 to show all available actions)");
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down");
                    break;
                case 1:
                    mobilePhone.PrintContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    PrintActions();
                    break;
            }


        }
    }

    private static void startPhone() {
        System.out.println("Starting phone........");
    }

    private static void PrintActions() {
        System.out.println("\nAvailable action : \n");
        System.out.println("0 - To shutdown \n" +
                "1- To Print Contacts \n" +
                "2 - To Add a new Contact \n" +
                "3 - To Remove a contact \n" +
                "4-To Update an existing contact \n" +
                "5-To query if a contact exists \n" +
                "6-To print a list of all available actions. ");
        System.out.println("Choose your action: ");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter phone number");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " +newContact.getName());
        } else {
            System.out.println("Cannot add existing contact with name: " +newContact.getName());
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing contact");
        String contact = scanner.nextLine();
        Contact contactName = mobilePhone.queryContact(contact);
        if (contactName == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String contactNew = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String numberNew = scanner.nextLine();
        Contact newContact1 = Contact.createContact(contactNew, numberNew);
        if (mobilePhone.updateContact(contactName, newContact1)) {
            System.out.println("Successfully updated record ");
        } else {
            System.out.println("Error updating record ");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact");
        String contact = scanner.nextLine();
        Contact contactName = mobilePhone.queryContact(contact);
        if (contactName == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(contactName)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }
    public static void queryContact(){
        System.out.println("Enter existing contact");
        String contact = scanner.nextLine();
        Contact contactName = mobilePhone.queryContact(contact);
        if (contactName == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+contactName.getName()+ " and phone number is: "+contactName.getPhoneNumber());


    }
}








