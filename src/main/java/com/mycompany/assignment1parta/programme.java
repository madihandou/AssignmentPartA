/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1parta;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Owner
 */
public class programme {
    private String CourseName;
    private ArrayList moduleList;
    private LocalDate startdate;
    private LocalDate enddate;

    public programme(String csname, LocalDate stdate, LocalDate enddate, ArrayList moduleList) {
        this.CourseName = csname;
        this.moduleList = moduleList;
        this.startdate = stdate;
        this.enddate = enddate;

    }

    public void setCourseName(String csnm) {
        this.CourseName = csnm;

    }

    public String getCourseName() {
        return CourseName;

    }

    public void setModuleList(ArrayList modList) {
        this.moduleList = modList;

    }

    public void setStarDate(LocalDate startDate) {
        this.startdate = startDate;

    }

    public ArrayList getModuleList() {
        return moduleList;
    }

    public LocalDate getStartDate() {
        return startdate;
    }
    public void setEndDate(LocalDate EndDate) {
        this.enddate = EndDate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void printStudents(){
        ArrayList<Student> CourseStudent = new ArrayList<Student>();
        
        
        ArrayList<Module> module = new ArrayList<Module>();
       
        module = this.getModuleList();
        
        for (int i=0 ; i<module.size() ; i++){
        
            Module m = module.get(i);
            
            ArrayList<Student> ModuleStudent = new ArrayList<Student>();
            
            ModuleStudent = m.getStudentList();
            
            for (int j=0 ; j<ModuleStudent.size();j++){
            
                Student s = ModuleStudent.get(j);
                
                if (s. getcourseName().equals(this.getCourseName()) && !(CourseStudent.contains(s))){
                    CourseStudent.add(s);
                
                    System.out.println(s.getfName() + "\t Course: " + s.getcourseName());
                    
                    System.out.print("\t Modules: ");
                    
                    for(int k=0; k<module.size();k++){
                        System.out.print(module.get(k).getModulename() + " -- ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
