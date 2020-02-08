package br.com.api.awesome.service;

import br.com.api.awesome.Entity.Object;
import br.com.api.awesome.Entity.User;
import br.com.api.awesome.error.ResourceNotFoundException;
import br.com.api.awesome.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjectService {
    @Autowired
    private ObjectRepository objectRepository;

    public List<Object> listAll() {
        return (List<Object>) objectRepository.findAll();
    }

    public Object saveObject(Object object) {
        return objectRepository.save(object);
    }

    public Object getById(Integer id) {
        Optional<Object> object = objectRepository.findById(id);
        if (object.isPresent())
            return object.get();
        throw new ResourceNotFoundException("Object not found for id: " + id);
    }

    public void delete(Object object) {
        Optional<Object> obj = objectRepository.findById(object.getId());
        if (obj.isPresent()) {
            objectRepository.delete(object);
        } else {
            throw new ResourceNotFoundException("User not found for id: " + object.getId());
        }
    }

    public Object updateObject(Object object) {
        Optional<Object> obj = objectRepository.findById(object.getId());
        if (obj.isPresent())
            return objectRepository.save(object);
        throw new ResourceNotFoundException("Object not found for id: " + object.getId());
    }


}
