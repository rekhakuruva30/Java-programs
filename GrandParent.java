class GrandParent
{
    void great()
    {
        System.out.println("Hello from Grandparent");
    }
}
class parent extends GrandParent{
    void greatParent()
    {
        System.out.println("Helle parent");

    }
class  Child extends parent{
    void greatChild()
    {
        System.out.println("Hello from child");
    }
}
class Main
{
    public static void main(String [] args)
    {
        Child c=new.Child();
        c.greatParent();
        c.greatChild();
    }
}


