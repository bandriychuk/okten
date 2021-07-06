//package lesson05.lecture;
//
//import java.util.*;
//
//public class Main {
//
//    static Map<Person, List<Car>> map = new HashMap<>();
//
//    public static void main(String[] args) {
////        Date date = new Date();
////        System.out.println(date);
////
////        String stringData = "12/01/1995";
////        LocalDate localDate = LocalDate.parse(stringData, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
////        System.out.println(localDate);
//
////        List<Person> personList = new ArrayList<>();
////        personList.add(new Person(1,"Taras",20));
////        personList.add(new Person(2,"Maria",10));
////        personList.add(new Person(3,"Petro",30));
////        personList.add(new Person(4,"Julia",40));
////
////        personList.sort((o1, o2) -> o1.getAge() - o2.getAge());
////
////        for (Person person : personList) {
////            System.out.println(person);
////        }
//
//
//        /**MAP**/
////        Map<String,Person> map = new TreeMap<>();
////        map.put("first", new Person(1,"Ostap",23));
////        map.put("second", new Person(2,"Julia",27));
////        map.put("third", new Person(3,"Petro", 29));
////
////        System.out.println(map);
////        printMap(map);
//
//        addNewPerson(new Person(1,"Petro",26));
//        addCarToPerson(1,new Car("BMW",2999,CarType.SUV));
//
//        addNewPerson(new Person(2,"Andriy",34));
//        addCarToPerson(2,new Car("audi A6",34000,CarType.SEDAN));
//        addCarToPerson(2,new Car("audi Q8",5000,CarType.SUV));
//        printMap(map);
//
//    }
//
////    public static void printMap(Map map) {
////        final Set<Map.Entry> set = map.entrySet();
////        for (Map.Entry entry : set) {
////            System.out.println(entry.getKey() + ":");
////            System.out.println("\t\t" + entry.getValue());
////        }
////    }
//
//    public static void printMap(Map map) {
//        final Set<Map.Entry<Person, List<Car>>> set = map.entrySet();
//        for (Map.Entry<Person, List<Car>> entry : set) {
//            System.out.println(entry.getKey() + ":");
//
//            final List<Car> cars = entry.getValue();
//            for (Car car : cars) {
//                System.out.println("\t" + car);
//            }
//        }
//    }
//
//    public static void addNewPerson(Person person) {
//        map.put(person, new ArrayList<>());
//    }
//
//    public static void addCarToPerson(int id, Car car) {
////        if (map.containsKey(person)) {
////            List<Car> cars = map.get(person);
////            cars.add(car);
////            System.out.println(String.format("Car %s is added for person id %s", car.getBrand(),id));
////        }else {
////            System.out.println("No such person " + person.getName());
////        }
//
//
//        Set<Person> keys = map.keySet(); // повертає сет ключів
//        for (Person personKey : keys) { // проходимось по сету ключів та шукаємо людину
//            if (personKey.getId() == id){ // шукаємо певну людину по ід
//                List<Car> cars = map.get(personKey); // якщо знаходимо то немає сенсу проходитись по всіх решта ключах та персонах
//                cars.add(car);
//                System.out.println(String.format("Car %s is added for person id %s", car.getBrand(),personKey.getName()));
//                return;
//            }
//        }
//    }
//
//    public static void removeCarFromPerson(Person person, Car car) {
//        if (map.containsKey(person)) {
//            List<Car> cars = map.get(person);
//            cars.remove(car);
//            System.out.println(String.format("Car %s is removed for person %s", car.getBrand(),person.getName()));
//        }else {
//            System.out.println("No such person " + person.getName());
//        }
//    }
//}
//
