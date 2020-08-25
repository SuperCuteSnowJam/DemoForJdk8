package org.example.streamdemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamDemo {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    /**
     * 由值创建流
     */
    public static void demo1(){
        Stream<String> stream = Stream.of("Java 8 ","Lambdas ","in ","action ");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }

    /**
     * 由数组创建流
     */
    public static void demo2(){
        int [] numbers = {1,2,3,4,5,6,7};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("由数组创建的流的和是：" + sum);
    }

}
