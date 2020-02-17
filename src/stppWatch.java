import java.time.LocalDate;
import java.time.LocalTime;

public class stppWatch {
   private double startTime,stopTime;

    public stppWatch(){};
    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
       return startTime;
    }

    public void setStopTime() {
       this.stopTime = System.currentTimeMillis();
    }

    public double getStopTime() {
       return stopTime;
    }

    public double getElapsedTime(){
        return getStopTime() - getStartTime();
    }
}
