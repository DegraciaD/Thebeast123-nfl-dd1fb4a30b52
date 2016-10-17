package theappacademy.nfl;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;

    public Random rand;


    private Predictions() {
        rand = new Random();
       answers = new String[] {
                 "Who will win the superbowl",
                 "the buffalo bills have a 30% chance to make it in the super bowl",
               "the miami dolphins will have a 50% chance to make in the super bowl",
               "the new england patriots will have an 8% percent chance to make it in the super bowl",
               "the new york jets will have a 30 percent chance to make it in the super bowl",
               "the baltimore ravens will have a 30% chance to make it in the super bowl",
               "the cincinnati bengals have a 14% chance to make it in the super bowl",
              "the clevlend browns have a 100%  chance to make it in the super bowl",
               "the pittsburgh steelers will have 8% percent chanceto make it to the super bowl"
       };
    }

    public static Predictions get() {
        if(predictions == null) {
           predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction(){
        int number = rand.nextInt(10);
        return answers[1];
    }


}
