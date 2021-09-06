package com.thanhle.SpringBootTutorial.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        uniqueConstraints = {
                @UniqueConstraint(name = "uniqueDepartmentNameAndCode",
                        columnNames = {"department_name", "department_code"})
        }
)
public class Department {
    @Id
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"
    )
    @Column(
            name = "department_id"
    )
    private Long departmentId;
    @NotNull
    @Column(
            name = "department_name"
    )
    private String departmentName;
    @NotNull
    @Column(
            name = "department_address"
    )
    private String departmentAddress;
    @Column(
            name = "department_code"
    )
    private String departmentCode;
}
