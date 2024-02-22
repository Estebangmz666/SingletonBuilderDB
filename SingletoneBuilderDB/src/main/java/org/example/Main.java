//Singleton is a creational pattern for managing instances of a class. Only one object can be instanced and
//it can be accessed from any other class

package org.example;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("databaseConnector = " + databaseConnector);
    }
}