class MainClass9
{
      public static void main(String args[])
     {
           int a []={12,17,24,22,18,11,9,19,15};              
             double avg=0;
                int oddcount = 0;
             for(int i=0; i<a.length; i++)
               if(a[i]%2!=0)
           {
                   avg+=a[i];
                   oddcount++;
           }
          System.out.println(oddcount);
      }
}