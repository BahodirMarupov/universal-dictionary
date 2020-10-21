package uz.magichands.universaldictionary.domain;

import org.springframework.security.core.GrantedAuthority;
import uz.magichands.universaldictionary.domain.constant.RoleName;

public class Role  implements GrantedAuthority {
    private RoleName roleName;

    public Role() {
    }

    public Role(RoleName roleName) {
        this.roleName = roleName;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
