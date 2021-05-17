package swarts;

import java.awt.*;

public class IntroduceMyself {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IntroduceMyself(String name) {
        setName(name);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + getName());
    }

    public static void main(String[] args) {
        IntroduceMyself greeting = new IntroduceMyself("Dallin");
        greeting.sayHello();
    }
}
