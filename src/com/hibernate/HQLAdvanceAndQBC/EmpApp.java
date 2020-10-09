package com.hibernate.HQLAdvanceAndQBC;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

public class EmpApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			//save Data into DB with Emp Object
//			for(int i=10;i<15;i++) {
//				Employee emp=new Employee();
//				emp.seteName("Name "+i);
//				emp.seteEmail("emp"+i+"@"+"gmail.com");
//				emp.setePhone(987633+i);
//				emp.seteCity("Pune");
//				emp.seteSalary(700*i);
//				session.save(emp);
//			}
			
			
			//HQL (Hibernate Query language).
			//Display All Employee 
			
//			String query="from Employee";
//			Query q=session.createQuery(query);
//			List<Employee> list=q.list();
//			System.out.println("\n--------------------------------------------------\n");
//			System.out.println("...........All Employee...........................\n");
//			for(Employee emp:list) {
//				System.out.println(emp.geteId()+"\t"+emp.geteName()+"\t\t"+emp.geteEmail()+"\t"+emp.geteCity()+"\t"+emp.getePhone()+"\t"+emp.geteSalary());
//			}
			
			//Display all the Employee belongs to Noida
			
			//String query="from Employee where Emp_City='Noida'";
//			Query q=session.createQuery("from Employee where Emp_City='Noida'");
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee which belongs to Noida-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee staying in Noida with Salary Greater Than {>} 10000.
			
//			Query q=session.createQuery("from Employee where Emp_City='Noida' and Emp_Salary>10000");
//			Query q=session.createQuery("from Employee where Emp_City=:c and Emp_Salary>:s");
//			q.setParameter("c", "Noida");
//			q.setParameter("s", 5000);
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee staying in Noida with Salary> 10000.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee which belongs to Noida and having Salary {between} 5000 and 25000
			
//			Query q=session.createQuery("from Employee where Emp_City=? and Emp_Salary between ? and ?");//Dynamic query Execution or Place Holder Mechanism 
//			q.setParameter(0, "Noida");
//			q.setParameter(1, 10000);
//			q.setParameter(2, 25000);
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee which belongs to Noida and having Salary between 5000 and 25000.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee who are {in} Noida, Pune, and Delhi.
			
//			Query q=session.createQuery("from Employee where Emp_City in (?,?,?)");
//			q.setParameter(0, "Noida");
//			q.setParameter(1, "Pune");
//			q.setParameter(2, "Delhi");
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee who are {in} Noida, Pune, and Delhi.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee who are in Noida, in desc {DESC} {order by} eName
			
			/*When sorting your result set in descending order, you use the {DESC} attribute 
			in your {ORDER BY} clause as follows: SELECT last_name, first_name, city FROM contacts 
			WHERE last_name = 'Johnson' ORDER BY city DESC; 
			
			ASC (ascending order)
			We can also use ORDER BY city ASC; {ASC} attribute in your {ORDER BY}
			*
			*/
			
//			Query q=session.createQuery("from Employee where Emp_City=? order by eName desc");//give list of Noida city employee in Descending order
//			//Query q=session.createQuery("from Employee where Emp_City=? ORDER BY eName ASC");//give list of Noida city employee in Ascending order
//			q.setParameter(0, "Noida");
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee who are in Noida, in desc(DESC) or asc(ASC) order by eName.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee whose email is end with Jtc.com or gmail.com or myname.com email {order by} eId
			//Using {LIKE} Keyword
			
//			Query q=session.createQuery("from Employee where Emp_Email LIKE ? ORDER BY eId ASC");
////			q.setParameter(0, "%Jtc.com");
//			q.setParameter(0, "%gmail.com");
////			q.setParameter(0, "%myname.com");
//			List<Employee> list=q.list();
//			System.out.println("\n---------------------Display all the Employee whose email is end with Jtc.com or gmail.com or myname.com email {order by} eEmail-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			
			//Display Nth Highest Salary from Employee [{NOT IN}--means skip, would not select as per given query
			//Get 2nd highest Salary
//			String query="select max(eSalary) from Employee where eSalary NOT IN (select max(eSalary) from Employee)";
			//first check last query and then skip their value with help of NOT IN then again check with left query that give our result
//			Query q = session.createQuery (query);
//			System.out.println(q.list());
			
			//Get 3rd highest Salary
			String query="select max(eSalary) from Employee where eSalary < (select max(eSalary) from Employee where eSalary NOT IN (select max(eSalary) from Employee))";
			Query q = session.createQuery (query);
			System.out.println(q.list());
			
			
			
			
			
			//Display Sum of Salary from Employee
//				String query="select sum(eSalary) from Employee";
//				Query q = session.createQuery (query);
//				System.out.println(q.list());
				
				//Display Max  Salary from Employee
//				String query="select max(eSalary) from Employee";
//				Query q = session.createQuery (query);
//				System.out.println(q.list());
				
				//Display Min  Salary from Employee
//				String query="select min(eSalary) from Employee";
//				Query q = session.createQuery (query);
//				System.out.println(q.list());
			
			//Display Average {avg}  Salary from Employee
//			String query="select avg(eSalary) from Employee";
//			Query q = session.createQuery (query);
//			System.out.println(q.list());
			
//			count total number of employee ID
//			String query="select count(eId) from Employee";
//			Query q = session.createQuery (query);
//			System.out.println(q.list());

			//Pegination
//			String query="from Employee ORDER BY Emp_Salary DESC";
//			Query q = session.createQuery (query);
//			q.setFirstResult(3);
//			q.setMaxResults(10);
//			List<Employee> list=q.list();
//			for(Employee emp:list) {
////			Integer N=emp.geteSalary();
////				System.out.println(N);
//				System.out.println(emp.geteName()+"\t"+emp.geteSalary());
//			}
		
			
			
			
			
//			QBC(Query by criteria)
			
//			Criteria ct=session.createCriteria(Employee.class);
//			List<Employee> list1=ct.list();
//			System.out.println("\n--------------------------------------------------\n");
//			System.out.println("...........All Employee...........................\n");
//			for(Employee emp:list1) {
//				System.out.println(emp.geteId()+"\t"+emp.geteName()+"\t\t"+emp.geteEmail()+"\t"+emp.geteCity()+"\t"+emp.getePhone()+"\t"+emp.geteSalary());
//			}
			
			
           //Display all the Employee belongs to Noida
			
//			Criteria ct=session.createCriteria(Employee.class);
//			ct.add(Expression.eq("eCity", "Noida"));
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee which belongs to Noida-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee staying in Noida with Salary Greater Than {>} 10000.
			
//			Criteria ct=session.createCriteria(Employee.class);
//			ct=ct.add(Expression. and (Expression.eq("eCity", "Noida"),Expression.gt("eSalary", 10000)));
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee staying in Noida with Salary> 10000.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee which belongs to Noida and having Salary {between} 5000 and 25000
			
//			Criteria ct=session.createCriteria(Employee.class);
//			ct=ct.add(Expression. and (Expression.eq("eCity", "Noida"),Expression.between("eSalary", 15000, 25000)));
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee which belongs to Noida and having Salary between 5000 and 25000.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee who are {in} Noida, Pune, and Delhi.
			
//			Criteria ct=session.createCriteria(Employee.class);
//			//String[] city= {"Noida","Delhi","Pune"};
//			String[] city= {"Noida","Delhi"};
//			ct.add(Expression.in("eCity", city));
//			
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee who are {in} Noida, Pune, and Delhi.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Display all the Employee who are in Noida, in desc {DESC} {order by} eName
			
			/*When sorting your result set in descending order, you use the {DESC} attribute 
			in your {ORDER BY} clause as follows: SELECT last_name, first_name, city FROM contacts 
			WHERE last_name = 'Johnson' ORDER BY city DESC; 
			
			ASC (ascending order)
			We can also use ORDER BY city ASC; {ASC} attribute in your {ORDER BY}
			*
			*/
			
//			Criteria ct=session.createCriteria(Employee.class);
//			ct.add(Expression.eq("eCity", "Noida"));
//			//ct.addOrder(Order.desc("eName"));
//			ct.addOrder(Order.asc("eName"));
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee who are in Noida, in desc(DESC) or asc(ASC) order by eName.-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
//			
			//Display all the Employee whose email is end with Jtc.com or gmail.com or myname.com email {order by} eId
			//Using {LIKE} Keyword
			
//			Criteria ct=session.createCriteria(Employee.class);
////			//ct.add(Expression.like("eEmail", "%gmail.com"));
////			//ct.add(Expression.like("eEmail", "%Jtc.com"));
//			ct.add(Expression.like("eEmail", "%myname.com"));
//			//ct.addOrder(Order.desc("eId"));
//			ct.addOrder(Order.asc("eId"));
//			List<Employee> list=ct.list();
//			System.out.println("\n---------------------Display all the Employee whose email is end with Jtc.com or gmail.com or myname.com email {order by} eEmail-----------------------------\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			//Pagination
//			Criteria ct=session.createCriteria(Employee.class);
//			ct.setFirstResult(3);
//			ct.setMaxResults(10);
//			List<Employee> list=ct.list();
//			System.out.println("\n............................\n");
//			for(Employee emp:list) {
//				System.out.println(emp);
//			}
			
			
			Tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}

	}

}
