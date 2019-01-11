package com.cui.serializable.javaapi;

import com.cui.serializable.pojo.User;

import java.io.*;

public class StoreRuleDemo {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user"));
        User user = new User();
        user.setAge(20);
        outputStream.writeObject(user);
        outputStream.flush();
        System.out.println(new File("user").length());
        outputStream.writeObject(user);
        outputStream.flush();
        System.out.println(new File("user").length());
        outputStream.close();
    }
}
