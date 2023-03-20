package transport;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
//        Задача 1
        System.out.println("Task 1");
        Stream<Person> personStream = Stream.of(new Person("Joe", 12),
                new Person("Alex", 127),
                new Person("Mia", 4),
                new Person("Jackson", 57),
                new Person("Flew", 69));

        BiConsumer<Person, Person> biConsumer = (min, max) -> System.out.println(min.toString() + max.toString());
        Comparator<Person> personComparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        findMinMax(personStream, personComparator, biConsumer);

//        Задача 2 из ДЗ
        System.out.println("");
        System.out.println("Task 2");
        List<Integer> numbers = Arrays.asList(1, 2, 13, 17, 22, 44, 54, 39, 11);
        findEvenNumbers(numbers);

    }

/**   Метод для задачи 1 - Напишите метод public static void findMinMax,
    который будет находить в стриме минимальный и максимальный элементы в соответствии с порядком,
    заданным Comparator'ом*/
    public static <T> void findMinMax(
            Stream <? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1) );
        }

    }

/**  Метод для 2 задачи - Реализуйте метод,
    который принимает на вход список целых чисел, определяет в списке количество четных чисел
    и выводит их в консоль*/
    public static void findEvenNumbers(List<Integer> list) {
        list.stream().filter(x -> x % 2 == 0).peek(System.out::println).count();
        System.out.println("Количество четных элементов = " + list.stream().filter(x -> x % 2 == 0).count());// это не требуется
//        по условиям задачи, но на всякий случай решил посчитать
    }
}
