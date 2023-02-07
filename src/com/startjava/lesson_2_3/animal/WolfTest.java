package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setNickname("Buddy");
        wolf.setWeight(50);
        wolf.setAge(7);
        wolf.setColor("Gray");

        System.out.println("Пол - " + wolf.getSex() + ", \n" +
                "кличка - " + wolf.getNickname() + ", \n" +
                "вес - " + wolf.getWeight() + ", \n" +
                "возраст - " + wolf.getAge() + ", \n" +
                "окрас - " + wolf.getColor());
    }
}