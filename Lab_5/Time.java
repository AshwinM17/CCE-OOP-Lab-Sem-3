import java.util.Scanner;
class Time
{
    int hours,mins,secs;
    Time()
    {
        //default constructor sets to zero
    }
    Time(int hours,int mins,int secs)
    {
        this.hours=hours;
        this.mins=mins;
        this.secs=secs;
    }

    void display(Time obj)
    {
        String shrs,smns,sscs;
        shrs=Integer.toString(obj.hours);
        smns=Integer.toString(obj.mins);
        sscs=Integer.toString(obj.secs);
        if(shrs.length()<2)
        {
            shrs="0"+shrs;
        }
        if(smns.length()<2)
            smns="0"+smns;
        if(sscs.length()<2)
            sscs="0"+sscs;
        
        System.out.println(shrs+":"+smns+":"+sscs);
    }

    Time add(Time obj1,Time obj2)
    {
        Time sum_obj=new Time();
        int tot_sec=(obj1.hours+obj2.hours)*3600+(obj1.mins+obj2.mins)*60+(obj1.secs+obj2.secs);
        sum_obj.hours=tot_sec/3600;
        tot_sec%=3600;
        sum_obj.mins=tot_sec/60;
        tot_sec%=60;
        sum_obj.secs=tot_sec;
        return sum_obj;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the hours minutes and seconds of 1st time");
        int hr,mn,sc;
        hr=in.nextInt();
        mn=in.nextInt();
        sc=in.nextInt();
        Time obj1=new Time(hr,mn,sc);
        System.out.println("Enter the hours minutes and seconds of 2nd time");
        hr=in.nextInt();
        mn=in.nextInt();
        sc=in.nextInt();
        Time obj2=new Time(hr,mn,sc);
        System.out.println("Entered times are:-");
        obj1.display(obj1);
        obj2.display(obj2);
        Time sum_obj;
        sum_obj=obj1.add(obj1,obj2);
        System.out.print("On addition Time is:");
        sum_obj.display(sum_obj);
    }
}