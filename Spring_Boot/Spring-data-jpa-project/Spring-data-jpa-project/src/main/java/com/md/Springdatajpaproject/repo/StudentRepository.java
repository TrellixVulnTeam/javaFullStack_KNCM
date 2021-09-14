package com.md.Springdatajpaproject.repo;

import com.md.Springdatajpaproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String name);

    public List<Student> findByParentName(String parentName);

    public List<Student> findByLastNameLike(String lastName);

    public List<Student> findByLastNameNotNull();


    //JPA Query
    // this should be the class name property name, not table name
    @Query("select s from Student s where s.email=?1")
    Student getStudentByEmailId(String emailId);

    // this should be the class name property name, not table name
    @Query("select s.firstName from Student s where s.email=?1")
    String getStudentFirstNameByEmail(String email);


    // Native
    // this should be the table name and column name, not class name
    @Query(value = "select * from student s where s.email_id=?1",
            nativeQuery = true)
    Student getStudentByEmailAddressNative(String email);


    // native named params
    // this should be the table name and column name, not class name
    @Query(value = "select * from student s where s.email_id=:email",
            nativeQuery = true)
    Student getStudentByEmailNativeNamedParams(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "update student set first_name=?1 where email_id=?2",
            nativeQuery = true)
    int updateStudentNameByEmail(String firstName, String email);
}
