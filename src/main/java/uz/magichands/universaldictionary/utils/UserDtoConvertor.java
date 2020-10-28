package uz.magichands.universaldictionary.utils;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.magichands.universaldictionary.domain.User;
import uz.magichands.universaldictionary.payload.RegisterDto;

@Component
@Mapper(componentModel = "spring")
public interface UserDtoConvertor {
    User RegisterDtoToUser(RegisterDto registerDto);
}
