import java.util.Scanner;

public class Searching
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=s.nextInt();

        int[] a=new int[n];
        System.out.println("enter elements into an array");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter key to search");
        int key=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                break;

            }

        }
        if(flag==1)
        {

            System.out.println("Found");
        }
            else
            {
                System.out.println("Not found");
            }

        }


    }

