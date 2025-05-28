import java.util.Arrays;
class MainClass17
{
  public static void main(String args[])
  {
      int a[]={10,20,40,50,70,80};
      int b[]={11,22,33,44,55,66,77};
      int c[]= new int[a.length+b.length];
       if(a.length<=b.length)
       {
          for(int i=0; i<a.length;i++)
           {
               c[i*2]=a[i];
               c[(i*2)+1]=b[i];
           }
         for(int i=0; i<b.length; i++)
             c[i+a.length]=b[i];
}
         else {
          for(int i=0; i<b.length; i++)
            {
                c[i*2]=a[i];
                c[(i*2)+1]= b[i];
             }
            for(int i=b.length; i<a.length; i++)
                 c[i+b.length]=a[i];
            }
            System.out.println(Arrays.toString(c));
            }
}
        