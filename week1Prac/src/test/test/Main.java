package test.test;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String a = "123";
        String b = "123";

        System.out.println(a==b);

        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("one", 1233);
        hash.put("onee", 1233);

        System.out.println(hash.get("one") == hash.get("onee"));
    }
}
