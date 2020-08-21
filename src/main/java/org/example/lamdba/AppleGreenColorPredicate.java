package org.example.lamdba;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "绿色".equals(apple.getColor());
    }
}
