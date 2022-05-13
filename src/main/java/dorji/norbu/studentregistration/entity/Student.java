package dorji.norbu.studentregistration.entity;

/*
 * @author   - dorji norbu
 * @create   - 05/12/2022 10:46 PM
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "student_registration", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Cacheable

public class Student {

  @Id
  @Column(name = "id")
  private UUID id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "phone_number")
  private String phoneNumber;
}
