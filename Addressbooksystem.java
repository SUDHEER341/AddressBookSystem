package com.addressbooksystem;

import java.util.ArrayList;

public class Addressbooksystem {
    private static final ArrayList<ArrayList<String>> address_book = new ArrayList<>();

    public void createContacts(ArrayList <String> contact) {


        Addressbooksystem.address_book.add(contact);

        for (ArrayList<String> i : Addressbooksystem.address_book) {
            for (String j : i) {
                System.out.println(j);
            }
        }
    }
    public static void main(String []args){
        System.out.println("Welcome to Address Book Program!");

    }
}
