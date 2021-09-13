import java.util.*;
public class s3_Sorting
{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(2222);
        a.add(1210);
        a.add(200);
        a.add(369);
        Collections.sort(a);
        System.out.println("IN ASCENDING ORDER : "+a);
        Collections.reverse(a);
        System.out.println("IN DESCENDING ORDER : "+a);
        Comparator<Integer> com=new Comp();
        Collections.sort(a,com);
        System.out.println("BASED ON LAST DIGIT :"+a);    
    }
}