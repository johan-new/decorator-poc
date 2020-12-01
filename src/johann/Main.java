package johann;

public class Main {

    public static void main(String[] args) {
        RoleBehavior person = new RoleImpl();
        person = new EngineerDecorator(person);
        person = new ProgrammerDecorator(person);
        printDetails(person);

        RoleBehavior person2 = new RoleImpl();
        person2 = new ManagerDecorator(person2);
        printDetails(person2);

        RoleBehavior person3 = new RoleImpl();
        printDetails(person3);
    }

    static void printDetails(RoleBehavior person){
        System.out.println(person.addRole() + "\nLön:" + person.salary());
    }
}
