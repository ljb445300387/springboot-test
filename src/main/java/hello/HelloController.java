package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private TestMapper testMapper;
	
    @RequestMapping("/")
    public String index() {
        return testMapper.selectByExample(null).get(0).getName();
    }
    
}
