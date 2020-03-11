package tr.org.gemini.wsadmin.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import tr.org.gemini.wsadmin.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
