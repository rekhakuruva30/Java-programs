import java.util.LinkedList;
class Sample
{
    public static void main(String[] args)
    {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("After adding:"+list);
        list.addFirst(5);
        System.out.println("Adding first():"+list);
        list.addLast(24);
        System.out.println("After addlast():"+list);
        list add(2,25);
        
      System.out.println("After inserting :"+list);
              System.out.println("First elements:"+list.getFirst());
                      System.out.println("First elements:"+list.getFirst());
                      System.out.println("Element at index 3:"+list.get(3));
                      list.set(2,100);
                      System.out.println("containd 30?"+list.contains(30));
                      System.out.println("Index of 30:"+list.indexOf(30));
                      list.removeFirst();
                    System.out.println("After removfirst:"+list)
                    list.removeLast();
                    System.out.println("After removlast:"+list);
                    list.remove(1);
                    System.out.println("After remove index 1:"+list);
                    Sysetm.out.println("Size of list:"+list.size());
                    System.out.println("circular travasel(12 elements):");
                    int size=list.size();
                    for(int i=0;i<12;i++)
                    {
                      System.out.println(lis.get(i%size)+" ");
                    
    }
    list.clear();
    System.out.println("\nAfter clear():"+list);
    System.out.println("is empty?"+list.isEmpty());
    }
}
                      
       

                      



          

      
      