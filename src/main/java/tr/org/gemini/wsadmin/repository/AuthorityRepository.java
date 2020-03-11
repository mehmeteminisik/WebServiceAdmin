package tr.org.gemini.wsadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.org.gemini.wsadmin.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
