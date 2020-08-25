package org.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {

        List<Dish> menu = Dish.sampleList();
        /**
         * 筛选出所有的素菜
         */
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        /**
         * 筛选所有偶数，并确保没有重复
         */
        numbers.stream()
                .filter(i -> i%2 == 0)
                .distinct()
                .forEach(System.out::println);

        /**
         * 选出热量超过300卡路里的头三道菜
         */
        {
            List<Dish> dishes = menu.stream()
                    .filter(d->d.getCalories() > 300)
                    .limit(3)
                    .collect(toList());
        }

        /**
         * 筛选跳过超过300卡路里的头俩道菜，并返回剩下的菜肴
         */
        {
            List<Dish> dishes = menu.stream()
                    .filter(d -> d.getCalories() > 300)
                    .skip(2)
                    .collect(toList());
        }

        /**
         * 输出每道菜的长度
         */
        {
            List<Integer> wordLength = menu.stream()
                    .map(Dish::getName)
                    .map(String::length)
                    .collect(toList());
            System.out.println("输出每道菜的长度！");
            wordLength.forEach(System.out::println);
        }
        /**
         * 使用flatmap
         */
        {
            String[] words = {"Hello","World"};
            System.out.println("打印HelloWord");
            Arrays.stream(words)
                    .map(q->q.split(""))
                    .flatMap(Arrays::stream)
                    .collect(toList()).forEach(System.out::print);
        }

        /**
         * 查找和匹配
         * anyMatch
         * allMatch
         */
        //查看菜单里是否有素食
        if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println();
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }
        //查看所有的菜品是否都健康，即卡路里的热量低于1000
        boolean isHealthy = menu.stream().allMatch(d -> d.getCalories() < 100);
        if(isHealthy){
            System.out.println();
            System.out.println("所有的菜品都是健康的");
        }

        /**
         * findAny()
         */
        Optional<Dish> dish = menu.stream()
                .findAny();
        Optional<Dish> dishFirst = menu.stream().findFirst();
        if(dish.isPresent()){
            System.out.println(dish.get().toString());
        }
        if(dishFirst.isPresent()){
            System.out.println(dishFirst.get().toString());
        }


    }


}
