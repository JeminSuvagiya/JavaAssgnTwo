/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author jems7
 */
public class Instructor {
    
            //Instructor ellaV = new Instructor("Ella", "Vader", 1000012, "10 Hightop Lane", "Barrie", "L2S 1A6", LocalDate.of(2013, Month.AUGUST, 22), LocalDate.of(1962, Month.JUNE, 6));
    private String firstName, lastName, address, city, postalCode;
    private LocalDate hireDate, birthday;
    private int employeeNum;
    private ArrayList<String> subjects = new ArrayList<String>();

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
 
    
    public Instructor(String firstName, String lastName, int employeeNum, String address, String city, String postalCode, LocalDate hireDate, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setPostalCode(postalCode);
        setHireDate(hireDate);
        setBirthday(birthday);
        setEmployeeNum(employeeNum);
        
        
    
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }
        public int getYearBorn() {
        int birthyear = LocalDate.from(birthday).getYear();
        return birthyear;
    }

    /**
     * This will return the age in year
     *
     * @return
     */
    public int getAgeInYears() {
        int ageOfEmplpoyee = Period.between(birthday, LocalDate.now()).getYears();
        return ageOfEmplpoyee;
    }

    /**
     * This will return the year in which he/she was studying in college
     *
     * @return
     */
    public int yearsAtCollege() {
        int yearAtCollege = Period.between(hireDate, LocalDate.now()).getYears();
        return yearAtCollege;
    }

    /**
     * This will ad courses
     *
     * @param courseCode
     * @return
     */
    public String addCourseToAbilities(String courseCode) {

        subjects.add(courseCode.toUpperCase());
        if (courseCode.toLowerCase().isEmpty()) {
            throw new IllegalArgumentException("Employee number must be valid");
        } else {
            return courseCode.toLowerCase();
        }
    }

    /**
     * This will accept the string
     *
     * @param courseCode
     * @return
     */
    public boolean canTeach(String courseCode) {

        if (subjects.contains(courseCode.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This will return a String with all the course codes an Instructor is
     * certified to teach
     *
     * @return
     */
    public String listOfSubjectsCertifiedToTeach() {

        return subjects.toString();
    }

    public void changeAddress(String newAddress, String newCity, String newPostalCode) {
        //"101 First Floor Ave.", "Utopia", "L3S 2A2"
        newAddress="101 First Floor Ave.";
        newCity = "Utopia";
        newPostalCode = "L3S 2A2";
        setAddress(newAddress);
        setCity(newCity);
        setPostalCode(newPostalCode);
        
        
    }
}