package time.implementation;
public class RaceResults {

	String Rfid;
	String racetime;

	public RaceResults(String tagcod, String timeduration) {
		Rfid = tagcod;
		racetime = timeduration;

	}

	void onNewResult(String tagNumber, timeduration resultTime) {
		
	}

	void printResults() {

		System.out.println("The Tag Number is :" + Rfid);
		System.out.println("The time passed is :" + racetime);

	}
}
