package com.cui.serializable.json;

import com.cui.serializable.javaapi.ISerializable;
import com.cui.serializable.pojo.User;

import java.sql.PreparedStatement;

public class Test {

    public static void main(String[] args) {

        ISerializable serializable = new JsonSerializer();

        User user = new User();
        user.setAge(18);
        user.setHobby("football");
        user.setName("Rose");
        user.setSex("male");
        byte[] bytes = serializable.serializer(user);

        System.out.println(new String(bytes));

        System.out.println(serializable.deSerializer(bytes,User.class));
    }
}
