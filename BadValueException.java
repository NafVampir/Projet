package time.implementation;

public class BadValueException extends Exception  {
	
    private int timevalue;

	public BadValueException(int illegalValue) {
		timevalue = illegalValue;
    }
	public String toString() {
        return "Illegal value time: " + timevalue;
    }
}
