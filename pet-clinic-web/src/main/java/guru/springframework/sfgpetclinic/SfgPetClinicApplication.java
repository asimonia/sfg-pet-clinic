package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

   public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

      FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

      System.out.println(fakeDataSource.getUser());

   }

}
