package com.ty.project;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name , percentage , Gender in the same order");

		
		LinkedHashSet<Candidate> l=new LinkedHashSet<Candidate>();
		l.add(new Candidate(sc.next(),sc.nextInt(),sc.next()));	
		l.add(new Candidate(sc.next(),sc.nextInt(),sc.next()));	
		l.add(new Candidate(sc.next(),sc.nextInt(),sc.next()));	
		l.add(new Candidate(sc.next(),sc.nextInt(),sc.next()));	
	
		
		Company c=new Company(60);
		
		System.out.println("The Eligible candidates are :");
		for(Candidate cd:l) {
			if(cd.getPer()>=c.getEligible() && cd.getPer()<=100) {
				System.out.println(cd.getName()+"\t\t"+cd.getPer());
			}
			
		}
		
		
	
		
		
		
	}

}
