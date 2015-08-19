import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMvc4ConstrainedAutoBindingTestController {
    @RequestMapping(value = "test-1", method = RequestMethod.GET)
    public String testDoNotFind(LoginFormBean loginForm) {
        return "test-1";
    }

    @InitBinder
    public void initBinder(DataBinder dataBinder) {
        dataBinder.setAllowedFields("username", "password");
    }
}
