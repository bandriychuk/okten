package lesson06_StreamAPI.lecture;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//
//        /*Predicate*/
////        Predicate<Person> personBornIn1994 = new Predicate<Person>() {
////            @Override
////            public boolean test(Person person) {
////                return person.getBirthDay().getYear() == 1994;
////            }
////        };
////
////        final boolean b = personBornIn1994.test(new Person(1, "Petro", 1, LocalDate.of(1994, 1, 1)));
////        System.out.println(b); // Result = false;
//
//        /*Stream API*/
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Petro", "Ukrainian", LocalDate.of(1994, 1, 1)));
        list.add(new Person(2, "Oksana", "Ukrainian", LocalDate.of(1991, 6, 21)));
        list.add(new Person(3, "Marta", "Polish", LocalDate.of(1993, 9, 11)));
        list.add(new Person(4, "Taras", "Ukrainian", LocalDate.of(2010, 3, 2)));
        list.add(new Person(5, "Oldest Man", "Polish", LocalDate.of(1980, 4, 12)));
        list.add(new Person(6, "Oldest Woman", "Hungarian", LocalDate.of(1980, 5, 12)));
//
//        /* 1. Вивести всі елементи на екран  */
////        list.forEach(person -> System.out.println(person));
////        list.stream().forEach(person -> System.out.println(person));
//
//        /* 2. Створити колекцію імен */
////        List<String> names = list.stream()
////                .map(person -> person.getName())// - тут у нас зараз стрім стірчок які ми отримали з list Person (з Іменами)
////                //.map(Person::getName) - метод референс (скорочення методу )
////                .collect(// - метод collect зпаковує отримані данні в нову колекцію
////                        Collectors.toList() // Метод Collectors.toList - спаковує колекцію в List
////                );
////        System.out.println(names);
//        /*  3. Посортувати по id */
        list.stream()
                .sorted(((o1, o2) -> o1.getBirthDay().getYear() - o2.getBirthDay().getYear()))
//                .sorted((Comparator.comparingInt(o -> o.getBirthDay().getYear())))// - альтернативне порівнняня
                .forEach(System.out::println);
    }
}
//
//        /* 4. Витягнути усіх повнолітніх */
////        int currentYear = LocalDate.now().getYear();
////        List<Person> adults = list.stream()
////                .filter(person -> currentYear - person.getBirthDay().getYear() >= 18)
////                .collect(Collectors.toList());
////        adults.forEach(System.out::println);
//
//        /* 5. Вибрати три перших та повернути їх в зворотньому порядку */
////        List<Person> a = list.stream()
////                .filter(person -> person.getName().endsWith("a")) //- фільтруємо людей в який імя закінчується на 'а'
////                .limit(2) // - обераємо перших 2 людей
////                .peek(System.out::println)
////                .collect(Collectors.toList());
//
////                .skip() // - пропускає в колекції вказану кільксть обєктів
////                .limit() // - обрізає в стрімі роботу з елментати колекції до вказаної нами кількості
////                .peek() // - робить все те саме що і foreach але не завершує стрім;
//
//
//        /* 6. Знайти найстаршу людину*/
//        // Почитати про Optional !!!
//
////        Optional<Person> max = list.stream()
////                .max(((o1, o2) -> o2.getBirthDay().compareTo(o1.getBirthDay())));
////        System.out.println(max);
//
//
////        List<String> collect = list
////                .stream()
////                .filter(person -> {
////                    System.out.println("Filter");
////                    return person.getName().endsWith("a");
////                })
////                .map(person -> {
////                    System.out.println("map");
////                    return person.getName();
////                })
////                .collect(Collectors.toList());
////
////        System.out.println(collect);
//
//        // Стріми міксують крокиви коннаня (фільтрації та мапування)
//
//        /* 7. Погрупувати людей по національності */
////        Map<String, List<Person>> collect = list.stream()
////                .collect(Collectors.groupingBy(Person::getNationality));
////        collect.entrySet().forEach(System.out::println);
//
//        /*8. Порахувати щасливе число по даті народження: скласти усі цифри дати народження
//         * Та посортувати по ньому
//         * Приклад: 12 (день) 03 (місяць) 1975 (рік) = 12031975 = 28=2 8=10=1 0=1
//         * */
//
////        list.stream()
////                .peek(person -> {
////                    LocalDate date = person.getBirthDay();
////                    final int year = date.getYear();
////                    final int monthValue = date.getMonthValue();
////                    final int dayOfMonth = date.getDayOfMonth();
////                    List<Integer> integers = toDigits(year);
////                    integers.addAll(toDigits(monthValue));
////                    integers.addAll(toDigits(dayOfMonth));
////                    int sum = 0;
////                    while (integers.size() > 1) {
////                        sum = integers.stream().mapToInt(Integer::intValue).sum();
////                        integers = toDigits(sum);
////                    }
////                    person.setLuckyNum(sum);
////                })
////                .sorted(((o1, o2) -> o1.getLuckyNum() - o2.getLuckyNum()))
////                .forEach(System.out::println);
//    }
//
//
//
//    public static List<Integer> toDigits(int num) {
//        List<Integer> digits = new ArrayList<>();
//        while (num > 0) {
//            digits.add(num % 10);
//            num = num / 10;
//        }
//        return digits;
//    }

//Особливості стрімів:
// 1. Стірм працює лише з тим типом данних який в нього заходить.
// 2. Map бере поточний обєк і конвертує обєкт в інший тип і на виході ми маємо стрім іншого типу.
// І обєкти на виході неможна поєднати з вхідними обєктами
//}


//Є 3 потоки:
//        1.Thread - Потік з точки зору програмування процесорів.Частина одного процесу стріму
//        2. Stream API - Функціональні інструменти для роботи з колекціями
//        3. I/O Stream - Пишемо файл / читаємо файли

// Функціональне програмування в Java забезпечується функціональними інтерфейсами
// Функціональні Інтерфейси - можуть мати лише один абстрактний метод;


/**
 * Функція яка приймає параметр та повертає boolean, (p1) -> boolean називається - Predicate;
 * Функція яка нічого не приймає та повертає результат,() -> result називається - Supplier;
 * Функція яка щось приймає але не повертає результат,(p1) -> void називається - Consumer;
 * Функція яка щось приймає i повертає результат,(p1) -> result називається - Function;
 * Функція яка приймає два параметри i повертає результат,(p1, p1) -> result називається - BiFunction;
 * Функція яка нічого не приймає та повертає результат,() -> result називається - Supplier;Функція яка щось приймає але не повертає результат,(p1) -> void називається - Consumer;Функція яка щось приймає i повертає результат,(p1) -> result називається - Function;Функція яка приймає два параметри i повертає результат,(p1, p1) -> result називається - BiFunction;
 **/
/**Функція яка нічого не приймає та повертає результат,() -> result називається - Supplier;**/
/**Функція яка щось приймає але не повертає результат,(p1) -> void називається - Consumer;**/
/**Функція яка щось приймає i повертає результат,(p1) -> result називається - Function;**/
/**Функція яка приймає два параметри i повертає результат,(p1, p1) -> result називається - BiFunction;**/

/* Методи Stream API:
 * 1. Конвеєрні методи - методи які повертають стрім та забезпечують продовження виклику стріма (map, flatmap,sorted, limit)
 * 2. Термінальні методи - методи які завершують стрім та щось повертають (findFirst, anyMatch, Collect, Reduce)
 * */

