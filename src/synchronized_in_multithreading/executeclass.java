package synchronized_in_multithreading;

/**
 * Created by jitu on 5/6/2017.
 */
public  class executeclass {
    public synchronized  void method(){
        for(int i=1;i<11;i++ ){
            System.out.println("method"+i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}
