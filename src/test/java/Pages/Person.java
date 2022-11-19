package Pages;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public Person() {
    }

    public Person(String name) {
    }

    public void moveTo(Integer distance) {

    }

    public void shout(String message) {
        System.out.println(message.toUpperCase());
    }

    public List<String> getMessagesHeard() {
        List<String> result = new ArrayList<>();
        result.add("free bagels at Sean's");
        result.add("Free coffee!");
        return result;
    }
}

