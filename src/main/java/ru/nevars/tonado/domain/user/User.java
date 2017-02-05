package ru.nevars.tonado.domain.user;

import ru.nevars.tonado.domain.common.AbstractUser;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User extends AbstractUser {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof User)) {
            return false;
        }

        User that = (User) obj;

        if (!this.getEmail().equalsIgnoreCase(that.getEmail())) {
            return false;
        }

        if (!this.getLogin().equalsIgnoreCase(that.getLogin())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.getEmail().hashCode() + this.getLogin().hashCode();
    }
}
