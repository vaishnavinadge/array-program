class MainClass8
{
   public static void main(String args[])
    {
         int a[] = { 12,17,24,18,22,9,15,33,11,19};
         double avg=0;
           for(int i=0; i<a.length; i++)
              avg += a[i];
            avg/=a.length;
         System.out.println("avg of array:"+avg);
      }
}

