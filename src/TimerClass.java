import java.awt.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {
    public static void main(String[] args){
        //Timer : A facility for threads to schedule tasks for future
        //        execution in a background thread.

        //TimerTask : A task that  can be scheduled for one time
        //            or repeated execution by a Timer.

        Toolkit tk=Toolkit.getDefaultToolkit();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int countDown=40;
            @Override
            public void run() {

                if (countDown > 0) {
                    System.out.print(countDown + " Seconds\r");
                    tk.beep();
                    countDown--;
                } else {
                    System.out.println("Task is complete : )");
                    timer.cancel();
                }
            }

        };
        Calendar date = Calendar.getInstance();
        date.set(2024, Calendar.MAY,22,21,23,0);
//        timer.schedule(task,3000);
//        timer.schedule(task,date.getTime());
        timer.scheduleAtFixedRate(task,0,1000);
//        timer.scheduleAtFixedRate(task,date.getTime(),1000);

    }
}
