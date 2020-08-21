package org.example.lambda;

import java.util.Arrays;
import java.util.List;

public class Pear {

    private String color;

    private int weight;

    private String variety;


    /**
     * 空构造函数
     */
    public Pear(){

    }

    /**
     * 完全构造函数
     * @param color
     * @param weight
     * @param variety
     */
    public Pear(String color,int weight,String variety){
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

    public static List<Pear> sampleList(){
        return Arrays.asList(
                new Pear("黄色",150,"雪花梨"),
                new Pear("黄色",149,"雪花梨"),
                new Pear("黄色",135,"雪花梨"),
                new Pear("黄色",136,"雪花梨"),
                new Pear("白色",155,"京白梨"),
                new Pear("白色",145,"京白梨"),
                new Pear("白色",142,"京白梨")
        );
    }
}
