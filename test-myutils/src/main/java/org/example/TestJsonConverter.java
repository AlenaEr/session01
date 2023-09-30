package org.example;

public class TestJsonConverter {
    public static void main(String[] args) {
        String jsonString = "{\"first_name\": \"John\", \"last_name\": \"Doe\", \"age\": 23}";
        Person obj = JsonToObjectConverter.convertJsonToString(jsonString);
        System.out.println("Wow my lib works! " + obj);
    }
}