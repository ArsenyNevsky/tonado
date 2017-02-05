package ru.nevars.tonado.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.nevars.tonado.domain.common.AbstractUser;

import java.io.Serializable;

@NoRepositoryBean
public interface AbstractUserRepo<T extends AbstractUser, ID extends Serializable> extends CrudRepository<T, ID> {
}
