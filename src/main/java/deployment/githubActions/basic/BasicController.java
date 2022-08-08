package deployment.githubActions.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/sungmin")
    public String test(){
        return "success?!";
    }
    @GetMapping("/changho")
    public String test2(){
        return "fail?!";
    }

    @GetMapping("/test")
    public String test3(){
        return "<h1>test successful</h1>";
    }
}
