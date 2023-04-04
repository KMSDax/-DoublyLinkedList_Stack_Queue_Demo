/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singlelinkedlist;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class PrimeNumber {
    public static void main(String[] args) {
    


        LinkedList numList = new LinkedList();
        LinkedList threeOnly = new LinkedList();    
        
        //Write a program that uses a SinglyLinkedList that gets populated by prime numbers from 0 to n.
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int nodeCount = myObj.nextInt();

        
        
        for(int i=nodeCount;i>0;i--){
        System.out.println("Input the " + i + " node");
        int nodeTemp = myObj.nextInt();
        //Then move the prime numbers that has the digit '3' into another linked list.
        if (nodeTemp % 10 == 3) {
            Node nodeAdd = new Node(nodeTemp);
            threeOnly.append(nodeAdd);
        }else{
            Node nodeAdd = new Node(nodeTemp);
            numList.append(nodeAdd);
        }
        
        }
        //After that find the sum of numbers in the second list.  (n should be less than 1,000,000). (in LinkedList)
        //For example, the sum of the prime numbers (with 3 digit) between 0 and n=100 is (3+ 13+  23+ 31+ 37+ 43+  53+73+83 )= 359.
        System.out.print("List of numbers with 3 in it: ");
        threeOnly.printList();
        System.out.print(threeOnly.sum());
        
    }
}
