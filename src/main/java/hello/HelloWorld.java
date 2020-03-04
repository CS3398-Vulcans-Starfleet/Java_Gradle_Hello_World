package hello;
//Adding this comment for assignment 7
/* Get a time library */
//Lets see if this works?
import org.joda.time.LocalTime;

public class HelloWorld 
{
	/* master comment */
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}

