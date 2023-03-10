package org.example;

import com.googlecode.flyway.core.Flyway;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        Flyway flyway = new Flyway();


        flyway.migrate();


    }
}

