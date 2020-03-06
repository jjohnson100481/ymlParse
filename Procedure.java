/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.*;
import java.io.*;

/**
 *
 * @author Jonathan
 */
public class Procedure {

    String procedureName ="";
    List<KeyActors> keyActors;
    List<Tasks> tasks;
    
    public Procedures(){
        keyActors = new ArrayList<KeyActors>();
        tasks = new ArrayList();
    }
    
    public void setProcedure(String procedureName){
        this.procedureName = procedureName;
    }
        
    public String getProcedure(){
       return procedureName;
    }
    
    public String getActorName(String actor) throws Exception{
        String nameOfActor = "";
        for(int x = 0; x < keyActors.size(); x++){
            if(keyActors.get(x).toString().equals(actor))
                nameOfActor = actor;
            else
                throw new Exception();
                
        }
        return actor;
    }
    
    public List getActorList(){
        return keyActors;
    }
    
     public String getTaskName(String task) throws Exception{
        String nameOfTask = "";
        for(int x = 0; x < tasks.size(); x++){
            if(tasks.get(x).toString().equals(task))
                nameOfTask = task;
            else
                throw new Exception();
                
        }
        return nameOfTask;
    }
    
    
   
    
}
