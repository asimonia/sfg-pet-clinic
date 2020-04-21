package guru.springframework.sfgpetclinic.exampleconfig;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import guru.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySources({
//   @PropertySource("classpath:datasource.properties"),
//   @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

//   @Autowired
//   Environment env;

   @Value("${guru.username}")
   String user;

   @Value("${guru.password}")
   String password;

   @Value("${guru.dburl}")
   String url;

   @Value("${guru.jms.username}")
   String jmsUsername;

   @Value("${guru.jms.password}")
   String jmsPassword;

   @Value("${guru.jms.url}")
   String jmsUrl;

   @Bean
   public FakeDataSource fakeDataSource() {
      FakeDataSource fakeDataSource = new FakeDataSource();
      fakeDataSource.setUser(user);
      fakeDataSource.setPassword(password);
      fakeDataSource.setUrl(url);
      return fakeDataSource;
   }

   @Bean
   public FakeJmsBroker fakeJmsBroker() {
      FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
      fakeJmsBroker.setUser(jmsUsername);
      fakeJmsBroker.setPassword(jmsPassword);
      fakeJmsBroker.setUrl(jmsUrl);
      return fakeJmsBroker;
   }

//   @Bean
//   public static PropertySourcesPlaceholderConfigurer properties() {
//      PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//      return propertySourcesPlaceholderConfigurer;
//   }
}