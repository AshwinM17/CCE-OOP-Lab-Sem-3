import java.util.Scanner;
class palin_alpha_rev_concat{
    static boolean palindrome(String str)
    {
        String rev=reverse(str);
        return str.contentEquals(rev);
    }
    static String[] alphabetic(String str)
    {
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                int a=arr[j].compareTo(arr[j+1]);
                if(a>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }
    static String reverse(String str)
    {
        StringBuffer rev=new StringBuffer(str);
        rev.reverse();
        String revstr=rev.toString();
        return revstr;
    }
    static String concating(String str)
    {
        String rev=reverse(str);
        return str+rev; 
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=in.nextLine();
        char contin='y';
        while(contin=='y'){
            System.out.println("What do you want to do?1 for checking palindrome,2 for alphabetic,3 for reversing,4 for concatinatig with reverse");
            int choice=in.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("String is a palindrome:"+palindrome(str));
                    break;
                }
                case 2:
                {
                    String arr[]=alphabetic(str);
                    System.out.println("String in alphabetic order:");
                    for(int i=0;i<arr.length;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.println("Reversed string="+reverse(str));
                    break;
                }
                case 4:
                {
                    System.out.println("Concatenated String="+concating(str));
                    break;
                }
            }
            System.out.println("Continue?(y/n)");
            contin=in.next().charAt(0);
        }

    }
}