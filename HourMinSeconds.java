import java.util.Scanner;

public class HourMinSeconds {
	public static void main(String args[]){
		int sec = 0;
		int min = 0;
		int hour = 0;
		int Tinput = 0;

		@SuppressWarnings("resource")
		Scanner TypedInput = new Scanner(System.in);

		System.out.println("Type in the number in seconds");
		Tinput = TypedInput.nextInt();


		sec = Tinput % 60;
		min = (Tinput / 60);
		while (min > 60){ 
			hour++;
			min = min - 60;
		}
		hour = Tinput / 3600;
		
		System.out.print("hours: " + hour + "  Minutes: " + min + "  Seconds: " + sec);
	}
}
