import com.ssanga.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.ssanga"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calendarFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calendarFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        //SpeakerServiceImp service = new SpeakerServiceImp(getSpeakerRepository());
        SpeakerServiceImp service = new SpeakerServiceImp();
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {

        return new HibernateSpeakerRepositoryImp();
    }

     */
}
