package org.library.Driver;

import org.library.Dao.dblibrary;
import org.library.Entity.Library;

import java.util.Scanner;

public class LibraryDriver {

    private static int choice = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        dblibrary dblibrary = new dblibrary();
        org.library.Dao.dblibrary.connectToDb();
        do{
            System.out.println("1.Add Book\n2.Delete Book details\n3.Update Book Details\n4.Display All Books\n5.Get By ID");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    Library l1 = new Library();
                    System.out.println("Enter Book id : ");
                    l1.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Book name : ");
                    l1.setName(sc.nextLine());
                    System.out.println("Enter Books Author Name : ");
                    l1.setAuthor(sc.nextLine());
                    System.out.println("Enter Publisher of the Book: ");
                    l1.setPublisher(sc.nextLine());
                    System.out.println("Enter Books Language : ");
                    l1.setLanguage(sc.nextLine());

                    int rws = dblibrary.insert(l1);
                    if (rws>0){
                        System.out.println(" Book inserted successfully");
                    }else{
                        System.out.println("Issue in inserting");
                    }
                    break;
                case 2:
                    System.out.println("Enter Book ID");
                    if(dblibrary.deleteById(sc.nextInt())){
                        System.out.println("Book details Deleted Successfully.");
                    }else{
                        System.out.println("issue in deleting data");
                    }
                    break;
                case 3:
                    Library lib = new Library();
                    System.out.println("Enter the Book ID You want to UPDATE");
                    lib.setId(sc.nextInt());
                    System.out.println("Enter The Updated Book Name :");
                    sc.nextLine();
                    lib.setName(sc.nextLine());
                    System.out.println("Enter the Updated Author Name :");
                    lib.setAuthor(sc.nextLine());
                    System.out.println("Enter the updated Publisher Name : ");
                    lib.setPublisher(sc.nextLine());
                    System.out.println("Enter the Books Language : ");
                    lib.setLanguage(sc.nextLine());
                    if(dblibrary.update(lib)>0){
                        System.out.println("Book details Updated...Successfully.");
                    }else{
                        System.out.println("issue in updating");
                    }
                    break;
                case 4:
                    dblibrary.displayAll();
                    break;
                case 5:
                    System.out.println("Enter Book ID : ");
                    dblibrary.getById(sc.nextInt());
                    break;

                default:
                    System.out.println("Enter valid data");
            }

        }while(choice!=0);
    }
}
