import java.util.Arrays;
class MainClass14
{
  public static void main(String args[])
   {
       String s1 = "International";
       StringBuilder vow = new StringBuilder();
       StringBuilder sb =  new StringBuilder(s1);
       String s2 = "AEIOUaeiou";
       for(int i=0;i<s1.length();i++)
            if(s2.contains(String.valueOf(s1.charAt(i))))
                      vow.append(s1.charAt(i));
        char c[]= vow.toString().toCharArray();
        Arrays.sort(c);
         int count=0;
         for(int i=0; i<s1.length();i++)
                   if(s2.contains(String.valueOf(s1.charAt(i))))
                       {
                                 sb.deleteCharAt(i);
                                 sb.insert(i,c[count++]);
                        }

        
         System.out.println(sb);
     }
}