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
public class KeyActors {
    
    String key;
    String identifier;
    String screenName;
    
    public void setActorKey(String key){
        this.key = key;
    }
    
    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }
    
    public void setScreenName(String screenName){
        this.screenName = screenName;
    }
    
    public String getKey(){
        return key;
    }
        
    public String getScreenName(){
        return screenName;
    }
    
    public String getIdentifier(){
        return identifier;
    }
}
