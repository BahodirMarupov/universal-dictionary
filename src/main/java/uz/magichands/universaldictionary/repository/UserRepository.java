package uz.magichands.universaldictionary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.magichands.universaldictionary.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
}
