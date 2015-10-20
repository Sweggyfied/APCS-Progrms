
import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet(in caps): ");
      origTweet = scnr.next();
      
      
      
      if (origTweet.equalsIgnoreCase("LOL")) {
         System.out.println("LOL = laughing out loud");
      }
      else if (origTweet.equalsIgnoreCase("BFN")) {
         System.out.println("BFN = bye for now");
      }
      else if (origTweet.equalsIgnoreCase("FTW")) {
         System.out.println("FTW = for the win");
      }
      else if (origTweet.equalsIgnoreCase("TTYL")) {
         System.out.println("TTYL = talk to you later");
      }
      else if (origTweet.equalsIgnoreCase("THX")) {
         System.out.println("THX = thanks");
      }
      else if (origTweet.equalsIgnoreCase("TY")) {
         System.out.println("TY = thank you");
      }
      else if (origTweet.equalsIgnoreCase("WYSIWYG")) {
         System.out.println("WYSIWYG = what you see is what you get");
      }
      else if (origTweet.equalsIgnoreCase("PPL")) {
         System.out.println("PPL = people");
      }
      else if (origTweet.equalsIgnoreCase("LMK")) {
         System.out.println("LMK = Let me know");
      }
      else if (origTweet.equalsIgnoreCase("PLZ") || origTweet.equalsIgnoreCase("PLS")) {
         System.out.println("PLZ or PLS = please");
      }
      else if (origTweet.equalsIgnoreCase("NOOB")) {
         System.out.println("NOOB = Newbie (someone who is new at something)");
      }
      else if (origTweet.equalsIgnoreCase("N/A")) {
         System.out.println("N/A = Not available");
      }
      else if (origTweet.equalsIgnoreCase("JK") || origTweet.equalsIgnoreCase("J/K")) {
         System.out.println("JK or J/K = just kidding");
      }
      else if (origTweet.equalsIgnoreCase("IRL")) {
         System.out.println("IRL = in real life");
      }
      //----------------------ERRORS---------------------------
      switch (origTweet.substring(0, 2)){
      case "ll":
         System.out.println("Did you mean : LOL?");
         break;
      case "bn":
         System.out.println("Did you mean : BFN?");
         break;
      case "fw":
         System.out.println("Did you mean : FTW?");
         break;
      case "ty":
         System.out.println("Did you mean : TTYL?");
         break;
      case "yl":
         System.out.println("Did you mean : TTYL?");
         break;
      case "tx":
         System.out.println("Did you mean : THX");
         break;
      case "yt":
         System.out.println("Did you mean : TY?");
         break;
      case "lp":
         System.out.println("Did you mean : PPL?");
         break;
      case "KJ":
         System.out.println("Did you mean : JK");
         break;
      case "oo":
         System.out.println("Did you mean : NOOB");
         break;
      default:
         System.out.println("");
         break;
      }
      
      //--------------------END OF ERRORS----------------------

      if(origTweet.length() <= 140 ){


          if (origTweet.indexOf("LOL") != -1) {
             System.out.println("LOL = laughing out loud");
          }
           if (origTweet.indexOf("BFN") != -1) {
             System.out.println("BFN = bye for now");
          }
           if (origTweet.indexOf("FTW") != -1 ) {
             System.out.println("FTW = for the win");
          }
           if (origTweet.indexOf("IRL") != -1) {
             System.out.println("IRL = in real life");
          }
           if (origTweet.indexOf("TTYL") != -1) {
              System.out.println("TTYL = Talk To You Later ");
           }
           if (origTweet.indexOf("THX")!= -1) {
              System.out.println("THX = Thanks");
           }
           if (origTweet.indexOf("TY")!= -1) {
               System.out.println("TY = Thank You");
            }
           if (origTweet.indexOf("JK") != -1) {
              System.out.println("JK = Joking ");
           }
           if (origTweet.indexOf("Noob")!= -1) {
              System.out.println("Noob = newbie (new at something)");
           }  
    }
    else {
    System.out.println("This is longer than 140 characters. ");	
    }
      
      
      origTweet = origTweet.replace("LOL", "laughing out loud");
      origTweet = origTweet.replace("BFN", "bye for now");
      origTweet = origTweet.replace("FTW", "for the win");    
      origTweet = origTweet.replace("IRL", "in real life");      
      origTweet = origTweet.replace("TTYL", "talk to you later");    
      origTweet = origTweet.replace("THX", "thanks");    
      origTweet = origTweet.replace("TY", "thank you");
      origTweet = origTweet.replace("JK", "joking");    
      origTweet = origTweet.replace("NOOB", "newbie");    
      System.out.println(origTweet);
      return;
   }
}

