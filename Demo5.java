class Demo5
{
   int appendMaxAtFirstDigit(int n)//134
   {
     int max=0, temp=n;
     while(temp!=0)
     {
        int first =temp%10;
        n/=10;
        first*=10;
        temp/=10;

     }
             temp+= first;
           return n;
}
}