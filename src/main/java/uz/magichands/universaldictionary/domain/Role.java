package uz.magichands.universaldictionary.domain;

import org.springframework.security.core.GrantedAuthority;
import uz.magichands.universaldictionary.domain.constant.RoleName;

import javax.persistence.*;

@Entity
public class Role  implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
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
        return roleName.name();
    }
}
