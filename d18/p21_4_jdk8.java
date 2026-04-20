import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class p21_4_jdk8 {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2006, 2, 27);
        LocalDate today = LocalDate.now();
        long result = ChronoUnit.DAYS.between(birth, today);
        System.out.println(result);
    }
}
