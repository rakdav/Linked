import java.util.LinkedList;

public class MainClass
{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList();
        //1.add
        list.add("Germany");
        list.add("France");
        //addLast/offerLast
        list.addLast("Greate Britain");
        list.offerLast("Russia") ;
        //addFirst/offerFirst
        list.addFirst("Spain");
        list.offerFirst("Portugal");
        //add with index
        list.add(1,"Italy");
        System.out.println(list);
        System.out.println(list.size());
        //get//peek
        System.out.println(list.get(6));
        System.out.println(list.peekFirst());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peekLast());

        //set
        list.set(1,"Niderland");
        System.out.println(list);
        for (String s:list) {
            System.out.println(s);
        }
        //contains
        if(list.contains("Germany"))
        {
            System.out.println("yes");
        }
        //remove/pool
        list.remove("Germany");
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println(list);
        LinkedList<String> list2=new LinkedList();
        list2=(LinkedList<String>)list.clone();
        list2.addAll(list);
        System.out.println(list2);
        list.clear();
    }


}
