package swarts;

import java.awt.*;

public class IntroduceMyself {
    private String collaboratorName;
    private String name;

    public String getName() {
        return name;
    }

    public String getCollaboratorName() {
        return collaboratorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollaboratorName(String collaboratorName) {
        this.collaboratorName = collaboratorName;
    }

    public IntroduceMyself(String name) {
        setName(name);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + getName());
    }

    public void replyBack(){System.out.println("Hello " + getName() + ", my name is " + getCollaboratorName() + ".");}

    public static void main(String[] args) {
        IntroduceMyself greeting = new IntroduceMyself("Dallin");
        greeting.sayHello();
        greeting.setCollaboratorName("Frances");
        greeting.replyBack();
        greeting.setCollaboratorName("Elijah");
        greeting.replyBack();
    }
}
