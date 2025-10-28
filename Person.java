public class Person {
    private String name;
    private String gender;
    private String city;
    private String dayOfBirth;
    private int idnumber;

    //constructor
    public Person(String name, String gender, String city, String DoB, int idnum) {
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.dayOfBirth = DoB;
        this.idnumber = idnum;
    }
    public void introduce(){
        System.out.println("My name is " + this.name + ".");
        System.out.println("My gender is " + this.gender + ".");
        System.out.println("I am from " + this.city + ".");
        System.out.println("My date of birth is " + this.dayOfBirth + ".");
    }
    public boolean samePerson(Person that){
        if (this.gender.equals(that.gender)){
            if (this.idnumber == that.idnumber){
                if (this.name.equals(that.name)){   
                    return true;
                }
            }
        }
        return false;
    }
    public String toString(){
        return "Name: " + this.name + ", Gender: " + this.gender + ", City: " + this.city + ", Date of Birth: " + this.dayOfBirth + ", ID Number: " + this.idnumber;
    }
    //getter
    public String getName(){
        return this.name;
    }
}