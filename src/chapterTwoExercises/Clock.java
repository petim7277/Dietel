package chapterTwoExercises;

public class Clock {

    private int hours;
private int minutes;
private int seconds;
public Clock(int hours,int seconds,int minutes){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}
public void setHours(int hours){
    if(hours>23){
    this.hours = 0;
    } else  {this.hours = hours;

    }
}
public void setMinutes(int minutes){
    if(minutes>23){
    this.minutes = 0;  
    }else{this.minutes = minutes ;
    }
}
public void setSeconds(int seconds){
    if(seconds>23){
        this.seconds = 0;
    }else {this.seconds = seconds;  
    }
}

public int getHours(){
    return hours;
}

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }
}
