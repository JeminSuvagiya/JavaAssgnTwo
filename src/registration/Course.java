/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author jems7
 */
public class Course {
     Student student;
    Instructor instructor;
    private String courseCode;
    private String courseName;
    private String room;
    private DayOfWeek dayOfWeek;
    private int classSize;
    private LocalTime classTime;
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    
      //      Course comp1008 = new Course(frank, "COMP1008", "Intro to OOP", "E208", DayOfWeek.MONDAY, LocalTime.parse("11:00"), 3);

    
    @Override
     public String toString() {

        return courseCode+"-"+courseName;
    
     }

    public Course(Instructor instructor, String courseCode, String courseName, String room, DayOfWeek dayofWeek, LocalTime classTime, int classSize) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setRoom(room);
        setDayOfWeek(dayOfWeek);
        setClassTime(classTime);
        setClassSize(classSize);
        if (instructor.canTeach(courseCode)) {
            this.instructor = instructor;
        } else {
            throw new IllegalArgumentException("Instructor can not teach this course");
        }
        this.listOfStudents = listOfStudents;
    }

    public LocalTime getClassTime() {
        return classTime;
    }

    public void setClassTime(LocalTime classTime) {
        this.classTime = classTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public Course getCourseDayAndTime() {           
        //"MONDAY's, starting at 11:00"
       Course course = null;
       String day = getDayOfWeek().toString();
       LocalTime time = getClassTime();
       
       
       return course;
        
    }
    
    public void addStudent(Student student) {
        if (student.inGoodStanding() && listOfStudents.size() < this.classSize) {
            listOfStudents.add(student);
        } else {
            throw new IllegalArgumentException("not valid");

        }
        
        
        
        /**
         * this returns an ArrayList of Student objects enrolled in the course
         */
    }
   public ArrayList<Student> showClassList() {
        return listOfStudents;
    }

 
 
}
