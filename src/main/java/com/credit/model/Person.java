package com.credit.model;

/**
 * Created by leo on 15/9/21.
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String gender;
    private double bMR;

    public double getbMR() {
        return bMR;
    }

    public void setbMR(double bMR) {
        this.bMR = bMR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, int age, double height, double weight, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", bMR=" + bMR +
                '}';
    }

    public double getBMR(Person person) {

        return person.getGender().equals("male") ? (13.7 * person.getWeight() + height * 5.0 - 6.8 * person.getAge() + 66) :
                (9.6 * person.getWeight() + 1.8 * person.getHeight() - 4.7 * person.getAge() + 655);
    }
}
