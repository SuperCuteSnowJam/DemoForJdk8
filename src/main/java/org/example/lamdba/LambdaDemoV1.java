package org.example.lamdba;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计背景：
 *    设计一个功能类，可以满足用户通过输入不同的颜色筛选苹果
 */
public class LambdaDemoV1 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> blueApples = filterGreenApples(apples);
        List<Apple> redApples = filterRedApples(apples);
        List<Apple> crimsonApples = filterCrimsonApples(apples);
    }

    //筛选绿苹果
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if("绿色".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    //筛选红苹果
    public static List<Apple> filterRedApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if("红色".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    //筛选深红苹果
    public static List<Apple> filterCrimsonApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if("深红色".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

}
