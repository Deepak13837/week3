package sockscommand;

/**
 *  Ankle socks Class
 * @author Deepak
 */



public class AnkleSocks {
    //property name
    String name;
    /*
    * Ankle socks Constructor
    * @param String name
    * @return None
    */
    public AnkleSocks( String name ) {
        this.name = name;
    }
    /*
    * Running function
    * @param Void
    * @return None
    */
    public void running(){
        System.out.println( name + " used for running");
    }
    /*
    * Workout function
    * @param Void
    * @return None
    */
    public void workOut(){
        System.out.println( name + " used for workout");
    }
}
