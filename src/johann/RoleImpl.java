package johann;

public class RoleImpl implements RoleBehavior{

    @Override
    public String addRole() {
        return "Roller: Employee ";
    }

    @Override
    public int salary() {
        return 25000;
    }
}
