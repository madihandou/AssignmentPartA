/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1parta;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Module {
   
    private String moduleName;
    private String moduleID;
    private ArrayList<Student> SdtList;
    private String coursename;

    public Module(String name, String id, ArrayList<Student> students, String csname) {


        this.moduleName = name;
        this.moduleID = id;

                this.SdtList = students;
                                this.coursename= csname;
    }

    public void setStudentList(ArrayList SL) {

        this.SdtList = SL;

    }

    public ArrayList getStudentList() {

        return SdtList;
    }

    public void addTotheStudentsList(Student s) {
        this.SdtList.add(s);

    }

    public void setModuleName(String modname) {

        this.moduleName = modname;
    }

    public String getModulename() {

        return moduleName;
    }

    public void setModuleid(String modId) {
        this.moduleID = modId;
    }

    public String getModuleid() {

        return moduleID;
    }

    public void setCourseName(String cnm) {

        this.coursename = cnm;
    }

    public String getCourseName() {

        return coursename;

    } 
}
