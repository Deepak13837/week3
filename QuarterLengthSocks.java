package sockscommand;


/**
 * @description QuarterLengthSocks Class
 * @author Deepak
 */


public class QuarterLengthSocks {
    //propertry name
    String name;
    /*
    * Constructor
    * @param String name
    * @return None
    */
    public QuarterLengthSocks( String name ) {
        this.name = name;
    }
    /*
    * Running function
    * @param None
    * @return None
    */
    public void running(){
        System.out.println( name + " used for running");
    }
    /*
    * Workout function
    * @param None
    * @return None
    */
    public void workout(){
        System.out.println( name + " used for workout");
    }
    /*
    * Casual function
    * @param None
    * @return None
    */
    public void casual(){
        System.out.println( name + " used for casual wear");
    }
}
