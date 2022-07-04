package com.example.demo.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CourseConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
            CourseRepository repository){
        return args -> {
            Course engComp = new Course(
				"Engenharia da Computação",
				// 12345,
				"123456",
				LocalDate.of(2022, Month.JUNE, 22),
				"Roberta"
			);

            Course engEletrica = new Course(
				"Engenharia Elétrica",
				// 12346,
				"123457",
				LocalDate.of(2022, Month.JUNE, 22),
				"Roberta"
			);

            repository.saveAll(
                List.of(engComp, engEletrica)
            );
        };
    }
}
