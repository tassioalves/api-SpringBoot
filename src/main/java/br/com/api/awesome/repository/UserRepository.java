package br.com.api.awesome.repository;

import br.com.api.awesome.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByNameIgnoreCaseContaining(String name);
}
