class Demo8
{
  int firstAndLastAtLastDigit(int n)
  {
        int last = n%10;
        int temp= n;
       while(temp>9)
        {
            temp/=10;
         }
       n*=10;
       n+=temp;
       n*=10;
       n+=last;
       return n;
  }
}
/*
   1234	   123414
     	1234%10= 4 .
        temp = 1234.
        while(1234>9)// 1234>9 //123>9//12>9//1>9
         {
               temp/= 10; 1234/=10//123/=10//12/=10//1
         }
          n*=10//1234*10= 12340.
          n+=temp//12341.
          n*=10//12341*10=123410.
          n+=last//123410+ 4= 123414
          return n;//123414
*/