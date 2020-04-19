package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import guru.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

   public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

      FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

      System.out.println(fakeDataSource.getUser());
      System.out.println(fakeDataSource.getPassword());

      FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

      System.out.println(fakeJmsBroker.getUser());
      System.out.println(fakeJmsBroker.getPassword());
      System.out.println(fakeJmsBroker.getUrl());


   }

}
