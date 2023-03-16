public class Encapsulation {
    String name;
    private int age;

    private static int noofstudents;
    //getter
    public int getAge()
    {
      return age;
    }
    //setter method
    public void setAge(int age)
    {
        this.age = age;
    }
    //getter method for no of students
    public static int getNoofstudents() {
        return noofstudents;
    }
    //setter method for no of students
    public static void setNoofstudents(int noofstudents) {
        Encapsulation.noofstudents = noofstudents;
    }
}
