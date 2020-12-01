package johann;

public class EngineerDecorator extends RoleDecorator {

    public EngineerDecorator(RoleBehavior decoratedRole) {
        super(decoratedRole);
    }

    @Override
    public String addRole() {
        return super.addRole() + " Engineer ";
    }

    @Override
    public int salary() {
        return super.salary()+4000;
    }

}
