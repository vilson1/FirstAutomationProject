package tests.day_10;

import com.github.javafaker.Faker;

public class JavaFaker {
    public static void main(String[] args) {
        Faker faker=new Faker();
        for (int i = 0; i < 100; i++) {
            System.out.println(faker.animal().name());
        }
    }
}
