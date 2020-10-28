package uz.magichands.universaldictionary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.magichands.universaldictionary.domain.User;
import uz.magichands.universaldictionary.exception.ConfirmPasswordException;
import uz.magichands.universaldictionary.exception.ExistsUsernameException;
import uz.magichands.universaldictionary.payload.RegisterDto;
import uz.magichands.universaldictionary.repository.UserRepository;
import uz.magichands.universaldictionary.utils.UserDtoConvertor;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserDtoConvertor userDtoConvertor;
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public UserDetails saveUser(RegisterDto registerDto) {
        if (!registerDto.getPassword().equals(registerDto.getConfirmPassword()))
            throw new ConfirmPasswordException("Tasdiqlovchi parol mos emas.");
        else if (userRepository.existsByPhoneNumber(registerDto.getPhoneNumber()))
            throw new ExistsUsernameException("Bu raqam ro`yxatga olingan");
//        TODO: phone auth
        User user = userDtoConvertor.RegisterDtoToUser(registerDto);
        user.setPhoneNumber(registerDto.getPhoneNumber());
        userRepository.save(user);
        return user;
    }
}
