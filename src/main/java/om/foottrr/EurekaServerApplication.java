package om.foottrr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    /**
     * Chinese translation english
     * @param args
     */
    public static void main(String[] args) {
        //Chinese translation eeee
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println("Chinese test english");
    }
}
