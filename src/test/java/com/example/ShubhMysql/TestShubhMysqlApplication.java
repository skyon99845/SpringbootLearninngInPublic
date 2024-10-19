package com.example.ShubhMysql;

import org.springframework.boot.SpringApplication;

public class TestShubhMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(ShubhMysqlApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
