package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

//        //질문 >> .collect(Collectors) 와 .toList 차이
//        List<Integer> list1 = list.stream().map(x -> x * 2).collect(Collectors.toList());
//        System.out.println("list1 = " + list1);
//        List<Integer> list2 = list.stream().map(x -> x*2).toList();
//        System.out.println("list2 = " + list2);

//        //익명 클래스 활용 방법
//        Function<Integer, Integer> func = new Function<> (){
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 2;
//            }
//        };
//        list.stream().filter()
//        List<Integer> res1 = list.stream().map(func).toList();
//        System.out.println("res1 = " + res1);
//
//        //람다식 만들기
//        Function<Integer,Integer> func2 = (a -> a * 2);
//        List<Integer> res2 = list.stream().map(func2).toList();
//
//        System.out.println("res2 = " + res2);
//
//        //직접 람다식 대입
//
//        System.out.println("res3 = " + list.stream().map(x -> x*2).toList());\\

        //익명 클래스 활용 방법
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        List<Integer> res1 = list.stream().filter(predicate).map(x -> x * 2).collect(Collectors.toList());
        System.out.println("res1 = " + res1);

        //람다식 만들기
        Predicate<Integer> predicate2 = x -> x % 2 == 0;
        List<Integer> res2 = list.stream().filter(predicate2).map(x -> x * 2).collect(Collectors.toList());
        System.out.println("res2 = " + res2);

        //직접 람다식 대입

        System.out.println("res3 = " + list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList()));
    }
}
