
package br.com.sgeiesp.data;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/*Esta é uma classe de configuracao*/
@Configuration
public class DataConfiguration {
	
	/*Aqui será configurado o banco de dados*/
	@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/sgeiesp");/*url do BD*/
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");
        return dataSource;
    }
	
	/*Aqui será configurado o Hibernate*/
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();/*Criando conexão com o Hibernate*/
		adapter.setDatabase(Database.POSTGRESQL);/*Passando qual Database será utilizada*/
		adapter.setShowSql(true);/*Apresentara todas as etapas do crud no console*/
		adapter.setGenerateDdl(true);/*Permite que o Hibernate crie as tabelas automaticamente*/
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");/*Passando qual o Dialect será utilizado*/
		adapter.setPrepareConnection(true);/*True para o Hibernate executar a conexao automaticamente*/
		return adapter; 
	}

}

