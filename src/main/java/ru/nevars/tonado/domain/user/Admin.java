package ru.nevars.tonado.domain.user;

import ru.nevars.tonado.domain.common.AbstractUser;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Admin extends AbstractUser {

    private String middleName;

    private Date lastVisit;


    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
}
