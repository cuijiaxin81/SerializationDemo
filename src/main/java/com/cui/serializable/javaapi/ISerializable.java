package com.cui.serializable.javaapi;

public interface ISerializable {

    <T> byte[] serializer(T obj);


    <T> T deSerializer(byte[] data,Class<T> clazz);

}
