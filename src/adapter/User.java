package adapter;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog("댕이"));
        animals.add(new Cat("습털이"));
        animals.add(new Cat("츄츄"));
        // animals.add(new Tiger("타이온")); // 직접 추가하면 오류 발생
        animals.add(new TigerAdapter("타이온")); // 어댑터를 통해 추가

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}

