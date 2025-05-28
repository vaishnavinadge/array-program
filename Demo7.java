class Demo7{
  int  appendMaxAtFirstDigit(int n)
  {
        int max=0, temp=n, length=1;
        while(temp!=0)
        {
           int last =temp%10;
             if(last>max)
                 max=last;
             length*=10;
                temp/=10;
         }
         max*=length; 
         n+=max;
         return n;
       }
}