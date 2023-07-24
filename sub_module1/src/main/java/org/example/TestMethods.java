package org.example;

import java.util.List;

public class TestMethods {
    public static String familyService(List<String> nameList) {
        String id = null;
        for (String name : nameList) {
            if (name.startsWith("a")){
                id = "a";
            } else if (name.startsWith("b")){
                id = "b";
            } else if (name.startsWith("c")){
                id = "c";
            } else if (name.startsWith("d")){
                id = "d";
            } else if (name.startsWith("e")){
                id = "e";
            } else if (name.startsWith("f")){
                id = "f";
            } else if (name.startsWith("g")){
                id = "g";
            } else if (name.startsWith("h")){
                id = "h";
            } else {
                id = "xxxx";
            }
        }
        return id;
    }

    public static int familyMultiLogic(int a, int b){
        int m = a * b;
        if (m != 0) {
            return m;
        }
        return m * m;
    }
}
