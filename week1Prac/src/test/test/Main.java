package test.test;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String a = "123";
        String b = "123";

        System.out.println(a==b);

        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("one", 12);
        hash.put("onee", 12);

        System.out.println(hash.get("one") == hash.get("onee"));
    }
}
