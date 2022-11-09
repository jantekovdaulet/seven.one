package seven.one.seven.one.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import seven.one.seven.one.models.Courses;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
