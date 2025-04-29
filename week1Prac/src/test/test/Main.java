package test.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        Integer key1 = 129; // 오토캐싱 범위 밖
        Integer key2 = 129; // 새로운 객체

        map.put(key1, "Value");

        if (findValue(map, key2)) {
            System.out.println("키를 찾음");
        } else {
            System.out.println("키를 못 찾음");
        }
    }

    // == 으로 키를 비교하는 잘못된 메소드
    public static boolean findValue(HashMap<Integer, String> map, Integer key) {
        for (Integer k : map.keySet()) {
            if (k == key) { // ❌  (잘못됨)
                return true;
            }
        }
        return false;
    }
}
