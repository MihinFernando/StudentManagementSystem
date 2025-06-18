/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.dao;

import com.studentmanagementsystem.db.DBConnection;
import com.studentmanagementsystem.model.Course;
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
public class CourseDAO {
    
    public static void addCourse(Course course) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("INSERT INTO courses(name, duration, fee) VALUES (?, ?, ?)");
        pst.setString(1, course.getName());
        pst.setString(2, course.getDuration());
        pst.setDouble(3, course.getFee());
        pst.executeUpdate();
    }

    public static List<Course> getAllCourses() throws SQLException {
        List<Course> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM courses");
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            list.add(new Course(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("duration"),
                rs.getDouble("fee")
            ));
        }

        return list;
    }

    public static void updateCourse(Course course) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("UPDATE courses SET name=?, duration=?, fee=? WHERE id=?");
        pst.setString(1, course.getName());
        pst.setString(2, course.getDuration());
        pst.setDouble(3, course.getFee());
        pst.setInt(4, course.getId());
        pst.executeUpdate();
    }

    public static void deleteCourse(int id) throws SQLException {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("DELETE FROM courses WHERE id=?");
        pst.setInt(1, id);
        pst.executeUpdate();
    }
}
