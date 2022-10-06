import org.testng.annotations.Test;

public class Split {

    @Test
    public void splt (){



        String sentenc = "how was yours famaly";
        String email = "budimport123@gmail.com";
        String[] emailsplit = email.split("@");
        System.out.println(emailsplit[0]);

        String[] splitted = sentenc.split(" ");

        for (String word : splitted){
            System.out.println(word);
        }
//        System.out.println(splitted[2]);

//        System.out.println(sentenc.split(""));

    }
}
