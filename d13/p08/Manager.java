package p08;

public class Manager extends Cook {
    int extraMoney;

    public Manager() {
    }

    public Manager(String id, String name, int Money, int extraMoney) {
        super(id, name, Money);
        this.extraMoney = extraMoney;
    }

    @Override
    public void Work() {
        System.out.println("管理");
    }

    /**
     * 获取
     *
     * @return extraMoney
     */
    public int getExtraMoney() {
        return extraMoney;
    }

    /**
     * 设置
     *
     * @param extraMoney
     */
    public void setExtraMoney(int extraMoney) {
        this.extraMoney = extraMoney;
    }

    public String toString() {
        return "Manager{extraMoney = " + extraMoney + "}";
    }
}
