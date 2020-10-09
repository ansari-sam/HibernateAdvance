package com.hibernate.PrimaryKey;

import java.io.Serializable;
import java.sql.*;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

			String prefix= "PER";
			Connection connection = session.connection();
			
			 try {
		            Statement statement=connection.createStatement();

		            ResultSet rs=statement.executeQuery("select count(Person_Id) as Id from Person1");

		            if(rs.next())
		            {
		                int id=rs.getInt(1)+101;
		                String generatedId = prefix + new Integer(id).toString();
		                System.out.println("Generated Id: " + generatedId);
		                return generatedId;
		            }
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		
		return null;
	}

}
