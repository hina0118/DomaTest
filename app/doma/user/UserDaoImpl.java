package doma.user;

/** */
@javax.annotation.Generated(value = { "Doma", "1.20.0" }, date = "2011-12-23T00:00:48.421+0900")
public class UserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements doma.user.UserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.20.0");
    }

    /** */
    public UserDaoImpl() {
        super(new doma.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public UserDaoImpl(java.sql.Connection connection) {
        super(new doma.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public UserDaoImpl(javax.sql.DataSource dataSource) {
        super(new doma.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<doma.user.User> select() {
        entering("doma.user.UserDaoImpl", "select");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/doma/user/UserDao/select.sql");
            __query.setCallerClassName("doma.user.UserDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<doma.user.User>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<doma.user.User>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<doma.user.User>(doma.user._User.getSingletonInternal()));
            java.util.List<doma.user.User> __result = __command.execute();
            __query.complete();
            exiting("doma.user.UserDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("doma.user.UserDaoImpl", "select", __e);
            throw __e;
        }
    }

}
