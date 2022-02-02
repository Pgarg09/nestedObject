package com.example.code;


public class NestedObject {

    public static String getObjectValue(Object object, String key){

        key = key.replaceAll("/","");
        String stringObject = object.toString().replaceAll("[^a-zA-Z]", "");
        if( stringObject.contains(key) && stringObject.length()==key.length()+1) {
            return stringObject.substring(stringObject.length()-1);
        }
        return "nil";
    }

}
