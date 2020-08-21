package org.example.lambda;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "绿色".equals(apple.getColor());
    }
}
