package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * LambdaDemoV6缺陷：
 *                 仅可以针对苹果的不同属性进行筛选，如果是香蕉，梨子，桃子怎么办
 * LambdaDemoV7针对LambdaDemoV6缺陷的修正方案
 *                  使用泛型，设计Predicate接口支持泛型，同时重新设计filterApples
 *                  方法支持泛型
 *
 */
public class LambdaDemoV7 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Pear>  pears = Pear.sampleList();

        List<Apple> heavyApples = filterApples(apples,(Apple apple) ->apple.getWeight() > 150);
        System.out.println("质量较大的苹果信息如下：");
        heavyApples.forEach((Apple apple) -> {System.out.println(apple.getWeight() + "|" +apple.getColor() + "|" +apple.getVariety());});
        System.out.println();

        List<Apple> greenApples = filterApples(apples,(Apple apple) ->"绿色".equals(apple.getColor()));
        System.out.println("绿色苹果信息如下：");
        greenApples.forEach((Apple apple) -> {System.out.println(apple.getWeight() + "|" +apple.getColor() + "|" +apple.getVariety());});
        System.out.println();

        List<Pear>  yellowApples = filterApples(pears,(Pear pear) ->"黄色".equals(pear.getColor()));
        System.out.println("黄色梨子信息如下：");
        yellowApples.forEach((Pear pear) -> {System.out.println(pear.getWeight() + "|" +pear.getColor() + "|" +pear.getVariety());});
        System.out.println();

    }

    public static <T> List<T> filterApples(List<T> inventory,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t:inventory){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
