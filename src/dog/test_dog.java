package dog;

import java.lang.*;
public class test_dog {
    public static void main(String[] args) {
        dog d1 = new dog("Mike", 5);
        dog d2 = new dog("Helen", 7);
        dog d3 = new dog("Bob", 1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}