class Student{
    int id;
    String name;
    void study()
    {
        System.out.println("student is studying");
    }
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.id=101;
        s1.name="Shiva";
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.study();
    }
}