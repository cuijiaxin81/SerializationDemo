package com.cui.serializable.xml;

import com.cui.serializable.javaapi.ISerializable;
import com.cui.serializable.pojo.User;
import lombok.Synchronized;
import lombok.extern.java.Log;

@Log
public class Test {




    public static void main(String[] args) {
        ISerializable serializable = new XmlSerializer();

        User user = new User();
        user.setAge(18);
        user.setHobby("basketball");
        user.setName("tom");
        user.setSex("male");

        byte[] bytes = serializable.serializer(user);

        log.info(new String(bytes));
        //System.out.println(new String(bytes));
        log.info(serializable.deSerializer(bytes,User.class).toString());
    }
}
