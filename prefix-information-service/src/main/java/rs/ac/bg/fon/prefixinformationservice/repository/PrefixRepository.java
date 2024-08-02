package rs.ac.bg.fon.prefixinformationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.prefixinformationservice.model.Prefix;
@Repository
public interface PrefixRepository extends JpaRepository<Prefix, Long> {
    Prefix findByName(String name);
}
