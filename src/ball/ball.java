package ball;
import java.lang.*;
public class ball {
    private String color;
    private int radius;
    public ball(String n, int a){
        color = n;
        radius = a;
    }
    public ball(String n){
        color = n;
        radius = 0;

    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String name) {
        this.color = name;
    }
    public String getColor(String name){
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoBallFit(){
        System.out.println("In this basket will fit "+(1000/radius));
    }
}