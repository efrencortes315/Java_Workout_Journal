package workoutjournal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Workout implements Serializable
{
    ArrayList<Motion> test = new ArrayList<>();
    int numSets;
    Workout(){
        numSets=0;
    }
    void addSet(Motion next){
        test.add(next);
        numSets++;
        Collections.sort(test);
    }
    void removeSet(String name,int wgt,int rps){
        for(int i=0;i<numSets;i++){
            if(test.get(i).name.equals(name)&&test.get(i).weight==wgt&&test.get(i).numReps==rps){
                test.remove(i);
            }
        }
        numSets--;
    }
   
    public String toString(){
        String s="";
       for(int i=0;i<numSets;i++){
           s+=test.get(i).toString()+"\n"; 
        }
       return s;
    }
    
}
