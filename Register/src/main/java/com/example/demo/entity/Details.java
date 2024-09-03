package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detail")
public class Details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_Id")
	private int studentId;

	@Column(name = "student_Name")
	private String studentName;

	@Column(name = "student_Hobby")
	private String studentHobby;
}
	