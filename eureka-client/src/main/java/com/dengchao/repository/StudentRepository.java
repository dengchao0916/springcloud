package com.dengchao.repository;

import com.dengchao.entity.Student;

import java.util.Collection;

/**
 * @author : dengchao
 * @description :
 * @create : 2020/7/12
 */
public interface StudentRepository {
    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);
}
