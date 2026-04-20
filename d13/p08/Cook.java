package p08;

public class Cook {
    private String id;
    private String name;
    private int Money;

    public Cook() {
    }

    public Cook(String id, String name, int Money) {
        this.id = id;
        this.name = name;
        this.Money = Money;
    }

    public void Eat() {
        System.out.println("吃饭");
    }

    public void Work() {
        System.out.println("炒菜");
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return Money
     */
    public int getMoney() {
        return Money;
    }

    /**
     * 设置
     * @param Money
     */
    public void setMoney(int Money) {
        this.Money = Money;
    }

    public String toString() {
        return "Cook{id = " + id + ", name = " + name + ", Money = " + Money + "}";
    }
}
