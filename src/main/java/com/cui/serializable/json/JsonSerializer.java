package com.cui.serializable.json;

import com.alibaba.fastjson.JSON;
import com.cui.serializable.javaapi.ISerializable;

public class JsonSerializer implements ISerializable {
    @Override
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data),clazz);
    }
}
