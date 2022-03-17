/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class5;

import java.util.Scanner;

/**
 *
 * @author youse
 */
public class Project_in_Class5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SinglyLinkedList<String>list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice = -1;
        System.out.println("1 : add first\t\t2 : add last \n3 : remove first\t4 : remove all \n0 exit");
        
        while (choice != 0)
        {
            System.out.print("your choice:");
            choice = in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("input name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("remved : "+list.removeFirst());;
                    break;
                case 4:
                    while (!list.isEmpty())
                        System.out.print(list.removeFirst()+"\t");
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("\nfirst node = "+list.first()+"\tlast node = "+list.last()+"\tsize= "+list.size());
            
        }
        
        
        
        
    }
    
}
