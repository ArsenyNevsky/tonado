package ru.nevars.tonado.domain.common;

import lombok.Getter;
import lombok.Setter;
import ru.nevars.tonado.domain.user.UserRole;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractUser extends BaseEntity {

    @Column(unique = true, nullable = false)
    protected String login;

    @Column(nullable = false)
    protected String firstname;

    @Column(nullable = false)
    protected String lastname;

    @Column(nullable = false, unique = true)
    protected String email;

    @Column(nullable = false)
    protected String password;

    protected Boolean active;

    @Enumerated(EnumType.STRING)
    protected UserRole role;

    public void setRole(String role) {
        this.role = UserRole.valueOf(role);
    }

    public UserRole getRole() {
        return role;
    }
}
