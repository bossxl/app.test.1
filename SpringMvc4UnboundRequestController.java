import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class SpringMvc4UnboundRequestController {
    // This one should trigger
    @RequestMapping
    public String hello() {
        return "hello";
    }

    // This one should not
	@RequestMapping(value = "/bound", method = RequestMethod.GET)
	public String shouldNotTrigger() {
		return "test";
	}
}