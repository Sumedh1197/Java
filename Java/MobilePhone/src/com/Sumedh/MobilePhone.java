package com.Sumedh;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact already on list");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            Contact contact= this.myContacts.get(i);
            if(contact.getName().equals(this.myContacts.get(i))){
                    return i;
            }
        }
        return -1;
    }
    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);
        if (findPosition < 0) {
            System.out.println("Name not found");
            return false;
        }
        else{
            this.myContacts.remove(contact);
            System.out.println(contact.getName()+" was deleted");
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int findPosition= findContact(oldContact);
        if(findPosition<0){
            System.out.println("Name not found");
            return false;
        }else if(findContact(newContact)!= -1){
            System.out.println("Contact already with name: " +newContact.getName()+ " already in list");
            return false;
        }
        this.myContacts.set(findPosition,newContact);
        System.out.println(oldContact.getName()+ " was replaced with " +newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        else{
            return null;
        }
    }
    public void PrintContacts(){
        System.out.println("Contact List");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println(i+1 + " " +this.myContacts.get(i).getName()
            +" -->" +this.myContacts.get(i).getPhoneNumber() );
        }
    }
    public Contact queryContact(String name){
        int position= findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }
}
