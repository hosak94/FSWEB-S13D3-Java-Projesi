public class Person {
    String firstname;
    String lastname;
    int age;
    int height;
    String country;
    String education;

    public Person (String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Person (String firstname, String lastname, int age,int height,String country,String education) {
        this(firstname,lastname,age);
        this.height = height;
        this.country = country;
        this.education = education;
    }

    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        if(age <19 && age>13) {
            return true;
        }else {
        return false;
        }
    }
}
