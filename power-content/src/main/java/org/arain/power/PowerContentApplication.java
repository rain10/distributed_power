package org.arain.power;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients(value = {
        @RibbonClient(name = "STSTEM")})
public class PowerContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerContentApplication.class, args);
	}
}
