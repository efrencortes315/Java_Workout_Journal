package workoutjournal;

import java.io.Serializable;

public class Motion implements Serializable, Comparable<Motion>
{
    String name;
    int weight,numReps;
    Motion(String name, int weight, int numReps){
        this.name = name;
        this.weight = weight;
        this.numReps = numReps;               
    }
    public String toString(){
        return name + ": "+ weight + "lbs for " + numReps + " reps";
    }

    @Override
    public int compareTo(Motion o) {
      
        if (name.equals(o.name))
            return 0;
        return name.compareTo(o.name);
    
    }
    
}
