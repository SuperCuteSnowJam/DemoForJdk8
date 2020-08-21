package org.example.lambda;

import java.util.ArrayList;
import java.util.List;


/**
 * LambdaDemoV1设计方法的缺点：每当添加一个新的颜色筛选规则都需要设计一个新的功能函数。
 * LambdaDemoV2对上述缺点的修正方案：
 *     该类的filterColorApples方法在LambdaDemoV1上的筛选苹果的方法上做了优化，添加了color参数，这样使用者可以使用一个方法就可以筛选
 * 红色，绿色，黄色等不同颜色的苹果。
 */
public class LambdaDemoV2 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> blueApples = filterColorApples(apples,"绿色");
        List<Apple> redApples = filterColorApples(apples,"红色");
        List<Apple> crimsonApples = filterColorApples(apples,"深红色");
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

}
