package Spring.Security.Spring.Security.service;

import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String likePattern = "a%b%c";
    List<Spring.Security.Spring.Security.model.User> findByAll (User user);

    List<Spring.Security.Spring.Security.model.User> findByAll(Spring.Security.Spring.Security.model.User user);

    Optional<Spring.Security.Spring.Security.model.User> findByFirstname (String firstname);
    User create (User user);

    Spring.Security.Spring.Security.model.User create(Spring.Security.Spring.Security.model.User user);

    Optional<User> findById(Long id);
    User findOne (Long id);
    void deleteById(Long id);
    User updateUser(User user);
}
