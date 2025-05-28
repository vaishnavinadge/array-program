class MainClass2
{
    public static void main(String args[])
    {
         int a[]= { 10,20,30,40};
         int b[]= a;
         for(int i=0; i<a.length; i++)
           System.out.println(a[i]+"\t"+b[i]);
         System.out.println(a==b);
       System.out.println(b[2]);
      }
}
