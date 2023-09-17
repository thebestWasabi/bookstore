package ru.khamzin.entity;

import lombok.*;
import ru.khamzin.entity.enums.EmployeeStatus;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String firstname;
    private String lastname;
    private EmployeeStatus status;

}
