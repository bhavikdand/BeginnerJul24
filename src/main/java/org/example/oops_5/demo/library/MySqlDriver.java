package org.example.oops_5.demo.library;

import interfaces.demo.User;

public class MySqlDriver {

    public void insert(User u){
        System.out.println("Inserting into mysql db");
    }

    public void update(int id, User updated){
        System.out.println("Updating mysql user with id" + id);
    }
}
