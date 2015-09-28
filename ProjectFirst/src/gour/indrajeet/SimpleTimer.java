package gour.indrajeet;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimer {

    class Checker extends TimerTask {
        public static final int DELAY = 60 * 1000;
     
        public void run() {

            doCheck();

        }


        private void doCheck() {
            System.out.println("Current time is: " + System.currentTimeMillis());
        }
    }

    public static void main (String argv) {

        Timer timer = new Timer(); // start the timer thread
        timer.schedule(Checker(), Checker.DELAY,
                Checker.DELAY); // calls the Checker's run() method after one minute and repeat every one minute.
    }

	private static TimerTask Checker() {
		// TODO Auto-generated method stub
		return null;
	}


}