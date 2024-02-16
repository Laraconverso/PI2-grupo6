package com.APIclubApp.clubApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="emplyees")
public class Employee extends User{

    @Column(name= "employee_number", nullable = false, unique = false)
    private Long employeeNumber;

}
