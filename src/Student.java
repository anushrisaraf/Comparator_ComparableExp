public class Student implements Comparable<Student> {
   private int id;
   private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    Student(int id)
    {
        this.id=id;

    }

    Student(int id ,String name){
        this(id);
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
       // System.out.println("Name sorting");
        return this.name.compareTo(o.getName());
    }


}
