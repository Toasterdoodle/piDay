import java.awt.event.*;
import javax.swing.*;

public class Gregleib {

    //instance fields
    private double denominator;
    private double pie;
    private double addNum;
    private int timeElapsed;
    private Timer timer;

    //constructor
    public Gregleib(){

        denominator = 1;
        addNum = 2;

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //Performs task inside here

                timeElapsed = timeElapsed + 1;

            }
        };

        timer = new Timer(100, taskPerformer);

    }

    //methods
    public void calculate(int repetitions){

        timer.start();

        while(repetitions >= 0){

            pie = pie + (4/denominator);
            repetitions--;
            denominator = denominator  + addNum;
            denominator *= -1;
            addNum *= -1;
            System.out.println(pie);

        }

        timer.stop();
        System.out.println("=============================");
        System.out.println("Your final answer is: " + pie);
        System.out.println("Time Elapsed: " + timeElapsed + " deci-seconds");

    }

}//end class
