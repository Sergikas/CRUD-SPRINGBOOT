package com.taller.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class StudentService {
    private static Map<Long, Student> students = new HashMap<>();
    private static Long index= 0L;

    public static List<Student> getAllStudents(){
        return new ArrayList<>(students.values());
    }

    public static Student getStudentDetails(Long studentId){
        return students.get(studentId);
    }

    public static Student addStudent(Student student){
        index+=1;
        student.setId(index);
        students.put(index,student);
        return student;
    }

    public static Student updateStudent(Long studentId,Student student){
        student.setId(studentId);
        students.put(studentId,student);
        return student;
    }

    public static Student deleteStudent(Long studentId){
        return students.remove(studentId);
    }
}
