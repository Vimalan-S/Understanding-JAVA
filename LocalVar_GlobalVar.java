import org.omg.CORBA.SystemException;
import org.omg.Messaging.SyncScopeHelper;

public class LocalVar_GlobalVar {
    // Global Variables
    String tokyo_Plan = "To activate Plan Chernobyl...";
    int tokyo_Health = 90;
    
    public static void main(String[] args){

        LocalVar_GlobalVar Professor = new LocalVar_GlobalVar();
        System.out.println("Professor can Supervise Tokyo's Plan: " + Professor.tokyo_Plan);

        // Local Variable
        String negotiation = "We Demand you not to Harm any of our Crewmates!";
        System.out.println("Professor to Raquel: " + negotiation);
    }

    // System.out.println("Professor to Raquel: " + negotiation);
    // Will throw Error as it is beyond the scope of the Local variable 'negotiation'
}
