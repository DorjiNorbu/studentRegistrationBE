package dorji.norbu.studentregistration.service;

/*
 * @author   - dorji norbu
 * @create   - 05/12/2022 10:57 PM
 */

import dorji.norbu.studentregistration.entity.Student;
import dorji.norbu.studentregistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public Object getAllStudents() {
    return studentRepository.findAll();
  }

  public Object getStudentById(String id) {
    return studentRepository.findById(UUID.fromString(id)).get();
  }

  public Object saveStudent(Student student) {
    if(null == student.getId()) {
      student.setId(UUID.randomUUID());
    }
    return studentRepository.save(student);
  }

  public void deleteStudentById(String id) {
    studentRepository.deleteById(UUID.fromString(id));
  }
}
