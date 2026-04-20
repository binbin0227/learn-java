package p09;

public class TaidiDog extends Dog {

    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的泰迪狗，正在吃骨头，边吃边蹭");
    }
}
