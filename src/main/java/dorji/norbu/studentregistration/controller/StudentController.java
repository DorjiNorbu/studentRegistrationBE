package dorji.norbu.studentregistration.controller;

/*
 * @author   - dorji norbu
 * @create   - 05/12/2022 10:58 PM
 */


import dorji.norbu.studentregistration.entity.Student;
import dorji.norbu.studentregistration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/students")
  public ResponseEntity<Object> getAllStudents() {
    return ResponseEntity.ok(studentService.getAllStudents());
  }

  @PostMapping("/student")
  public  ResponseEntity<Object> saveStudent(@RequestBody Student student) {
    return ResponseEntity.ok(studentService.saveStudent(student));
  }

  @GetMapping("/student/{id}")
  public ResponseEntity<Object> getStudentById(@PathVariable String id) {
    return ResponseEntity.ok(studentService.getStudentById(id));
  }

  @PutMapping("/student")
  public ResponseEntity<Object> updateStudentById(@RequestBody Student student) {
    return ResponseEntity.ok(studentService.saveStudent(student));
  }

  @DeleteMapping("/student/{id}")
  public void deleteStudentById(@PathVariable String id) {
    studentService.deleteStudentById(id);
  }
}
