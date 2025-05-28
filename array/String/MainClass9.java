class MainClass9
{
   public static void main(String args[])
   {
       /*
       String s1 = "India";
       String s2 = "";
       s2+=s1.charAt(s1.length()-1);
       for(int i=0; i<s1.length()-1; i++)
       s2+=s1.charAt(i);
       System.out.println(s2);
       */
        /*  
        String s1 = "India";
        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(s1.length()-1));
        for(int i=0;i<s1.length()-1; i++)
            sb.append(s1.charAt(i));
        System.out.println(sb);
        */
         /*
          String s1 = "India";
          StringBuilder sb = new StringBuilder();
          sb.append(s1.charAt(s1.length()-1));
          sb.append(s1.substring(0,s1.length()-1));
          System.out.println(sb);
         */
           
          String s1 = "India";
          StringBuilder sb = new StringBuilder(s1);
          char c =sb.charAt(sb.length()-1);
          sb.deleteCharAt(sb.length()-1);
          sb.insert(0,c);
          System.out.println(sb);

    }
}