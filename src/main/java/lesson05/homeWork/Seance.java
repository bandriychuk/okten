package lesson05.homeWork;

public class Seance implements Comparable<Seance>{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = new Time(
          this.startTime.getMin() + this.movie.getDuration().getMin(),
          this.startTime.getHour() + this.movie.getDuration().getHour()
        );
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }


    @Override
    public int compareTo(Seance o) {
        return this.startTime.getHour()- o.startTime.getHour();
    }
}
