import org.testng.annotations.Test;

public class FizzBuzz {

    @Test
    public void FB(){
        for (int i =1; i <=100; i++){
           if (i % 15 == 0){
               System.out.println("Fizz buzz");
           }else if (i % 5 == 0){
               System.out.println("Buzz");
           }else if (i % 3 == 0){
               System.out.println("Fizz");
           }else{
               System.out.println(i);
           }
        }
    }
    @Test
    public void sk() {
//        int t =10;
//        System.out.println(t);
        for (int bu = 1; bu <= 127; bu++){
            if (bu%12 ==0) {
                System.out.println("sos");
            }else if (bu%5 ==0){
                System.out.println("kkk");
            }else if (bu%3 ==0) {
                System.out.println("super");
            }else {
                System.out.println(bu);
            }
            }
        }
        @Test
        public void kkk(){
        for(int k = 100; k>0;k--) {
            if(k%15 ==0) {
                System.out.println("boss");
            } else if (k%10 ==0) {
                System.out.println("jun");
            } else if (k%3 ==0) {
                System.out.println("trenni");
            } else {
                System.out.println(k);
            }
        }
        }


        }
