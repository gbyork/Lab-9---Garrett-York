/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rando
 */
public class UndergraduateStudent {
    private int year;

    public UndergraduateStudent(int year) {
        this.year = year;
    }

    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
      @Override
    public String toString() {
        return "Undergraduate Student{" + "year" + year + '}' + super.toString();
    }
}
