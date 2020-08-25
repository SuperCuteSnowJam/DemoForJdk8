package org.example.optionaldemo;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        System.out.println(getCarInsuranceName(new Person()));
        System.out.println(getCarInsuranceName2(new Person()));
    }

    /**
     * 不用optional
     * @param person
     * @return
     */
    public static String getCarInsuranceName(Person person){
        if(person != null){
            Car car = person.getCar();
            if(car!=null){
                Insurance insurance = car.getInsurance();
                if(insurance!=null){
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    /**
     * 使用optional
     * @param person
     * @return
     */
    public static String getCarInsuranceName2(Person person){
        Optional<Person> per = Optional.ofNullable(person);
        return per.map(Person::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
