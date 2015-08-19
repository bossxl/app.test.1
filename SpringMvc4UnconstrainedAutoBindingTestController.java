import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringMvc4UnconstrainedAutoBindingTestController {
    @RequestMapping(value = "/unconstrained-params", method = RequestMethod.GET)
    public String unconstrainedParams(@RequestParam("firstName") String firstname, @RequestParam("lastname") String lastname) {
        return "unconstrained-params";
    }

    @RequestMapping(value = "/unconstrained-bean-props", method = RequestMethod.GET)
    public String unconstrainedBeanProps(LoginFormBean form) {
        return "unconstrained-form-bean";
    }

}
