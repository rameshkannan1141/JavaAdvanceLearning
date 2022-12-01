package com.learning;

import java.util.HashMap;
import java.util.Map;

public class MapHashmap {
    public static void main(String[] arg){

        // Dictionary and Maps

        // British English to American English
        Map<String,String> BritAmericDictionary = new HashMap<String,String>();

        //putting things inside our dictionary
        BritAmericDictionary.put("Biscuts","cookies");
        BritAmericDictionary.put("Dust pin", "Trash can");
        BritAmericDictionary.put("Lift","Elevator");


        //Retrive things from our dictionary
        System.out.println(BritAmericDictionary.get("Biscuts"));
        System.out.println(BritAmericDictionary.get("Dust pin"));
        System.out.println(BritAmericDictionary.get("Lift"));

        // Print out all keys
        System.out.println(BritAmericDictionary.keySet());

        // Print out all values
        System.out.println(BritAmericDictionary.values());

        // Print out Size
        System.out.println("The size of our Dictionary is  "+BritAmericDictionary.size());

        System.out.println();
        System.out.println();



        // shopping list
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();

        // Put some stuff in Dictionary
        shoppingList.put("Bread",true);
        shoppingList.put("Oreos",Boolean.TRUE);
        shoppingList.put("Pen",Boolean.TRUE);
        shoppingList.put("Eggs",Boolean.FALSE);
        shoppingList.put("Sugar",false);

        //Retrieve items
        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.get("Oreos"));
        System.out.println(shoppingList.get("Eggs"));
        System.out.println(shoppingList.get("Sugar"));

        // Key-Value Pairs Print out
        System.out.println(shoppingList.toString());

        //is Empty?
        System.out.println(shoppingList.isEmpty());

        // Remove Things
        shoppingList.remove("Eggs");

        //  Replace value for the certine key
        shoppingList.replace("Oreos",Boolean.FALSE);

        // Key-Value Pairs Print out
        System.out.println(shoppingList.toString());


        //Clear our Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());









    }
}
