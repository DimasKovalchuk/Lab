import org.testng.annotations.Test;

public class main2 {

    int AGE = 50;
    Integer AGE1 = new Integer(  40);


    @Test

    public void dolt(){
       int result = summ(50 ,50);
       System.out.println(result +5);

    }
    public void run(){
        System.out.println("running");

    }
    public int summ(int firstvariable, int secondvariable){
        return firstvariable + secondvariable;
    }

}




