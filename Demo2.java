class Demo2
{
  int  shiftFirstToLast(int n)
  {
      int count=1, temp=n;
      while(temp>9)
      {
        temp/= 10;
        count *= 10;
     }
     return((n%count)*10)+temp;
}
}