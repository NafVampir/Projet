package time.implementation;

import java.util.concurrent.TimeUnit;

public class timeduration implements time {

	int number;

	public timeduration(int t) throws BadValueException{
		number = t;
		if (number < 0) {
		 System.out.println("Only Positive Numbers & no Letters Please!");
		}
	}

	public String timetoString(long seconds) {

		long s = seconds % 60;
		long m = (seconds / 60) % 60;
		long h = (seconds / (60 * 60)) % 24;
		return String.format("%d:%02d:%02d", h, m, s);

	}

}
