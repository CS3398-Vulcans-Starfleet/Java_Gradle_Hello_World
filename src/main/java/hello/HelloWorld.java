package hello;
/* Get a time library */
import org.joda.time.LocalTime;

<<<<<<< Updated upstream
public class HelloWorld
{
	/* test travis-ci */
=======
//I'm making a comment
public class HelloWorld
{
	/* master comment */
  // Mason's comment
>>>>>>> Stashed changes
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
