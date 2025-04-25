package br.com.douglassantos;


import br.com.douglassantos.persistence.migration.MigrationStrategy;
import br.com.douglassantos.ui.Menu;

import java.sql.SQLException;

import static br.com.douglassantos.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {

        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new Menu().execute();
    }
}