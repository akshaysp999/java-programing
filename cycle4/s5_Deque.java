import java.util.*;
public class s5_Deque
{
    public static void main(String args[])
    {
        int ch,n;
        Scanner sc=new Scanner(System.in);
        Deque<Integer> dq=new ArrayDeque<Integer>();
        do
        {
            System.out.println("\n---MENU--\n\n1.ADD\n2.ADD FIRST\n3.ADD LAST\n4.LENGTH\n5.PEEK\n6.PEEK LAST\n7.PEEK FIRST\n8.POLL\n9.POLL FISRT\n10.POLL LAST\n11.IS EMPTYCLEAR\n12.CLEAR\n13.EXIT");
            System.out.println("\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the Number:");
                        n=sc.nextInt();
                        dq.add(n);
                        System.out.println("\n--> UPDATED LIST = "+dq);
                        break;
                case 2:System.out.println("Enter the Number:");
                        n=sc.nextInt();
                        dq.addFirst(n);
                        System.out.println("\n--> UPDATED LIST = "+dq);
                        break;
                case 3:System.out.println("Enter the Number:");
                        n=sc.nextInt();
                        dq.addLast(n);
                        System.out.println("\n--> UPDATED LIST = "+dq);
                        break;
                case 4:System.out.println("LENGTH OF LIST "+dq.size());
                        break;
                case 5:System.out.println("Element at head "+dq.peek());
                        break;
                case 6:System.out.println("Element at tail "+dq.peekLast());
                        break;
                case 7:System.out.println("Element at head "+dq.peekFirst());
                        break;     
                case 8:System.out.println("UPDATED LIST "+dq.poll());
                        break;
                case 9:System.out.println("UPDATED LIST "+dq.pollFirst());
                        break;      
                case 10:System.out.println("UPDATED LIST "+dq.pollLast());
                        break;
                 case 11:System.out.println("Is Empty?"+dq.isEmpty());
                        break;   
                 case 12:dq.clear();
                        System.out.println(dq);
                        break;
                case 13:break;           
            }
       }while(ch!=13);
    }
}