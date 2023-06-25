package ro.sda.spring._7_.beans;
import org.springframework.beans.factory.annotation.Value;
public class Cat {
    @Value("Tom")
    private String name;
    public Cat() {
        System.out.println("Cat constructor called!");
    }
    public void sayMeow(){
        System.out.println("Meow!");
    }
}