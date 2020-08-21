package org.example.lamdba;

import java.util.ArrayList;
import java.util.List;

/**
 * LambdaDemoV3缺陷：
 *       当出现新的苹果属性过滤条件时，我们需要频繁的添
 *    加新的函数去满足需求，如果需要通过苹果的种类去筛选，我们需要添加一个通过苹果种类筛选的函数，如果需要通过苹果的产地
 *    去筛选，我们需要添加一个通过苹果产地筛选的函数。总之，每添加一个新的属性筛选需求，我们就需要重新设计一个新的功能函
 *    数。糟糕的是，这些新的功能函数与现有的功能函数在大部分内容上是重叠的。
 * LambdaDemoV4针对LambdaDemoV3缺陷的修正方案
 *     我们将选择标准建模，根据苹果的属性来返回一个boolean值。我们可以定义一个接口ApplePredicate，详细见org.example.lamdba.ApplePredicate
 * 现在，我们可以用ApplePredicate的多个实现代表不同的选择标准，例如AppleGreenColorPredicate代表筛选绿色苹果，
 * AppleHeavyWeightPredicate代表筛选重量超过150克的苹果。使用方式详细见main方法。
 */
public class LambdaDemoV4 {

    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> heavyApples = filterApples(apples,new AppleGreenColorPredicate());

        List<Apple> greenApples = filterApples(apples,new AppleHeavyWeightPredicate());


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
