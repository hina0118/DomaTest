package controllers;

import play.mvc.Before;
import play.mvc.Catch;
import play.mvc.Controller;
import play.mvc.Finally;
import doma.AppConfig;

public class Transaction extends Controller {
	@Before
	static void begin() {
		AppConfig.getLocalTransaction().begin();
	}
	@Catch
	static void rollback(Throwable throwable) {
		AppConfig.getLocalTransaction().rollback();
	}
	@Finally
	static void commit() {
		AppConfig.getLocalTransaction().commit();
	}
}
