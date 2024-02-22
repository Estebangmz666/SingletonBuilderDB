package org.example;

//1. Private constructor. For restrict object instances
//2. Static private attribute
//3. Public static method that returns the instance

public class DatabaseConnector {
    //2:
    private static DatabaseConnector databaseConnector;

    //1: Because of the private class contributor, we can only instance an object of type "DatabaseConnector"
    //in this only class, not in another one.
    private DatabaseConnector(){
        System.out.println("Creating a unique instance...");
    }

    //3: If the method is called again after the object is instanced, the conditional will drop a false, so it
    //won´t return anything.
    public static DatabaseConnector getInstance(){
        //"If" for evaluating if the instance of the object has already been created.
        if (databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }
}