package rs.ac.bg.fon.prefixinformationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class PrefixInformationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrefixInformationServiceApplication.class, args);
    }

}
