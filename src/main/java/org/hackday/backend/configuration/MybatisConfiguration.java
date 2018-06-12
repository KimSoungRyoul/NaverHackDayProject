package org.hackday.backend.configuration;


import java.util.Properties;
import javax.sql.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(
    annotationClass = Mapper.class,
    basePackages = "org.hackday.backend.mapper",
    sqlSessionFactoryRef = "sqlSessionFactory"
)
public class MybatisConfiguration {

  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setTypeAliasesPackage("org.hackday.backend.domain");
    Resource[] res =
        new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*_mapper.xml");

    sessionFactory.setMapperLocations(res);

    sessionFactory.setTypeHandlers(new TypeHandler[]{new DateTypeHandler()});

    Properties properties = new Properties();
    properties.setProperty("mapUnderscoreToCamelCase", "true");
    sessionFactory.setConfigurationProperties(properties);

    return sessionFactory.getObject();
  }

  @Bean
  public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
    return new SqlSessionTemplate(sqlSessionFactory);
  }
}
