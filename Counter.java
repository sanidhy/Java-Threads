import java.util.*;
import java.lang.*;

class Counter{
    private int counter=0;
    public synchronized void incrementor(){
        counter++;
    }
    public int getCount(){
        return counter;
    }
}