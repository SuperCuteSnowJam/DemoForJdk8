package org.example.lamdba;

public class Peach {

    private String color;

    private int weight;

    private String variety;

    /**
     * 空构造函数
     */
    public Peach(){

    }

    /**
     * 完全构造函数
     * @param color
     * @param weight
     * @param variety
     */
    public Peach(String color,int weight,String variety){
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
