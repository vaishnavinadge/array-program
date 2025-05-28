class MainClass12
{
   public static void main(String args[])
   {
        String scr1 ="vaishu";//primitive
        String scr2 = scr1; 
        String scr3 = new String("vaishu");
        String scr4 = new String("vaishu");
        System.out.println(scr1==scr2);
        System.out.println(scr1==scr3);
        System.out.println(scr3==scr4);
        System.out.println(scr1.equals(scr2));
        System.out.println(scr1.equals(scr3));
        System.out.println(scr3.equals(scr4));
   }
}