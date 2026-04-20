package p1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }

    public void attack(Role role) {
        Random r = new Random();
        int reduce = r.nextInt(50) + 1;
        role.setBlood(role.getBlood() - reduce);
        if (role.getBlood() > 0) {
            System.out.println(this.getName() + "打了" + role.getName() + "，扣了" + reduce + "剩" + role.getBlood());
        } else{
            System.out.println(this.getName() + "KO" + role.getName() + "，"+this.getName()+"获胜");
        }
    }
}
