package OrbitalMechanics;
import java.time.Duration;
public class Clock 
{
	//Time Values
	private static long time = 0;//No need to worry about overflow. Using a long to count seconds provides nearly 300 billion years of playtime.
	public static long getTime() { return time; }
	
	//Date Values
	private static int year = 0;
	private static int day = 0;
	private static int hour = 0;
	private static int minute = 0;
	private static int second = 0;
	

//================================================================================================================================
//Clock functions
	
	//Iterates the Time and Date Functions
	private static void stepClock()
	{
		time++;
		second++;
		if(second >= 60)
		{
			second = 0;
			minute++;
		}
		if(minute >= 60)
		{
			minute = 0;
			hour++;
		}
		if(hour >= 24)
		{
			hour = 0;
			day++;
		}
		if(day >= 365)
		{
			day = 0;
			year++;
		}
	}
	
	//Ticks the clock
	public static void tick(double seconds)
	{
		try
		{
		    Thread.sleep((int)seconds * 1000);
		    stepClock();
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
	
//=====================================================================================================================================
//Accessor and Mutator Methods
	

	public static int getYear() { return year; }

	public static void setYear(int year) {	Clock.year = year; }

	public static int getDay() { return day; }

	public static void setDay(int day) { Clock.day = day; }

	public static int getHour() { return hour; }

	public static void setHour(int hour) { Clock.hour = hour;	}

	public static int getMinute() {	return minute; }

	public static void setMinute(int minute) {	Clock.minute = minute; }

	public static int getSecond() {	return second;}

	public static void setSecond(int second) {	Clock.second = second; }

	public static void setTime(long time) {	Clock.time = time; }

}

