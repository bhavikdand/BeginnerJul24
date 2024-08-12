package org.example.oops_5.demo.library;

import interfaces.demo.User;

public class MongoDriver {

    public void save(User u){
        System.out.println("Saving to mongo");
    }

    public void update(int id, User u, boolean upsert){
        System.out.println("Updating mongo user with id:" + id +", with upsert:" + upsert);
    }
}
