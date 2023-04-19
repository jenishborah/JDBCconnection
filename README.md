# JDBCconnection
How to set connection with java and MySql using JDBC deiver 

## Requirements

To run this project, I use the following:

- Any IDE like NetBeans, Eclips etc.
- MySQL Server https://dev.mysql.com/downloads/
- MySQL Connector/J JDBC driver https://dev.mysql.com/downloads/connector/j/

## Installation

1. Clone this repository or download the zip file.
2. Install MySQL Server and create a new database.
3. Execute the SQL script `create_database.sql` to create the necessary tables.
4. Update the `DB_NAME`, `DB_USER`, and `DB_PASSWORD`in the `DBConnection.java` file with your MySQL database information.
5. Add the MySQL Connector/J JAR file to your project's classpath.
6. Compile and run the `Dbconnection.java` file.


## Database Schema

The database schema for this project consists of a single table named `books_info`. The table has the following columns:

'Book_id' int not null
'Book_title'  varchar(100) not null
'Edition' varchar(10)  
'Author'  varchar(100) not null     
'Published_by'  varchar(40)  not null     
'Genre'  varchar(20)  not null  
'Price_in_Rs'  int   not null  
'Total_Pages'  int   not null  

##  Output of the Code

The code will display the following details or information of books_info table:

'Book_id' , 'Book_title', 'Edition' , 'Price_in_Rs'
