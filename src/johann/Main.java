package johann;

public class Main {

    public static void main(String[] args) {

        RoleBehavior person = new RoleImpl();

        person = new ManagerDecorator(person);

        person = new EngineerDecorator(person);


        System.out.println(person.addRole());

    }
}
