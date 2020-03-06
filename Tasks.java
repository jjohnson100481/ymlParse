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
 * @author jonathan
 */
public class Tasks{
    
    String title;
    String file;
    List<Role> roles;
    String color;
    List<Steps> steps;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setFile(String file){
        this.file = file;
    }
    
    public void setRoles(List<Role> roles){
        this.roles = new ArrayList<Role>();
        this.roles = roles;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setSteps(List<Steps> steps){
        this.steps = new ArrayList<Steps>();
        this.steps = steps;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getFile(){
        return file;
    }
    
    public List<Role> getRoles(){
        return roles;
    }
    public String getColor(){
        return color;
    }
    
    public List<Steps> getSteps(){
        return steps;
    }
    
}