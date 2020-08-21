package org.example.lamdba;

import java.util.ArrayList;
import java.util.List;

/**
 * LambdaDemoV5缺陷：
 *     代码依旧冗余
 * LambdaDemoV6针对LambdaDemoV5缺陷的修正方案：采用强大的Lambda表达式
 * Lambda最大的功能就是代替匿名类的创建使用方式。大大减少代码量并提升代码可读性。
 */
public class LambdaDemoV6 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> heavyApples = filterApples(apples,(Apple apple) ->apple.getWeight() > 150);

        List<Apple> greenApples = filterApples(apples,(Apple apple) ->"绿色".equals(apple.getColor()));


    }

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
