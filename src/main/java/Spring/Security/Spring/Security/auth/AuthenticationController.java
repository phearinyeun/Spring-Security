package Spring.Security.Spring.Security.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> regsiter(@RequestBody RegisterRequest request){
        return null;

    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationRespone> register(@RequestBody RegisterRequest request){
        return null;

    }
}
