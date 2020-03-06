/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

/**
 *
 * @author jonathan
 */
import java.util.*;
/**
 *
 * @author sed_e
 */
public class Steps {
    
    String description;
    List<String> subSteps;
    float duration;
    List<KeyActors> stepActors;
    String pictureURL;
    String warning;
    String caution;
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setSubSteps(List<String> subSteps){
        this.subSteps = new ArrayList<String>();
        this.subSteps = subSteps;
    }
    
    public void setDuration(float duration){
        this.duration = duration;
    }
    
    public void setKeyActors(List<KeyActors> stepActors){
        this.stepActors = new ArrayList<KeyActors>();
        this.stepActors = stepActors;
    }
    
    public void setPicturesURL(String pictureURL){
        this.pictureURL = pictureURL;
    }
    
    public void setWarning(String warning){
        this.warning = warning;
    }
    
    public void setCaution(String caution){
        this.caution = caution;
    }
    
    public String getDescription(){
        return description;
    }
    
    public List<String> getSubSteps(){
        return subSteps;
    }
    
    public float getDuration(){
        return duration;
    }
    
    public List<KeyActors> getStepActors(){
        return stepActors;
    }
    
    public String getPicturesURL(){
        return picturesURL;
    }
    
    public String getWarning(){
        return warning;
    }
    
    public String getCaution(){
        return caution;
    }
}


