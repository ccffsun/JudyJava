package learnXinYminutesJava;

public class PennyFarthing extends  Bicycle{
    public  PennyFarthing(int startCadence,int startSpeed){
        super(startCadence,startSpeed,0,"PennyFarthing");
    }
    @Override
    public  void setGear(int gear){
        this.gear=0;
    }
}
