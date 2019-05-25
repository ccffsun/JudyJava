package learnXinYminutesJava;

public class Bicycle {
    public int cadence;
    private int speed;
    protected int gear;
    String name;
    static String classnName;
    static {
        classnName="Bicycle";
    }
    public Bicycle(){
        gear=1;
        cadence=50;
        speed=5;
        name="Bontrager";
    }
    public  Bicycle(int startCadence,int startSpeed,int startGear,String name){
        this.gear=startGear;
        this.cadence=startCadence;
        this.speed=startSpeed;
        this.name=name;
    }
    public int getCadence(){
        return cadence;
    }
    public  void  setCadence(int newValue){
        cadence=newValue;
    }
    public  void setGear(int newValue){
        gear=newValue;
    }
    public  void speedUp(int increment){
        speed+=increment;
    }
    public  void  slowDown(int decrement){
        speed-=decrement;
    }
    public  void  setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
    @Override
    public  String toString(){
        return "gear: "+gear+" cadence: "+cadence+" speed: "+speed+" name: "+name;
    }
}
