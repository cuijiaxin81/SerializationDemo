package com.cui.serializable.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.StringJoiner;

@Data
@ToString(callSuper = true)
public class User extends UserSuper implements Serializable {
    private static final long serialVersionUID = 8169191029642793143L;

    private String name;

    private int age;

    private transient String hobby;

    //序列化对象
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(hobby);
    }

    //反序列化
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        hobby = (String) objectInputStream.readObject();
    }



}
