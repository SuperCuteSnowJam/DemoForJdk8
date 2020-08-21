package org.example.lamdba;

import java.util.ArrayList;
import java.util.List;



/**
 * LambdaDemoV3相比于LambdaDemoV2，该类添加了filterApplesByWeight通过重量筛选苹果的方法。
 */
public class LambdaDemoV3 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> blueApples = filterColorApples(apples,"绿色");
        List<Apple> redApples = filterColorApples(apples,"红色");
        List<Apple> crimsonApples = filterColorApples(apples,"深红色");

        List<Apple> heavyApples = filterApplesByWeight(apples,150);
    }

    //根据苹果的颜色筛选苹果
    public static List<Apple> filterColorApples(List<Apple> inventory,String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    //根据苹果的重量筛选苹果
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }


}
