package lesson05.homeWork;

import java.time.LocalDateTime;
import java.util.*;

public class Cinema {
    private TreeMap<Days, Schedule> map = new TreeMap<>();
    private Time open;
    private Time close;

    LocalDateTime localDateTime =  LocalDateTime.now();

    public Cinema(TreeMap<Days, Schedule> map, Time open, Time close) {
        this.map = map;
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        for (Map.Entry<Days, Schedule> entry : entrySet) {
            TreeSet<Seance> seances = entry.getValue().getSeances();
            for (Seance seance : seances) {
                if (seance.getStartTime().getHour() > open.getHour() && seance.getStartTime().getMin() > open.getMin()) {
                    System.out.println("Cinema is open");
                } else {
                    System.out.println("Cinema is closed!");
                }if (seance.getEndTime().getHour() < close.getHour() && seance.getEndTime().getMin() < close.getMin()) {
                    System.out.println("ok");
                } else {
                    System.out.println("Error on close");
                }
            }
        }
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getMap() {
        return map;
    }

    public void setMap(TreeMap<Days, Schedule> map) {
        this.map = map;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(map, cinema.map) && Objects.equals(open, cinema.open) && Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "map=" + map +
                ", open=" + open +
                ", close=" + close +
                '}';
    }

    public void addSeance(String day, Seance... seance) {
        Days[] values = Days.values();
        Days choosenDay = null;
        for (Days value : values) {
            if (value.name().equals(day)) {
                choosenDay = value;
            }
        }
        Schedule schedule = map.get(choosenDay);
        for (Seance s : seance) {
            schedule.addSeance(s);
        }
    }

    public void removeMove(Movie movie) {
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            Schedule schedule = next.getValue();
            TreeSet<Seance> seances = schedule.getSeances();
            Iterator<Seance> seanceIterator = seances.iterator();
            while (seanceIterator.hasNext()) {
                Seance seance = seanceIterator.next();
                if (seance.getMovie().equals(movie)) {
                    seanceIterator.remove();
                }
            }

        }
    }
    
    public void removeSeance(Seance seance, Days days){
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        for (Map.Entry<Days, Schedule> entry : entrySet) {
            if (entry.getKey().equals(days)){
                entry.getValue().removeSeance(seance);
            }
            
        }
    }
}
