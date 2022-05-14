class Cricket {
    public void about_cricket() {
      System.out.println("Time to watch Cricket");
    }
  }
  
class IPL extends Cricket {
    public void about_IPL() {
        System.out.println("Time to watch IPL");
    }
}
  
class Test_match extends Cricket {
    public void about_Test_match() {
        System.out.println("Time to watch Test Cricket");
    }
}

public class Dynamic_and_Static_Polymorphism {
    public static void main(String[] args) {
        Cricket game = new Cricket();  // Create a Cricket object
        game.about_cricket();
        
        Cricket ipl_fan = new IPL();  // Create a IPL object via Dynamic Polymorphism
        // Child class object can be referred by Parent class reference variable
        ipl_fan.about_cricket();

        IPL ipl_fan2 = new IPL();
        ipl_fan2.about_IPL();     // Static Polymorphism

        Cricket testMatch_fan = new Test_match();  // Create a Test_match object
      
        testMatch_fan.about_cricket();
    }
}


  