package com.example.sofabootsmartunit.service;

import com.example.sofabootsmartunit.api.StudentFacade;
import com.example.sofabootsmartunit.po.Student;
import com.example.sofabootsmartunit.repo.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author strawbird
 * @since 2022/11/14
 **/
@Service
public class StudentService implements StudentFacade {

    @Autowired
    StudentDao studentDao;

    public Student findStudentById(String id) {
        return studentDao.findStudentById(id);
    }

    @Override
    public boolean addStudent(Student student) {

        return studentDao.addStudent(student);
    }

    @Override
    public boolean delStudentById(String id) {

        return false;
    }

    @Override
    public boolean updateStudentById(Student student) {
        return false;
    }
}
