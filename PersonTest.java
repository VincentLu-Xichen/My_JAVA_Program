public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Vincent", "Male", "Toronto", "01/01/2000", 123456789);
        
        
        Person p2;
        p2 = new Person("Vincent", "Male", "NY", "01/01/2007", 123456783);
        p1.introduce();
        System.out.println("------------------");
        p2.introduce();
        System.out.println(p2);
        boolean sameP = p1.samePerson(p2);
        System.out.println(sameP);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getName());
        Person [] people = new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = new Person("Luk", "Male", "Toronto", "01/01/2000", 123456789);
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].toString());
        }
    }
}