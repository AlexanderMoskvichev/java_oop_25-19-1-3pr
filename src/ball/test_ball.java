package ball;
import java.lang.*;
public class test_ball {
    public static void main(String[] args) {
        ball d1 = new ball("red", 50);
        ball d2 = new ball("green", 25);
        ball d3 = new ball("yellow", 30);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoBallFit();
        d2.intoBallFit();
        d3.intoBallFit();
    }
}
