package doma.user;

import doma.AppConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@Dao(config = AppConfig.class)
public interface UserDao {
    @Select
    List<User> select();
}
