class MainClass12
{
  public static void main(String args[])    
   {
        int a[]={40,50,60,70};
         for(int i=0;i<a.length/2; i++)
         {
               int temp=a[i];
               a[i]=a[a.length-1-i];
               a[a.length-1-i]=temp;
          }
      System.out.println(java.util.Arrays.toString(a));
}
}