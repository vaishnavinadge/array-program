class Demo
 {
      public void pyramid()
        {
           int n=5;
             for(int i=1; i<=n; i++)
             {
                 for(int j=n; j>i ; j--)
                     System.out.print("_");
                 for(int j=1; j<=i; j++)
                     System.out.print(i);
                 for(int j=i-1; j>=1; j--)
                    System.out.print(i);
            System.out.println();
          }
    }
}