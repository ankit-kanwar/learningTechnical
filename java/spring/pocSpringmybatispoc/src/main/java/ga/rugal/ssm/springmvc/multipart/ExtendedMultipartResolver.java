package ga.rugal.ssm.springmvc.multipart;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.springframework.http.HttpMethod;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * http://stackoverflow.com/a/10041789/1242236
 *
 * @author Rugal Bernstein
 */
public class ExtendedMultipartResolver extends CommonsMultipartResolver
{

    private static final String MULTIPART = "multipart";

    private boolean isMultipartContent(HttpServletRequest request)
    {
        String httpMethod = request.getMethod().toLowerCase();
        // test for allowed methods here...
        String contentType = request.getContentType();
        return (contentType != null && contentType.toLowerCase().startsWith(MULTIPART));
        
        /*
         * Another implementation
         * HttpMethod httpMeth = HttpMethod.valueOf(request.getMethod());
        if (HttpMethod.POST != httpMeth && HttpMethod.PUT != httpMeth) {
            return false;
        }
        return FileUploadBase.isMultipartContent(new ServletRequestContext(request));*/
    }

    @Override
    public boolean isMultipart(HttpServletRequest request)
    {
        return (request != null && isMultipartContent(request));
    }
}
