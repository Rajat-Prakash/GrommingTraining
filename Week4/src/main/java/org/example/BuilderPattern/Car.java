package org.example.BuilderPattern;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final int doors;
    static public Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private int doors;

        public Builder make(String make){
            this.make=make;
            return this;
        }
        public Builder model(String model){
            this.model=model;
            return this;
        }
        public Builder year(int year){
            this.year=year;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.doors = builder.doors;
    }

    public static void main(String[] args) {
        Car car1 = Car.builder()
                .make("BMW")
                .color("red")
                .build();

        Car car2= Car.builder()
                .make("Honda")
                .model("abc")
                .year(2020)
                .build();

        System.out.println(car1.make+" "+car1.model+" "+car1.year+" "+car1.color+" "+car1.doors);
        System.out.println(car2.make+" "+car2.model+" "+car2.year+" "+car2.color+" "+car2.doors);

    }
}

