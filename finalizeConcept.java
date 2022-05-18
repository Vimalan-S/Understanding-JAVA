public class finalizeConcept {    
    public static void main(String[] args){     
       finalizeConcept obj = new finalizeConcept();                
       obj = null;    
       
       // calling the garbage collector using gc()   
       System.gc();     
       System.out.println("End of the garbage collection");     
   }     
  // defining the finalize method   
   protected void finalize(){     
       System.out.println("Called the finalize() method");     
   }     
}