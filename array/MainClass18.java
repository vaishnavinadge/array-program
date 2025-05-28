class MainClass18
{
     public static void main(String args[])
     {
           int a[]={16,26,15,22,18,9,14,19,13,26,17};
            int max=0;
             int smax=0;
            for(int i=0; i<a.length; i++)
                if(max<a[i])
                {
                      smax=max;
                       max=a[i];
                }
              else if(smax<a[i] && a[i]!=max)
                 smax=a[i];
              System.out.println("max=" +max);
              System.out.println("smax=" +smax);
          }
}