package br.com.senac.farmacia.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.SQLExceptionOverride;

import java.sql.Connection;

public class ConnectionFactory {
    public Connection recuperarConexao() {
        try {
        return createDataSource().getConnection();




        } catch ( SQLException e );{
            throw new RuntimeException(e);

        }
    }

    private HikariDataSource createDataSource (){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/farmacia_senac_teste2");
        config.setUsername("root");
        config.setPassword("root");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);

    }


}
