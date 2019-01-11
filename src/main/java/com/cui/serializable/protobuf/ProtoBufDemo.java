package com.cui.serializable.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.java.Log;

@Log
public class ProtoBufDemo {

    public static void main(String[] args) throws InvalidProtocolBufferException {

        //fluent
        UserProto.User user = UserProto
                .User
                .newBuilder()
                .setName("Mic")
                .setAge(20)
                .setHobby("swimming")
                .build();

        byte[] bytes = user.toByteArray();

        UserProto.User newUser = UserProto.User.parseFrom(bytes);
        System.out.println(newUser);
        //序列化和的字节长度
        log.info(String.valueOf(bytes.length));

    }
}
