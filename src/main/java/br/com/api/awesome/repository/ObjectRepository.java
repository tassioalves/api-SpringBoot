package br.com.api.awesome.repository;

import br.com.api.awesome.Entity.Object;
import org.springframework.data.repository.CrudRepository;

public interface ObjectRepository extends CrudRepository<Object, Integer> {
}
