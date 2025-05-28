import java.util.Arrays;
class MainClass19
{
      public static void main(String args[])
      {
            int a[]={189,243,35,532,2344};
            for(int i=0; i<a.length; i++)
             { 
                    while(a[i]>9)
                     a[i]/=10;
            }
            System.out.println(Arrays.toString(a));
}}