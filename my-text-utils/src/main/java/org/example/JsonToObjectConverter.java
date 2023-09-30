package org.example;

import com.google.gson.Gson;

public class JsonToObjectConverter {

    public static Person convertJsonToString(String json) {
        try {
            Gson gson = new Gson();
            Person jsonObject = gson.fromJson(json, Person.class);
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new Person();
        }
    }

    public static void main(String[] args) {
        Person obj = convertJsonToString("{\"first_name\": \"John\", \"last_name\": \"Doe\", \"age\": 30}");
        System.out.println(obj);
    }
}
