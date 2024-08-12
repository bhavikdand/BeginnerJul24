package org.example.oops_5.demo.bad_implementation;

import interfaces.demo.User;
import interfaces.demo.library.MongoDriver;

public class BadUserServiceWithMongo {
    MongoDriver db;

    public User saveUser(User u){
        db.save(u);
        return u;
    }

    public User update(int id,User updated){
        db.update(id, updated, false);
        return updated;
    }

}
