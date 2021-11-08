package org.generation.Students.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity( name = "Students" )
public class Student
{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name = "idStudents" )
    public int id;

    public String name;

    public String email;

    public String address;

    @Column( name = "birth_date" )
    public Date birthDate;


    public Student()
    {
    }

    public Student( String name, String email, Date birthDate )
    {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
            + ", address='" + address + '\'' + ", birthDate=" + birthDate + '}';
    }
}
