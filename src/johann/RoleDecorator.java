package johann;

public abstract class RoleDecorator implements RoleBehavior{

    private final RoleBehavior decoratedRole;

    public RoleDecorator(RoleBehavior decoratedRole) {
        this.decoratedRole = decoratedRole;
    }

    @Override
    public String addRole() {
        return decoratedRole.addRole();
    }
}
