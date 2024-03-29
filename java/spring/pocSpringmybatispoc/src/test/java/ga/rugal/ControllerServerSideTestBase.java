package ga.rugal;

import ga.JUnitSpringTestBase;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * This is a base test class for JUNIT test in controller testing<BR/>
 * It is really a very simple but useful test class, which skipped using web server, hence saved a
 * lot of time in deployment!
 *
 * @author Rugal Bernstein
 */
@ContextConfiguration(classes =
{
    config.ApplicationContext.class, config.SpringMVCApplicationContext.class
})
@WebAppConfiguration
@Ignore
public abstract class ControllerServerSideTestBase extends JUnitSpringTestBase
{

    /**
     * This is a request handler used to mapping all request into handle ACTION class
     */
    @Autowired
    public RequestMappingHandlerAdapter handlerAdapter;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    @Before
    public void before()
    {
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
    }
}
