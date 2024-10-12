package itmo.java.mrpandaline.lab2;
import static java.lang.Math.random;

public class MyUtils {
    public static boolean chance(double chance){
        return random() < chance;
    }
}
