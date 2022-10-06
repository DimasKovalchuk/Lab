import org.testng.annotations.Test;

public class User extends human {

    int id;
    String login;
    String proffesion;

    public User(int age, String name, char gender, double weight, double height, int id, String login, String proffesion) {
        super(age, name, gender, weight, height);
        this.id = id;
        this.login = login;
        this.proffesion = proffesion;

    }

    @Override
    public String toString() {
        return this.id +") Hello my name is " +  this.name + " my age is " + this.age + " my proffesion " + this.proffesion;
    }
}
