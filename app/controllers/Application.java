package controllers;

import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import play.mvc.Controller;
import play.mvc.With;
import doma.AppConfig;
import doma.user.User;
import doma.user.UserDao;
import doma.user.UserDaoImpl;

@With(Transaction.class)
public class Application extends Controller {
    public static void index() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.select();
        render(users);
    }
}