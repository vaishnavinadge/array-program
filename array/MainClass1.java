class MainClass1
{
    public static void main(String args[])
    {
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};
        for(int i=0; i<a.length; i++)
        System.out.println(a[i]+"\t"+b[i]);
        System.out.println(a==b);
    }
}