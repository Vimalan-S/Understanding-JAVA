public class finallyConcept {
    public static void main(String[] args){
        int a = 10;
        try {
            System.out.println("In try block");
            int b = a / 10;
        }
  
        catch (ArithmeticException e) {
            System.out.println("In catch block");
            System.out.println("Exception caught");
        }
  
        finally{
            System.out.println("Executes whether exception occurs or not");
        } // Here Exception not occurs but still finally block executes since finally is meant to execute whether an exception occurs or not.
    }
}
