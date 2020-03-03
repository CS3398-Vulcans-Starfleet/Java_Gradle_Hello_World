package hello;
/* Get a time library */
import org.joda.time.LocalTime;

public class HelloWorld 
{
	/* master comment */
    //Anthony comment #2
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}

