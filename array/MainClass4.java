class MainClass4
{
  public static void main(String args[])
  {
       int a[]= {10,20,40,30};
       int b[]= new int[a.length];
       for(int i=0;i<a.length; i++)
       {
           b[i]=a[i];
           System.out.println(a[i]+" "+b[i]);
       }
       System.out.println(a==b);
}
}