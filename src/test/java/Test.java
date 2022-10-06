import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        for ( int i  = 0; i <=15 ; i++) {
            User user1 = new User(20, "Vasya", 'm', 90.5, 190.0, i, "koval", "doctor");

            users.add(user1);
            System.out.println(users.get(i));



        }

//
//        users.add(user1);users.add(user2);
//
//        System.out.println("before ");
//
//
//        //TODO print all users.
//        printUsers(users, 15);
//        //TODO filter all users.
//        filterUsers(users, "age");
////        TODO print filter users.
//        System.out.println("after ");
//        printUsers(users, 15);
    }
    public static void printUsers(ArrayList<User> users, int amount) {
        for (int i = 0; i < amount; i++) {

            System.out.println(i + 1 + ") " + users.get(i));

        }
    }

    public static ArrayList<User> filterUsers(ArrayList<User> users, String option) {
        if (option == "age") {
            int n = users.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (users.get(j).age > users.get(j + 1).age) {
                        Collections.swap(users, j + 1, j);
                    }
                }
            }
            return users;
        }
        return users;
    }

}


