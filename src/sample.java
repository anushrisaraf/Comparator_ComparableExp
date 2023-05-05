import java.util.*;

public class sample {
    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "Rudresh"));
        al.add(new Student(5, "Anushree"));
        al.add(new Student(16, "Shubham"));
        al.add(new Student(78, "Shubh"));

        al.add(new Student(45, "Deepali"));

        al.add(new Student(11, "Deepak"));
        System.out.println("Sorting by ID");

        Collections.sort(al,new newidcomparison());
        for (Student st : al) {
            System.out.println(st.getId() + " " + st.getName());
        }
        System.out.println("Sorting by name");
        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.getId() + " " + st.getName());
        }

    }
}
