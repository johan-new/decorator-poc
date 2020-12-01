package johann;

public class ProgrammerDecorator extends RoleDecorator {

    public ProgrammerDecorator(RoleBehavior decoratedRole) {
        super(decoratedRole);
    }

    @Override
    public String addRole() {
        return super.addRole() + " Programmer ";
    }

    @Override
    public int salary() {
        return super.salary()+5000;
    }
}
