package com.example.sofabootsmartunit.api;

import com.example.sofabootsmartunit.po.Student;

/**
 * <p></p>
 *
 * @author strawbird
 * @since 2022/11/14
 **/
public interface StudentFacade {

    public Student findStudentById(String id);

    public boolean addStudent(Student student);

    public boolean delStudentById(String id);

    public boolean updateStudentById(Student student);
}
