package com.dicoding.javafundamental.basic;

public class Main {
    public static void main (String[] args){

    System.out.println("\nMATERI STRING");

    BelajarString panggilBelajarString = new BelajarString();
    panggilBelajarString.CallBelajarString();

    System.out.println("\nMATERI OPERATOR\n");

    Operator panggilBelajarOperator = new Operator();
    panggilBelajarOperator.Assignment();
    panggilBelajarOperator.Aritmatika();
    panggilBelajarOperator.Unary();
    panggilBelajarOperator.Equality();
    panggilBelajarOperator.Conditional();

    System.out.println("\nMATERI INPUT OUTPUT");
    IO panggilIO = new IO();
    panggilIO.Input();

    }

}
