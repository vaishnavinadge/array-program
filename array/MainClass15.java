class MainClass15
{
   public static void main(String args[])
   {
        int a[]={10,20,30,40,50,60};
        for(int i=a.length-2; i>=0; i--)
         {
              a[i]+=a[i+1];
              a[i+1]=a[i]-a[i+1];
              a[i]-=a[i+1];
          }
        System.out.println(java.util.Arrays.toString(a));
}
}