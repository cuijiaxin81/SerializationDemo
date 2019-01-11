package com.cui.serializable.javaapi;

import com.cui.serializable.pojo.User;

public class Test {

    public static void main(String[] args) {
        ISerializable serializable = new JavaSerializer();

        User user = new User();
        user.setAge(18);
        user.setHobby("basketball");
        user.setName("Jack");
        user.setSex("male");

        System.out.println(serializable.deSerializer(serializable.serializer(user),User.class));

    }
}
