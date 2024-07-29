package com.TreeSet;
public class Student implements Comparable {
	private Integer stid;
	private String sname;


	public Student(Integer stid, String sname) {
	    this.stid = stid;
	    this.sname = sname;
	}
	public Integer getStid() {
	    return stid;
	}

	public void setStid(Integer stid) {
	    this.stid = stid;
	}

	public String getSname() {
	    return sname;
	}

	public void setSname(String sname) {
	    this.sname = sname;
	}
	@Override
	public String toString() {
	    return "Student [stid=" + stid + ", sname=" + sname + "]";
	}
	@Override
	public int compareTo(Object o) {
	    return this.getSname().compareTo(((Student) o).getSname());
	}

}
