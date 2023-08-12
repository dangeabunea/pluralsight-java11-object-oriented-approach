package pluralsight.oop;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
/* This demo is for defining and instantiating classes:
* We will model a flight plan which is a document that the dispatcher has with info of the flight, its make,
* model, engine type, routes etc.
*
* We will create an overloaded constructor:
* An overloaded constructor is a method which has the same name with
*  the class which activates the use of the class but spawn from the
* default constructor with varying variable types and or variable quantities.
*
*We will look at the order of execution
*
* CLASS DECLARATION
* Access Modifier  = public (can be private or protected)
* Keyword = class (to identify the type of java file we are creating, here a class holds an object's
*                   attributes (variables) and its behavior (methods/functions)
* Name = class name (FlightPlan)
* Class body = {}
*
* */
public class FlightPlan {
    //    Variable definition [format of declaring a variable = variableType variableName semicolon
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    //  Constructor Definition
//
    /*  ANATOMY
    * It has keyword private to avoid the class being instantiated elsewhere, this method should just
    * execute a command to set up the id, it returns void because there is nothing to be returned.
    *
    * ConstructorName == same className ideally a method is followed by arguments but,
    *  This is a noArgumentConstructor which is the default,
//    it does not carry any parameters in the ()
    * */
    private FlightPlan() {
        System.out.println("FlightPlan()");
//    This initializes the variable [id] to carry randomly generated characters and converts them toString
        this.id = UUID.randomUUID().toString();
    }

    /*Let's add more constructors to initialize the other fields
    * 2nd CONSTRUCTOR
     *  Takes departure & destination (which are in String format) as arguments,
     *  It will need to generate the id using the [this] keyword to call the first constructor ,
     * we check the parameters and initialize the arguments.
     *
     * */
    FlightPlan(String departure, String destination) {
        this();
        if (departure == null || destination == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("FlightPlan( %s, %s)", departure, destination));
        this.departure = departure;
        this.destination = destination;
    }

    //To initialize all the fields
    /* This will be the final constructor which will call the 2nd constructor by using the [this] keyword
     * and put the parameters (departure and destination) as arguments
     *
     * */
    FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        //calls the 2nd constructor so the validation of departure and destination logic is executed first
        this(departure, destination);
        if (departure == null || route == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("FlightPlan(%s,%s,%s,%s)",
                departure,
                destination,
                departureTime,
                route));
//        set the route and time
        this.route = route;
        this.departureTime = departureTime;
    }
//    its void, it just prints to the console
   public void print(){
        String msg = "{" +
                "id = '" + this.id + '\'' +
                "departure = '" + this.departure + '\'' +
                ", destination = '" + this.destination + '\'' +
                ", departureDateTime = '" + this.departureTime + '\'' +
                ", route = '" + this.route +
                '}';
       System.out.println(msg);
   }
//   Now the class is done, we need to add the execution in the entry point which is the main method
}