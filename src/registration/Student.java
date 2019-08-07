/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jems7
 */
public class Student {
    
    private String firstName, lastName, address, city, postalCode, program;
    private int studentNumber;
    private LocalDate dateOFEnrollement;
    private LocalDate dateOfBirth;
    private boolean inGoodStanding;

    @Override
    public String toString() {
        return firstName+ " " + lastName + ", student number: "+ studentNumber;
    }
    
  /**
   * 
   * //  "Colin", "Allcars", "16 Cobblestone Way", "Barrie", "L0L 6T6", "COPA", 223,
                LocalDate.of(2000, Month.AUGUST, 22),
                LocalDate.of(1974, Month.APRIL, 12));
                * */
       public Student(String firstName, String lastName, String address, String city, String postalCode, String program,int studentNumber,LocalDate dateOFEnrollement, LocalDate dateOfBirth) {
       setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setPostalCode(postalCode);
        setStudentNumber(studentNumber);
        setProgram(program);
        setDateEnrolled(dateOFEnrollement);
        setDateOfBirth(dateOfBirth);
        inGoodStanding = true; 
        
        
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
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

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public LocalDate getDateOFEnrollement() {
        return dateOFEnrollement;
    }

    public void setDateEnrolled(LocalDate dateOFEnrollement) {
        if (LocalDate.now().isBefore(dateOFEnrollement)) {
            throw new IllegalArgumentException("Please check the year entered, student cannot be over 100 years old");
        } else {
            this.dateOFEnrollement = dateOFEnrollement;
        }
    }

    public LocalDate getBirthday() {
        return dateOfBirth;
    }
    
       public int getAge() {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return age;
       }
       

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean inGoodStanding() {
        return inGoodStanding;
    }

    public void setInGoodStanding(boolean inGoodStanding) {
        this.inGoodStanding = inGoodStanding;
    }

    public void changeAddress(String newAddress, String newCity, String newPostalCode) {
        //"49 Granite Court", "Bedrock", "R2D 2B3"
        newAddress="49 Granite Court";
        newCity = "Bedrock";
        newPostalCode = "R2D 2B3";
        setAddress(newAddress);
        setCity(newCity);
        setPostalCode(newPostalCode);
        
        
        
        
    }
     public boolean suspendStudent() {
        inGoodStanding = false;
        return true;

    }
        public int getYearEnrolled() {
        int enrollmentYear = LocalDate.from(dateOFEnrollement).getYear();
        return enrollmentYear;

    }
    public int addStudent() {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return age;
    }


    
    /**
     * This method will tell the student will reinstate or not
     *
     * @return
     */
    public boolean reinstateStudent() {

        boolean inGoodStanding;
        return true;

    }


}
