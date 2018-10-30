package pl.edu.pw.edu.pl.pgui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(DevicesRepository repository) {
        return (args) -> {
            // save a couple of devices
            repository.save(new Device("Jack", "Bauer"));
            repository.save(new Device("Chloe", "O'Brian"));
            repository.save(new Device("Kim", "Bauer"));
            repository.save(new Device("Kim", "Chloe"));
            repository.save(new Device("David", "Palmer"));
            repository.save(new Device("Michelle", "Dessler"));

            // fetch all devices
            log.info("Devices found with findAll():");
            log.info("-------------------------------");
            for (Device customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1)
                    .ifPresent(customer -> {
                        log.info("Device found with findById(1):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch devices by last name
            log.info("Customer found with findByName('Kim'):");
            log.info("--------------------------------------------");
            repository.findByName("Kim").forEach(kim -> {
                log.info(kim.toString());
            });
            // for (Device device : repository.findByName("Kim")) {
            // 	log.info(device.toString());
            // }
            log.info("");
        };
    }

}