package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;

/**
 * Author: Kuylim TITH
 * Date: 8/26/2023
 */
public class Student {

    private String studentId;
    private String studentName;
    private LocalDate dateOfAdmission;

    public Student(){}

    public Student(String studentId, String studentName, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
