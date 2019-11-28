package com.ustglobal.HasARelationship.weak;

public class TestB {
	public static void main(String[] args) {
		Music m=new Music();
		System.out.println(m.musicSystem);
		System.out.println(m.version );
		m.soundChecking();
		m.c1.sounding();
		System.out.println(m.c1.name);
		
	}

}
