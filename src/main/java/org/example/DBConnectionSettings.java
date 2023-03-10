package org.example;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBConnectionSettings {
    private static final String URL = "jdbc:postgresql://localhost:5433/testDB?user=postgres&password=postgres";

    public static DataSource getURL() throws SQLException {
        DataSource dataSource = null;
        dataSource.getConnection("postgres","postgres");
        return dataSource;
    }
}
