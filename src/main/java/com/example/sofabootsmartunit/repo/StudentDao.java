package com.example.sofabootsmartunit.repo;

import com.example.sofabootsmartunit.po.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author strawbird
 * @since 2022/11/14
 **/
@Repository
public class StudentDao {

    public Map<Integer, Student> studentMap = new HashMap<>();


    public StudentDao() {
        Student student = new Student();
        student.setId(1);
        student.setSex("Male");
        student.setName("StrawBird");
        student.setAge(18);
        studentMap.put(student.getId(), student);
    }

    public Student findStudentById(String id) {
        return studentMap.get(id);
    }

    public boolean addStudent(Student student) {
        studentMap.put(student.getId(), student);
        return true;
    }

    public boolean delStudentById(String id) {
        studentMap.remove(id);
        return true;
    }

    public boolean updateStudentById(Student student) {
        Student stu = findStudentById(String.valueOf(student.getId()));
        stu.setAge(student.getAge());
        stu.setName(student.getName());
        stu.setSex(student.getSex());
        studentMap.put(student.getId(), stu);
        return true;
    }
}
