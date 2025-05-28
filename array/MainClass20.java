import java.util.Arrays;
class MainClass20
{
      public static void main(String args[])
     {
          int a[]={129,4847,679,987,456};
           for(int i=0; i<a.length; i++)
             {
               if(a[i]>99)
                 {
                     int last=a[i]%10;
                       while (a[i]>9)
                           a[i]/=10;
                           a[i]+=last;
                 }
            }
       System.out.println(Arrays.toString(a));
      }  
}
 