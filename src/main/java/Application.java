import com.ssanga.service.SpeakerService;
import com.ssanga.service.SpeakerServiceImp;

public class Application {
    public static void main(String args[]){
        SpeakerService service = new SpeakerServiceImp();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
