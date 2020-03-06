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
public class Role {
    
    String roleName;
    float duration;
    String roleDescription;
    
    public void setRoleName(String roleName){
        this.roleName = roleName;
    }
    
    public void setDuration(float duration){
        this.duration = duration;
    }
    
    public void setRoleDescription(String roleDescription){
        this.roleDescription = roleDescription;
    }
    
    public String getRoleName(){
        return roleName;
    }
    
    public float getDuration(){
        return duration;
    }
    
    public String getRoleDescription(){
        return roleDescription;
    }
}
