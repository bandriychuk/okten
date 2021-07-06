//package lesson05.homeWork;
//
//import java.util.TreeMap;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Time timeOpen = new Time(9,30);
//        Time timeClose = new Time(18,0);
//
//        Movie movie = new Movie("testMovie",new Time(1,20));
//
//        Seance seance = new Seance(movie,new Time(9,30));
//        TreeMap<Days,Schedule> map = new TreeMap<>();
//
//        Schedule schedule = new Schedule();
//
//        map.put(Days.MONDAY,schedule);
//        Cinema cinema = new Cinema(map,timeOpen,timeClose);
//        System.out.println(cinema);
//
//    }
//}
