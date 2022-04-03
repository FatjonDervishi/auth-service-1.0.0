package al.fatjon.authservice.repository;

import al.fatjon.authservice.models.Role;
import al.fatjon.authservice.models.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleLocalRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
