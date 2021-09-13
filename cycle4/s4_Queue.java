import java.util.*;
public class s4_Queue
{
    public static void main(String args[])
    {
        int ch,n;
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new PriorityQueue<Integer>(new Comp());
        do
        {
            System.out.println("\n---MENU--\n\n1.ADD\n2.POLL\n3.PEEK\n4.LENGTH\n5.IS EMPTY\n6.EXIT\n");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the Number:");
                        n=sc.nextInt();
                        q.add(n);
                        System.out.println("\n--> UPDATED QUEUE = "+q);
                        break;
                case 2: q.poll();
                        System.out.println("\n--> UPDATED QUEUE = "+q);
                        break;
                case 3:System.out.println("\n--> PEEK ELEMENT = "+q.peek());
                        break;
                case 4:System.out.println("LENGTH OF QUEUE "+q.size());
                        break;
                case 5:System.out.println("Is QUEUE Empty? "+q.isEmpty());
                        break;
                case 6:break;
            }
       }while(ch!=6);
    }
}