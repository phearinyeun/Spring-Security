package Spring.Security.Spring.Security.service;

import org.apache.catalina.User;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<Spring.Security.Spring.Security.model.User> findById(Long id);
    User save (User user);

    Spring.Security.Spring.Security.model.User save(Spring.Security.Spring.Security.model.User user);

    List<User> findAll();
}
