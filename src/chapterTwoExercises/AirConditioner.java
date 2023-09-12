package chapterTwoExercises;

public class AirConditioner {
    private int temperature = 16;
    private boolean isOn =false ;


    public void switchOn(){
        this.isOn=true;
    }
    public void switchOff(){
        this.isOn=false;
    }
    public void setTemperature(int temperature){
       if(isOn=true && temperature>=16&&temperature<=30)
           this.temperature=temperature;
    }
public void increaseTemperature(){
        if(this.isOn=true && temperature<30)
            temperature=temperature+1;
}
public void decreaseTemperature(){
        if(this.isOn=true &&temperature>=16)
            temperature=temperature-1;
}
public int getTemperature(){
        return temperature;
}
}
