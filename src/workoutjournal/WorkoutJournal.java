package workoutjournal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class WorkoutJournal
{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
        
        //Motion mot = new Motion("Bench Press",315,10);
         
        //Motion mot2 = new Motion("Incline Bench Press",225,10);
        //Motion mot3 = new Motion("Decline Hammer Press",180,10);
        //Workout test = new Workout();
        //test = loadWorkout();
        NewJFrame test1 = new NewJFrame();         
        test1.show();
        //System.out.println(test);
        
    }
    static void saveWorkout(Workout toBeSaved) throws FileNotFoundException, IOException{
         // Write to disk with FileOutputStream
         FileOutputStream f_out = new FileOutputStream("saves/myobject.data");

         // Write object with ObjectOutputStream
         ObjectOutputStream obj_out = new ObjectOutputStream (f_out);

         // Write object out to disk
         obj_out.writeObject ( toBeSaved );
    }
    static Workout loadWorkout() throws FileNotFoundException, IOException, ClassNotFoundException{
                    // Read from disk using FileInputStream
                    
                    
            FileInputStream f_in = new FileInputStream("saves/myobject.data");
            
            // Read object using ObjectInputStream
            ObjectInputStream obj_in = 
                    new ObjectInputStream (f_in);

            // Read an object
            Object obj = obj_in.readObject();

            if (obj instanceof Workout)
            {
                    // Cast object to a Vector
                    Workout load = (Workout) obj;
                    return load;
                    // Do something with vector....
            }
            return null;
    }
}
