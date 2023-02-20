package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void attack() {
        System.out.println("Атакуем противника");
    }

    void runAway() {
        System.out.println("Бежим!");
    }

    void rest() {
        System.out.println("Отдыхаем");
    }

    @Override
    public String toString() {
        return "Модель - " + modelName + ",\n" +
                "Марка - " + mark + ",\n" +
                "Страна производитель " + origin + ",\n" +
                "Высота робота - " + height + ",\n" +
                "Высота робота - " + weight + ",\n";
    }
}
