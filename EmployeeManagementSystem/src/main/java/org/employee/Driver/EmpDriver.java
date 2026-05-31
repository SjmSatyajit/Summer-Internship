package org.employee.Driver;

import org.employee.Dao.dbemp;
import org.employee.Entity.Employee;

import java.util.Scanner;

public class EmpDriver {

    private static int choice = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        dbemp dbemp = new dbemp();
        org.employee.Dao.dbemp.connectToDb();
        do{
            System.out.println("1.Add Employee\n2.Delete Employee details\n3.Update\n4.DisplayAll\n5.GetByid");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    Employee e1 = new Employee();
                    System.out.println("Enter id: ");
                    e1.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter name: ");
                    e1.setName(sc.nextLine());
                    System.out.println("Enter Employee DOB(YYYY-MM-DD): ");
                    e1.setDob(sc.nextLine());
                    System.out.println("Enter department: ");
                    e1.setDepartment(sc.nextLine());
                    System.out.println("Enter employee Phone No.: ");
                    e1.setPhoneNo(sc.nextLine());
                    System.out.println("Enter emp Account No.: ");
                    e1.setAccNo(sc.nextLine());
                    System.out.println("Enter the salary: ");
                    e1.setSalary(sc.nextLine());
                    int rws = dbemp.insert(e1);
                    if (rws>0){
                        System.out.println(" User inserted successfully");
                    }else{
                        System.out.println("Issue in inserting");
                    }
                    break;
                case 2:
                    System.out.println("Enter ID");
                    if(dbemp.deleteById(sc.nextInt())){
                        System.out.println("Employee details Deleted Successfully.");
                    }else{
                        System.out.println("issue in deleting data");
                    }
                    break;
                case 3:
                    Employee emp = new Employee();
                    System.out.println("Enter the id You want to UPDATE");
                    emp.setId(sc.nextInt());
                    System.out.println("Enter the updated name");
                    sc.nextLine();
                    emp.setName(sc.nextLine());
                    System.out.println("Enter the Updated DOB(YYYY-MM-DD)");
                    emp.setDob(sc.nextLine());
                    System.out.println("Enter the updated department: ");
                    emp.setDepartment(sc.nextLine());
                    System.out.println("Enter updated Phone No.: ");
                    emp.setPhoneNo(sc.nextLine());
                    System.out.println("Enter the new Account No.: ");
                    emp.setAccNo(sc.nextLine());
                    System.out.println("Enter the updated salary: ");
                    emp.setSalary(sc.nextLine());
                    if(dbemp.update(emp)>0){
                        System.out.println("Employee details Updated...Successfully.");
                    }else{
                        System.out.println("issue in updating");
                    }
                    break;
                case 4:
                    dbemp.displayAll();
                    break;
                case 5:
                    System.out.println("Enter id : ");
                    dbemp.getByid(sc.nextInt());
                    break;

                default:
                    System.out.println("Enter valid data");
            }

        }while(choice!=0);
    }
}
