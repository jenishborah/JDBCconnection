# JDBCconnection
How to set connection with java and MySql using JDBC deiver 

## How to Run this Project
1. Download the any IDE like NetBeans, Eclips etc.
2. Dowload the JDBC Driver
3. Try the Code 

## Changes Required in Your Code


 Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/dept","username","password"); 
        
In The above code(located in src folder named as demodbconnection)

You have to change the "username","password" to your mysql user and password

