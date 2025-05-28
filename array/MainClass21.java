import java.util.Arrays;
class MainClass21
{
   public static void main(String args[])
   {
         int a[]={189,245,53,422,633,23,98};
          for(int i=0; i<a.length;i++)
           {
              int sum=0;
              while(a[i]!=0)
             {
                 sum+=a[i]%10;
                  a[i]/=10;
              }
                  a[i]=sum;
            }
           System.out.println(Arrays.toString(a));
}}
