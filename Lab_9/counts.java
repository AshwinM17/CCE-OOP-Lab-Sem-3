import java.util.Scanner;
class counts{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Lines...");
        String str=in.nextLine();
        str.trim();
        int no=str.length();
        System.out.println("Number of characters="+no);
        String arr[]=str.split(" ");
        System.out.println("Number of words="+arr.length);
        String lines[]=str.split("\\.",0); // as \. to put a full stop and \\. to recognize \.
        System.out.println("Number of Lines="+lines.length);
        char characters[]=new char[no];
        String lowstr=str.toLowerCase();
        lowstr.getChars(0, no, characters, 0);
        int i,count=0;
        for(i=0;i<no;i++)
        {
            char cc=characters[i];
            if(cc=='a'||cc=='e'||cc=='i'||cc=='o'||cc=='u')
            count++;
        }
        System.out.println("Number of vowels="+count);
    }
}