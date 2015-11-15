package io.pcf;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StopwatchApplication {

	@RequestMapping("/")
	public String home() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		// get current date time with Date()
		Date date = new Date(0);
		System.out.println(dateFormat.format(date));

		// get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		// System.out.println(dateFormat.format(cal.getTime()));

		// return "Hello Docker World";
		return dateFormat.format(cal.getTime());
	}

	public static void main(String[] args) {
		SpringApplication.run(StopwatchApplication.class, args);
	}
}
