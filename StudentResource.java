package com.mca.rest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/students")
public class StudentResource extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static ArrayList<Student> students = new ArrayList<>();

    // GET – Display students
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/plain");

        if (students.isEmpty()) {
            res.getWriter().println("no records found");
            return;
        }

        for (Student s : students) {
            res.getWriter().println(
                "id:" + s.id + " name:" + s.name + " age:" + s.age
            );
        }
    }

    // POST – Add student
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));

        students.add(new Student(id, name, age));

        res.getWriter().println("student added successfully");
    }

    // PUT – Update student
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));

        for (Student s : students) {
            if (s.id == id) {
                s.name = name;
                s.age = age;
                res.getWriter().println("student updated successfully");
                return;
            }
        }

        res.getWriter().println("student not found");
    }

    // DELETE – Delete student
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                res.getWriter().println("student deleted successfully");
                return;
            }
        }

        res.getWriter().println("student not found");
    }
}