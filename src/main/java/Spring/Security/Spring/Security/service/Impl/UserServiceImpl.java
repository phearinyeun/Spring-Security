package Spring.Security.Spring.Security.service.Impl;

import Spring.Security.Spring.Security.repository.UserRepository;
import Spring.Security.Spring.Security.service.UserService;
import Spring.Security.Spring.Security.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService  {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findByAll(org.apache.catalina.User user) {
        return null;
    }

    @Override
    public List<User> findByAll(User user) {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByFirstname(String firstname) {
        return userRepository.findByFirstname();
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<org.apache.catalina.User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public org.apache.catalina.User findOne(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public org.apache.catalina.User updateUser(org.apache.catalina.User user) {
        return null;
    }

}
