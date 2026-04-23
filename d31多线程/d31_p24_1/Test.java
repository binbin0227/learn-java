package d31_p24_1;

public class Test {
    public static void main(String[] args) {
        TicketWindow tw1 = new TicketWindow();
        TicketWindow tw2 = new TicketWindow();
        tw1.setName("A窗口");
        tw2.setName("B窗口");
        tw1.start();
        tw2.start();
    }
}
