package sockscommand;
/**
 * CrewLengthSocks Class
 * @author Deepak
 */



public class CrewLengthSocks {
    //Property name
    String name;
    /*
    * Constructor
    * @param String name
    * @return None
    */
    public CrewLengthSocks ( String name ) {
        this.name = name;
    }
    /*
    * Sports function
    * @param void
    * @return void
    */
    public void sports(){
        System.out.println( name + " used for sports");
    }
    /*
    * Hiking function
    * @param void
    * @return void
    */
    public void hiking(){
        System.out.println( name + " used for hiking");
    }
    /*
    * Casual function
    * @param void
    * @return void
    */
    public void casual(){
        System.out.println( name + " used for casual");
    }
}
