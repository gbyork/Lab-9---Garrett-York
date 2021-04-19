/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rando
 */
public class GraduateStudent extends Student{
    private String type;
    
    public GraduateStudent(String type) {
       
        this.type = type;
    }
  
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 @Override
    public String toString() {
        return "Graduate Student{" + " type " + type + '}' + super.toString();
    }
}
