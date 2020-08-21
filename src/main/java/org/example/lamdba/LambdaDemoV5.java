package org.example.lamdba;

import java.util.ArrayList;
import java.util.List;

/**
 * LambdaDemoV5使用匿名类的方式解决LambdaDemoV4实例中代码啰嗦和代码逻辑不集中的问题。
 */
public class LambdaDemoV5 {
    public static void main(String[] args) {
        List<Apple> apples = Apple.sampleList();

        List<Apple> heavyApples = filterApples(apples,new ApplePredicate(){
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });

        List<Apple> greenApples = filterApples(apples,new ApplePredicate(){
            @Override
            public boolean test(Apple apple) {
                return "绿色".equals(apple.getColor());
            }
        });


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
