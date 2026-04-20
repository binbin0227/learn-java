package p12;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void Eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫咪着眼睛侧着头吃"+food);
    }
}
