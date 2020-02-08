package br.com.api.awesome.service;


import br.com.api.awesome.Entity.User;
import br.com.api.awesome.error.ResourceNotFoundException;
import br.com.api.awesome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUserByName(String name) {
        return userRepository.findByNameIgnoreCaseContaining(name);
    }

    public User getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent())
            return user.get();
        throw new ResourceNotFoundException("User not found for id: " + id);
    }

    public void deleteuser(User user) {
        Optional<User> u = userRepository.findById(user.getId());
        if (u.isPresent()) {
            userRepository.delete(user);
        } else {
            throw new ResourceNotFoundException("User not found for id: " + user.getId());
        }
    }

    public User updateUser(User user) {
        Optional<User> u = userRepository.findById(user.getId());
        if (u.isPresent())
            return userRepository.save(user);
        throw new ResourceNotFoundException("Object not found for id: " + user.getId());
    }


}
