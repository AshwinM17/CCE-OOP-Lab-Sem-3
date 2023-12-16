class IncrementThread extends Thread{
    Incrementer ref;
    IncrementThread(Incrementer obj)
    {
        ref=obj;
    }
    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            ref.increment();
        }
    }
}
class Incrementer{
    int count;
    Incrementer(int cnt)
    {
        count=cnt;
    }
    void increment()
    {
        synchronized(this)
        {
            count++;
        }
    }
}
class syncMethod{
    public static void main(String[] args) {
        Incrementer inc=new Incrementer(0);
        IncrementThread t1=new IncrementThread(inc);
        IncrementThread t2=new IncrementThread(inc);
        t1.start();
        t2.start();
        try {
                t1.join();
                t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        System.out.println(inc.count);
    }
}
