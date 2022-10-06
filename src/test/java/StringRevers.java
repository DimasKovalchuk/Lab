import org.testng.annotations.Test;

public class StringRevers {

    @Test
    public void revers() {

        String about = "Tell me about yourself";


//        for (int i = about.length()-1; i >= 5 ;i--){
//            System.out.print(about.charAt(i));
        for (int t = 0;t < about.length() ;t++){
            System.out.print(about.charAt(t));
//        for (int s = about.length()-1; s >=0 ; s--){
//            System.out.print(about.charAt(s));

        }


    }
}
