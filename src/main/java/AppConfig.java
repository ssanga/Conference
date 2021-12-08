import com.ssanga.model.Speaker;
import com.ssanga.repository.HibernateSpeakerRepositoryImp;
import com.ssanga.repository.SpeakerRepository;
import com.ssanga.service.SpeakerService;
import com.ssanga.service.SpeakerServiceImp;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@ComponentScan({"com.ssanga"})
public class AppConfig {

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
