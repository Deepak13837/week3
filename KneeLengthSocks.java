package sockscommand;


/**
 * KneeLengthSocks
 * @author deepak
 */


public class KneeLengthSocks {
    //Property name
    String name;
    /*
    * Constructor
    * @param String name
    * @return None
    */
    public KneeLengthSocks( String name ) {
        this.name = name;
    }
    /*
    * Running Function
    * @param void
    * @return None
    */
    public void running(){
        System.out.println(name + " used for running");
    }
    /*
    * Casual function
    * @param void
    * @return None
    */
    public void casual(){
        System.out.println( name + " used for casual wear");
    }
}
