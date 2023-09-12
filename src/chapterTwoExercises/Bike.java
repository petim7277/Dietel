package chapterTwoExercises;

public class Bike {
    boolean isOn;
    int speed;
    int gear;

    public void switchOnOrOff( ) {
        if (isOn){
            isOn = true;
        }
        if (!isOn){
            isOn = false;
        }
    }
    public boolean checkIson(){
        return isOn;
    }

    public void accelerateSpeed( ){
        if(speed == 15){ gear=1;
            speed= +1;
        this.speed=speed;
        }
        if(speed == 24){ gear=2;
    speed=+2;

            this.speed = speed ;
        }
        if (speed == 35){gear=3;
            speed=+3;
            this.speed= speed ;
        }
        if (speed==44){gear=4;
            speed=+4;
            this.speed = speed ;
        }

    }
    public void deccelerateSpeed() {
        if (speed == 15) {
            gear = 1;
            speed = -1;
            this.speed = speed;
        }
        if (speed == 24) {
            gear = 2;
            speed = -2;

            this.speed = speed;
        }
        if (speed == 35) {
            gear = 3;
            speed = -3;
            this.speed = speed;
        }
        if (speed == 44) {
            gear = 4;
            speed = -4;
            this.speed = speed;
        }
    }
    public int getSpeed () {
        return speed;
    }

}
