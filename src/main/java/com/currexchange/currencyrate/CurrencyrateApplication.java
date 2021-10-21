package com.currexchange.currencyrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Properties;

@SpringBootApplication
@EnableFeignClients
public class CurrencyrateApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(CurrencyrateApplication.class, args);
	Properties bean = context.getBean(Properties.class);

	}
}
