/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1parta;

import org.joda.time.LocalDate;

/**
 *
 * @author Owner
 */
public class Student {
    
         private String firstname;
    private String surname;
    private String userName;
    private String moduleName;
    private String courseName;
    private int StudentId;
    private int age;
    private LocalDate DOB;
    LocalDate today = new LocalDate();

    ///  Student st= new Student("yousuf",32);
    public Student(String fnm, String snm, int age,LocalDate db,String csnm, String mdN,int stId ) {
        this.StudentId = stId;
        this.firstname = fnm;
        this.surname = snm;
        this.courseName = csnm;
        this.moduleName = mdN;
        this.age = age;
        this.DOB = db;
        this.userName = (firstname + surname + age);
    }


    public void setfName(String fName) {
        firstname = fName;

    }

    public String getfName() {
        return firstname;

    }

    public void setSName(String SName) {
        surname = SName;
    }

    public String getSName() {
        return surname;
    }

    public void setModulename(String newModulename) {
        moduleName = newModulename;

    }

    public String getUsername() {
        String name= this.firstname+ "_" +this.surname;
        String username= name + "_" + Integer.toString(this.age);
        
        return username;

    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getmoduleName() {
        return moduleName;

    }

    public void setcourseName(String csnm) {

        this.courseName = csnm;
    }

    public String getcourseName() {
        return courseName;
    }
    
    
}
