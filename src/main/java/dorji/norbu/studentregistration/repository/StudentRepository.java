package dorji.norbu.studentregistration.repository;

/*
 * @author   - dorji norbu
 * @create   - 05/12/2022 10:56 PM
 */

import dorji.norbu.studentregistration.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
