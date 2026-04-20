package p1;

public class Test {
    public static void main(String[] args) {
        Role r1 = new Role("Tom", 100);
        Role r2 = new Role("Amy", 100);
        while (true) {
            r1.attack(r2);
            if ( r2.getBlood() <=0){
                break;
            }
                    r2.attack(r1);
            if ( r1.getBlood() <=0) {
                break;
            }
        }
    }
}
