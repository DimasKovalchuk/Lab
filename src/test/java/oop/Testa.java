package oop;

public class Testa {
    public static void main(String[] args) {
        printTask(4, '#');
        printSubject(2,'#');



    }

    public static void printTask(int size, char simbol) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(simbol + " \t");

            }
            System.out.println();

        }


    }
public static void printSubject(int s, char simb){

    for (int i = 0; i < s ; i++) {
        for (int j = 0; j < s ; j++) {
            System.out.print(simb);

        }
        System.out.println();
    }
}

}


