package transport;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {
    public static void main(String[] args) {
        final List<UserForTestStream> userList = Arrays.asList(
                new UserForTestStream(1, "Michael", "Robert", 37, "TR"),
                new UserForTestStream(2, "Mary", "Patricia", 11, "EN"),
                new UserForTestStream(3, "John", "Michael", 7, "FR"),
                new UserForTestStream(4, "Jennifer", "Linda", 77, "TR"),
                new UserForTestStream(5, "William", "Elizabeth", 23, "US"),
                new UserForTestStream(6, "Sue", "Jackson", 11, "IT"),
                new UserForTestStream(7, "Michael", "Tommy", 37, "EN")
        );

//    Перебор всех элементов списка и вывод их в консоль
        System.out.println("Перебор элементов списка и вывод в консоль");
        userList.stream().forEach(System.out::println);

//    Сортировка элементов списка по возрасту
        System.out.println("");
        System.out.println("Сортировка элементов списка по возрасту");

        userList.stream()
                .sorted(Comparator.comparing(UserForTestStream::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//    Сортировка списка по нескольким свойствам: age, firstName, lastName.
        System.out.println("");
        System.out.println("Сортировка списка по нескольким свойствам: age, firstName, lastName.");
        userList.stream()
                .sorted(Comparator.comparing(UserForTestStream::getAge)
                        .thenComparing(UserForTestStream::getFirstName)
                        .thenComparing(UserForTestStream::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }


}
