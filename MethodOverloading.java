public class MethodOverloading {
    public void print_TSHirt(){
        System.out.println("T-Shirt printed with Base design");
    } 

    public void print_TSHirt(String str){
        System.out.println("T-Shirt printed with Base design + Text: " + str);
    } 

    public void print_TSHirt(int number){
        System.out.println("T-Shirt printed with Base design + Number: " + number);
    } 
    public static void main(String[] args) throws Exception {
        MethodOverloading tshirt1 = new MethodOverloading();
        tshirt1.print_TSHirt();

        MethodOverloading tshirt2 = new MethodOverloading();
        tshirt1.print_TSHirt("CSK Forever");

        MethodOverloading tshirt3 = new MethodOverloading();
        tshirt1.print_TSHirt(7);
    }
}
