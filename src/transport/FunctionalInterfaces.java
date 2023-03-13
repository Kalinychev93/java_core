package transport;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {

/**        Домашнее задание по теме Functional interfaces & Lambda */

        System.out.println("Homework. Theme: Functional Interfaces & Lambda.");
        System.out.println("");

//        1.1. Реализация Predicate через анонимный класс
        System.out.println("Interface Predicate");
        System.out.println("Implementation 1.");
        Predicate<Integer> negative = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0 || integer == 0;
            }
        };

        System.out.println(negative.test(10));
        System.out.println(negative.test(217));
        System.out.println(negative.test(-3142));
        System.out.println(negative.test(0));

//        1.2. Реализация Predicate через лямбда-выражение
        System.out.println("");
        System.out.println("Implementation 2.Lambda.");
        Predicate<Integer> negative2 = i -> i > 0 || i == 0;

        System.out.println(negative2.test(-700));
        System.out.println(negative2.test(300));
        System.out.println(negative2.test(0));
        System.out.println(negative2.test(-17865));

//        1.3. Реализация Predicate с помощью метода or (для закрепления материала)
        System.out.println("");
        System.out.println("Implementation 3. Methods of Predicate");

        Predicate<Integer> test1 = i -> i > 0;
        Predicate<Integer> test2 = i -> i == 0;

        System.out.println(test1.or(test2).test(300));
        System.out.println(test1.or(test2).test(0));
        System.out.println(test1.or(test2).test(-13));

        System.out.println("");

//        2.1. Реализация Consumer через анонимный класс
        System.out.println("Interface Consumer");
        System.out.println("Implementation 1.");
        Consumer<String> greetings = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name);
            }
        };

        greetings.accept("Jack");
        greetings.accept("Julia");

        System.out.println("");

//        2.2. Реализация Consumer через лямбда-выражение
        System.out.println("Interface Consumer");
        System.out.println("Implementation 2. Lambda");

        Consumer<String> greetings2 = s -> System.out.println("Привет, " + s);

        greetings2.accept("Николай");

        System.out.println("");

//        3.1. Реализация Function через анонимный класс
        System.out.println("Interface Function");
        System.out.println("Implementation 1.");
        Function<Double, Long> rounding = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        System.out.println(rounding.apply(2.789));
        System.out.println(rounding.apply(15.1234));
        System.out.println("");

//        3.2. Реализация Function через лямбда-выражение
        System.out.println("Interface Function");
        System.out.println("Implementation 2.Lambda");

        Function<Double, Long> rounding2 = d -> Math.round(d);

        System.out.println(rounding2.apply(2.14));
        System.out.println(rounding2.apply(-27.99));
        System.out.println("");

//        4.1. Реализация Supplier через анонимный класс
        System.out.println("Interface Supplier");
        System.out.println("Implementation 1.");

        Supplier<Integer> randomNumber = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        System.out.println(randomNumber.get());
        System.out.println("");

//        4.2. Реализация Supplier через лямбда-выражение
        System.out.println("Interface Supplier");
        System.out.println("Implementation 2.Lambda");

        Supplier<Integer> newRandomNumber = () -> (int) (Math.random() * 100);
        System.out.println(newRandomNumber.get());












    }
}
