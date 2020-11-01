package uz.magichands.universaldictionary.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import uz.magichands.universaldictionary.domain.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtAuthenticationProvider {
    @Value("jwt.secret")
    private String jwtSecret;
    @Value("jwt.time")
    private long jwtTime;

    public String generateToken(Authentication authentication){
        User user=(User) authentication.getPrincipal();
        Date now=new Date(System.currentTimeMillis());

        Date expireDate=new Date(now.getTime()+jwtTime);  // 3 days
        String userId= String.valueOf(user.getId());
        Map<String,Object> claims=new HashMap<>();
        claims.put("id",userId);
        claims.put("username",user.getUsername());
        claims.put("firstname",user.getFirstName());
        claims.put("lastname",user.getLastName());
        claims.put("level",user.getLevel());

        return Jwts.builder()
                .setSubject(userId)
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512,jwtSecret)
                .compact();

    }
}
