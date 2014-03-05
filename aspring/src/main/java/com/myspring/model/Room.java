package com.myspring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @description: TODO
 * 
 * @createtime: 2014-3-5 下午4:29:09
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
@Entity
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roomid;
	private String roomname;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="room")
	private Student student;

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
