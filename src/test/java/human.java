public class human {
    int age;
    String name;
    char gender;
    double weight;
    double height;
    double myAgeIn20Years;

    public human(int age, String name, char gender, double weight, double height) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.myAgeIn20Years = age + 20;

    }

    public String walk() {
        String result = "Im walking now";
        return result;

    }

    public void jump(int lengs) {

        System.out.println("I jumpt" + lengs + "meters");
    }

    public String talk() {

        String result = "Im talking";
        return result;
    }

}



