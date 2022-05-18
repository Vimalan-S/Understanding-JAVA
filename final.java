public final class ParentClass{ // final keyword to a Class
    final int a = 100; // final keyword to a variable
    a++; // modifying the final variable immediately gives Compile Time error
    
    public final void hey(){ // final keyword to a method 
        System.out.println("Hey Buddy!"); 
    }
}

public class ChildClass extends ParentClass{ // Throws the Error "Cannot Inherit from final class"
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
    }
}