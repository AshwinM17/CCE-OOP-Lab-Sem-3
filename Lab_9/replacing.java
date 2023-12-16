import java.util.Scanner;
class replacing{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Lines...");
        String str=in.nextLine();
        str.trim();
        System.out.println("Enter the word to be removed");
        String word=in.nextLine();
        StringBuffer strbuf= new StringBuffer(str);
        if(str.contains(word))
        {
           
            int index=str.indexOf(word);
            int wlen=word.length();
            String
            String rep="";
            for(int i=0;i<wlen;i++)
            {
                rep+="*";
            }
            strbuf.replace(index,index+wlen,rep);
        }
        System.out.println("Replaced String=\n"+strbuf);
        
    }
}