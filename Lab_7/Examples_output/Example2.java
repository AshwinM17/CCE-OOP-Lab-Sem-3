class Example2{
    static int num=5;
    //Static class
    static class X{
        static String str="Inside Class X";
        num=99;
    }
    public static void main(String args[])
    {
    Example2.X obj =new Example2.X();
   System.out.println("Value of num="+obj.str);
    }
   }
   