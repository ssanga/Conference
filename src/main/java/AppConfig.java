import com.ssanga.model.Speaker;
import com.ssanga.repository.HibernateSpeakerRepositoryImp;
import com.ssanga.repository.SpeakerRepository;
import com.ssanga.service.SpeakerService;
import com.ssanga.service.SpeakerServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImp service = new SpeakerServiceImp();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImp();
    }
}
