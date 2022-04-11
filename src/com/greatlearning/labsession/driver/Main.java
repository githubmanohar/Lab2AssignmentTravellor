package com.greatlearning.labsession.driver;

import java.util.Scanner;
import com.greatlearning.labsession.service.MergeSortImplementation;
import com.greatlearning.labsession.service.NotesCount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notescount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<size; i++) {
			notes[i] = sc.nextInt();
			}
		System.out.println("The amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notescount.notesCountImplementation(notes,amount);
		
		
	}

}
