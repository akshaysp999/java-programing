import java.util.*;
public class s2_Stacklist
{
    public static void main(String[] args)
    {
        int ch,n;
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<Integer>();
        do
        {
            System.out.println("\n---MENU--\n\n1.PUSH\n2.LENGTH\n3.PEEK\n4.POP\n5.SEARCH\n6.IS EMPTY\n7.EXIT\n");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the Number:");
                        n=sc.nextInt();
                        s1.push(n);
                        System.out.println("\n--> UPDATED STACK = "+s1);
                        break;
                case 2:System.out.println("\n--> LENGTH OF STACK = "+s1.size());
                        break;
                case 3:System.out.println("\n--> PEEK ELEMENT = "+s1.peek());
                        break;
                case 4:s1.pop();
                        System.out.println("\n--> UPDATED STACK = "+s1);
                        break;
                case 5:System.out.println("Enter the number :");
                        n=sc.nextInt();
                        System.out.println("It is present at position "+s1.search(n));
                        break;
                case 6:System.out.println("Is Stack Empty? "+s1.isEmpty());
                        break;
                case 7:break;
            }
       }while(ch!=7);
    }
}