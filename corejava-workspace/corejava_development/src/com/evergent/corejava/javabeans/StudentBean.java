package com.evergent.corejava.javabeans;

public class StudentBean {
     private int sno;
     private String sname;
     private String address;
     public void setSname(String sname)
     {
    	this.sname=sname;
     }
     public void setSno(int sno)
     {
    	 this.sno=sno;
     }
     public void setAddress(String address)
     {
    	 this.address=address;
     }
     public String toString()
     {
    	 return "student no: " + sno+ "\n student name: " +sname+ "\n student address: "+address;
     }
}
