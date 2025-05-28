class Demo6 
{
   int CheckPalindrome(int n)
   {
         boolean sum=0, temp=n;
         while(temp!=0)
        {
           sum+=10;
           sum +=temp%10;
           temp/=10;
         
        }
          return (sum==n)?true:false;
}
}