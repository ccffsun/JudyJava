package ood.DuckCompare;

/*
 1. First we creat a duck array
 Duck[] ducks = { new Duck("Daffy", 8), .....}

 2.Invoke Arrays.sort(ducks);

 3.compare two ducks at a time.
   write a compareTo() method to do the work.

 4.ducks[0].compareTo(ducks[1])
   ducks[0] is the first duck
   ducks[1] is the object to be compared
   ducks[0] < ducks[1] return -1
   ducks[0] == ducks[1] return 0
   ducks[0] > ducks[1] return 1  =>  swap the two duck

   ducks[0] will continue to do the compare with ducks[2], ducks[3], ducks[4]....ducks[ducks.length-1]
   to make sure ducks[0] is the lightest duck in the array.
   then compare duck[1], duck[2].....

 */

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weight " + weight;
    }

    public int compareTo(Object object){

        Duck otherDuck = (Duck) object;

        if(this.weight < otherDuck.weight) {
            return -1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else{
            return 1;
        }
    }
}
