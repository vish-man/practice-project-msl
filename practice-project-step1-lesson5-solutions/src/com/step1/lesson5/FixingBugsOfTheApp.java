package com.step1.lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FixingBugsOfTheApp {
	
	public static void main(String[] args) {
		
        System.out.println("welcome to the Help Desk \n");
        
         optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {
        		"1. To review your expenditure",
                "2. To add your expenditure",
                "3. To delete your expenditure",
                "4. To sort the expenditures",
                "5. To search for a particular expenditure",
                "6. To Close the application"
        };
        
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
           
            //for displaying all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(850);
        expenses.add(360);
        expenses.add(9000);
        expenses.add(87);
        expenses.add(2500);
        expenses.addAll(arrlist);
      System.out.println("\nEnter your desired choice to operate on the expenditure");

        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
            	
                switch (options){
                
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                        
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                        
                    case 3:
                        System.out.println("You are going to delete your data about the expenses you saved."
                        		+ " \nSo please confirm by re-entering your choice..\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("You deleted all your data\n");
                        } 
                        else {
                            System.out.println("Please try again..");
                        }
                        optionsSelection();
                        break;
                        
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                        
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                        
                    case 6:
                        closeApp();
                        break;
                        
                    default:
                        System.out.println("Please enter the valid choice");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Thanks for your time, as you requested closing the app now...");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you want to search:\t");
        //
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Linear Search
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the expense " + input + " at " + i + " position");
        	}
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.
        
        Collections.sort(arrayList);
        System.out.println("Sorted expenses: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
       
    }
}