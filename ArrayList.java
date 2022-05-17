import java.util.*;

public class ArrayList {

    public class Student{
        String name, regno;
    
        Student(String name, String regno){
            this.name = name;
            this.regno = regno;
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student("Vimalan", "20BAI1223");
        Student std2 = new Student("Ranjan", "20BRS1009");

        ArrayList<Student> al = new ArrayList<Student>();

        //Adding the Student objects to the ArrayList
        al.add(std1);
        al.add(std2);

        //Traversing through the ArrayList
        Iterator<Student> itr = al.Iterator();
        while(itr.hasNext()){
            Student attendance_list = itr.next();
            System.out.println("Attendance Marked for: " + attendance_list.name);
        }
    }
}
