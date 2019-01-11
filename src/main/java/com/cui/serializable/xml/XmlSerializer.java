package com.cui.serializable.xml;

import com.cui.serializable.javaapi.ISerializable;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import lombok.Synchronized;

public class XmlSerializer implements ISerializable {

    XStream xStream = new XStream(new DomDriver());

    @Synchronized
    public  void inc() {
        int count = 0;
        for (int i = 0;i < 1000;i ++) {
            count++;
        }
    }
    @Override
    public <T> byte[] serializer(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        return (T) xStream.fromXML(new String(data));
    }
}
