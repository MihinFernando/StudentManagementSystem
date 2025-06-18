/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.dao;

import com.studentmanagementsystem.db.DBConnection;
import com.studentmanagementsystem.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mihin
 */
public class StudentDAO {
    public static void addStudent(Student student) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(
            "INSERT INTO students(name, age, grade) VALUES (?, ?, ?)"
        );
        pst.setString(1, student.getName());
        pst.setInt(2, student.getAge());
        pst.setString(3, student.getGrade());
        pst.executeUpdate();
    }

    public static List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM students");
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Student s = new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("grade")
            );
            list.add(s);
        }
        return list;
    }

    public static void deleteStudent(int id) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("DELETE FROM students WHERE id = ?");
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public static void updateStudent(Student student) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(
            "UPDATE students SET name=?, age=?, grade=? WHERE id=?"
        );
        pst.setString(1, student.getName());
        pst.setInt(2, student.getAge());
        pst.setString(3, student.getGrade());
        pst.setInt(4, student.getId());
        pst.executeUpdate();
    }
}
