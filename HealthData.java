import java.util.Scanner;

public class HealthData {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
      int userAgeHours = 0;
      int userAgeMinutes = 0;
      int userAgeSeconds = 0;
      int userBeatsPerMinute = 0;
      int userSneezesPerDay = 0;
      int userCaloriesPerDay = 0;
      int userBlinks = 0;
      int userBlink = 0;
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
      userAgeHours = userAgeDays * 24;
      userAgeMinutes = userAgeHours * 60;
      userAgeSeconds = userAgeMinutes % 60;
      userBeatsPerMinute = userAgeMinutes * 72;
      userSneezesPerDay = userAgeDays * 3;
      userCaloriesPerDay = userAgeDays * 2400;
      userBlinks=userAgeDays * 28800;
      userBlink = userBlinks * 365;
      
      System.out.println("You are " + userAgeMinutes + " minutes old and " + userAgeSeconds + " seconds old. ");
      System.out.println("Your heartbeats in your lifetime are " + userBeatsPerMinute);
      System.out.println("Your Sneezes in your lifetime are " + userSneezesPerDay);
      System.out.println("Your Calories in your lifetime  are " + userCaloriesPerDay);
      System.out.println("You have blinked " + userBlink + " in your lifetime");
      
      return;
      }
   }