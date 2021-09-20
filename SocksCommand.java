package sockscommand;

/**
*
* @author Deepak
*/



public class SocksCommand {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
       SocksWearer socksWearer = new SocksWearer();
       
       AnkleSocks ankleSocks = new AnkleSocks("Ankle Socks");
       CrewLengthSocks crewLengthSocks = new CrewLengthSocks("Crew Length Socks");
       KneeLengthSocks kneeLengthSocks = new KneeLengthSocks("Knee Length Socks");
       QuarterLengthSocks quarterLengthSocks = new QuarterLengthSocks("Quarter Length Socks");
       ThighHighSocks thighHighSocks = new ThighHighSocks("Thigh High Socks");
       
       Command wearAnkleSocks = ()->{ ankleSocks.running(); ankleSocks.workOut();};
       
       socksWearer.setCommand(0, wearAnkleSocks);
       
       Command wearCrewLengthSocks = ()->{ crewLengthSocks.casual(); crewLengthSocks.hiking(); crewLengthSocks.sports();};
       
       socksWearer.setCommand(1, wearCrewLengthSocks);
       
       Command wearQuarterLengthSocks = ()->{ quarterLengthSocks.casual(); quarterLengthSocks.running(); quarterLengthSocks.workout(); };
       
       socksWearer.setCommand(2, wearQuarterLengthSocks);
       
       Command wearKneeLengthSocks = ()->{ kneeLengthSocks.casual(); kneeLengthSocks.running(); };
       
       socksWearer.setCommand(3, wearKneeLengthSocks);
       
       Command wearThighHighSocks = ()->{ thighHighSocks.casual();};
       
       socksWearer.setCommand(4, wearThighHighSocks);
       
       System.out.println(socksWearer);
       
       socksWearer.onWear(0);
       System.out.println("\n");
       socksWearer.onWear(1);
       System.out.println("\n");
       socksWearer.onWear(2);
       System.out.println("\n");
       socksWearer.onWear(3);
       System.out.println("\n");
       socksWearer.onWear(4);
   }
   
}
