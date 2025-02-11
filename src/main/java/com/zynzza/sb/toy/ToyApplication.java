package com.zynzza.sb.toy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@Slf4j
@SpringBootApplication
public class ToyApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ToyApplication.class, args);

//		var application = new SpringApplication(ToyApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);

		var appCtx = new SpringApplicationBuilder(ToyApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.run();
	}

}
