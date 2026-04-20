package p12;

public class Person {
    private String name;
    private int age;

    public void keepPet(Animal animal, String food) {
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的动物");
        if (animal instanceof Dog d){
            d.Eat(food);
        }else if (animal instanceof Cat c){
            c.Eat(food);
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
