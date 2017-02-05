package ru.nevars.tonado.dao;


import org.springframework.stereotype.Repository;
import ru.nevars.tonado.domain.user.User;

@Repository
public interface UserRepo extends AbstractUserRepo<User, Long> {

    User findOneByLoginAndPassword(String login, String password);

    User findOneByLoginLike(String login);

    Boolean findOneByEmailLike(String email);
}
