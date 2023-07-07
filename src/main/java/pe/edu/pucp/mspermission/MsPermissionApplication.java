package pe.edu.pucp.mspermission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsPermissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPermissionApplication.class, args);
    }

}
