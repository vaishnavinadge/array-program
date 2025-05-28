class MainClass14
{
   public static void main(String args[])
   {
          int a[]={10,30,20,40,50,70,80};
          for(int i=0; i<a.length-1; i++)
           {
                a[i]+=a[i+1];
                a[i+1]=a[i]-a[i+1];
                a[i]-=a[i+1];
           }
        System.out.println(java.util.Arrays.toString(a));
     }
}
   