package doma.user;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import doma.user.domain.Password;

@Entity
public class User {
    @Id
    Integer id;
    String email;
    Password password;
    String fullname;
    Boolean isAdmin;
}
