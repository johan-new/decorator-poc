package johann;

public class ManagerDecorator extends RoleDecorator {
    public ManagerDecorator(RoleBehavior decoratedRole) {
        super(decoratedRole);
    }

    @Override
    public String addRole() {
        return super.addRole() + " Manager ";
    }

    @Override
    public int salary() {
        return super.salary()+10000;
    }


}
