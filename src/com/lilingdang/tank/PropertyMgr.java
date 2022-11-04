package com.lilingdang.tank;

import javafx.beans.property.Property;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    static Properties pros = new Properties();

    static {
        try {
            pros.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object get(String key){
        if(pros == null)return null;
        return pros.get(key);
    }

    //int getInt(key)
    //getString(key)

    public static void main(String[] args) {
        System.out.println(PropertyMgr.get("initTankCount"));
    }
}
