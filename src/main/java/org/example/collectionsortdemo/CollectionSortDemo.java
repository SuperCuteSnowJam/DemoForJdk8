package org.example.collectionsortdemo;

import org.example.lambda.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CollectionSortDemo {

    public static void main(String[] args) {
        List<Apple> list =  Arrays.asList(
                    new Apple("红色",150,"红富士"),
                    new Apple("红色",149,"红富士"),
                    new Apple("绿色",135,"青苹果"),
                    new Apple("绿色",136,"青苹果"),
                    new Apple("红色",155,"红富士"),
                    new Apple("深红色",145,"红元帅"),
                    new Apple("深红色",142,"红元帅")
            );

        list.sort(Comparator.comparing(Apple::getColor));
        list.forEach( p -> System.out.println(p.getColor()));
    }

    public static class Apple {

        private String color;

        private int weight;

        private String variety;

        public String a (Apple a){
            return "dsfd";
        }

        /**
         * 空构造函数
         */
        public Apple(){

        }

        /**
         * 完全构造函数
         * @param color
         * @param weight
         * @param variety
         */
        public Apple(String color,int weight,String variety){
            this.color = color;
            this.weight = weight;
            this.variety = variety;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getVariety() {
            return variety;
        }

        public void setVariety(String variety) {
            this.variety = variety;
        }

    }
}
