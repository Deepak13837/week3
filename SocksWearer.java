package sockscommand;


/**
 * The Invoking Class
 * @author Deepak
 */


public class SocksWearer {
    Command[] wearCommands;
    /*
    * Constructor
    * @param None
    * @return None
    */ 
    public SocksWearer(){
        wearCommands = new Command[7];
        
        for ( int i = 0; i < 7 ; i++ ){
            wearCommands[i] = () -> {};
        }
    }
    /*
    * Sets the Commands to execute
    * @param int slot
    * @param Command wearCommand
    * @return None
    */
    public void setCommand( int slot, Command wearCommand ) {
        wearCommands[slot] = wearCommand;
    }
    /*
    * Execute socks command action on wear
    * @param int slot
    * @return None
    */
    public void onWear( int slot ) {
        wearCommands[slot].execute();
    }
    /*
    * Print Object to String
    * @param none
    * @return String stringBuff
    */
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n ------- Sock Usage --------\n");
        for( int i = 0; i < wearCommands.length; i++ ){
            stringBuff.append("[slot " + i + "]" + wearCommands[i].getClass().getName() + "\n ");
        }
        
        
        return stringBuff.toString();
    }
}
