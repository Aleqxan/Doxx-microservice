package main.java.com.doxx.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@data
@AllArgsConstructor
@NoArgsConstructor

public class Department {

    @Id
    @GenerateValue(Strategy = GeneationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
