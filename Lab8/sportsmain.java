import java.util.Scanner;
interface sports{
    int getNumberOfGoals();
    void dispTeam();
}
class football implements sports{
    int goals;
    String team;
    football(String team,int goals)
    {
        this.goals=goals;
        this.team=team;
    }
    public int getNumberOfGoals()
    {
        return goals;
    }
    public void dispTeam()
    {
        System.out.print(team);
    }
    int winner(football obj[],int n) 
    {
        int win=0,i;
        for(i=0;i<n;i++)
        {
            if(obj[i].getNumberOfGoals()>obj[win].getNumberOfGoals())
            {
                win=i;
            }
        }
        return win;
    }
}
class hockey implements sports{
    int goals;
    String team;
    hockey(String team,int goals)
    {
        this.goals=goals;
        this.team=team;
    }
    public int getNumberOfGoals()
    {
        return goals;
    }
    public void dispTeam()
    {
        System.out.print(team);
    }
    int winner(hockey obj[],int n) 
    {
        int win=0,i;
        for(i=0;i<n;i++)
        {
            if(obj[i].getNumberOfGoals()>obj[win].getNumberOfGoals())
            {
                win=i;
            }
        }
        return win;
    }
}
class sportsmain{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of football teams:");
        int nfoot=in.nextInt();
        int i;
        football fobj[]=new football[nfoot];
        for(i=0;i<nfoot;i++)
        {
            in.nextLine();
            System.out.println("Enter the team name and number of their goals");
            String teamn=in.nextLine();
            int goals=in.nextInt();
            fobj[i]=new football(teamn,goals);
        }
        System.out.println("Enter the number of Hockey teams:");
        int nhock=in.nextInt();
        hockey hobj[]=new hockey[nhock];
        for(i=0;i<nhock;i++)
        {
            in.nextLine();
            System.out.println("Enter the team name and number of their goals");
            String teamn=in.nextLine();
            int goals=in.nextInt();
            hobj[i]=new hockey(teamn,goals);
        }
        int win=fobj[0].winner(fobj,nfoot);
        System.out.println("Winning football team:");
        fobj[win].dispTeam();
        System.out.println(" with "+fobj[win].getNumberOfGoals()+" Goals");
        win=hobj[0].winner(hobj,nhock);
        System.out.println("Winning Hockey team:");
        hobj[win].dispTeam();
        System.out.println(" with "+hobj[win].getNumberOfGoals()+" Goals");
    }
}
