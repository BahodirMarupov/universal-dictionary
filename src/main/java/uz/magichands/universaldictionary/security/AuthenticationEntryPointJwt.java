package uz.magichands.universaldictionary.security;

import com.google.gson.Gson;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import uz.magichands.universaldictionary.payload.InvalidLoginResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationEntryPointJwt implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        InvalidLoginResponse invalidLoginResponse=new InvalidLoginResponse();
        invalidLoginResponse.setInvalid("username or password error!");
        String jsonLoginResponse=new Gson().toJson(invalidLoginResponse);
        httpServletResponse.setStatus(401);
        httpServletResponse.setContentType("application/json");
        httpServletResponse.getWriter().print(jsonLoginResponse);
    }
}
