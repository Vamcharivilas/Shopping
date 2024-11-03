# Shopping
Shopping Hibernate-MySQL Project
Hibernate-MySQL Project
This project demonstrates the use of Hibernate ORM (Object-Relational Mapping) with MySQL to manage relational data in a Java application. It includes entity relationships, annotation-based mapping, and configuration using persistence.xml.
Overview

The provided Java code is a console-based e-commerce application that allows users to interact with a shopping system. The application has two main roles: Vendor and Customer. Vendors can manage their shops, products, and customers, while customers can browse products, add to cart, and make payments.

The code is organized into several classes, each representing a specific entity or functionality:

MainUser: The main class that contains the application's entry point and handles user input.
Customer: Represents a customer entity with attributes like name, email, password, phone number.
Vendor: Represents a vendor entity with attributes like name, email, password, and phone number.
Shop: Represents a shop entity with attributes like name, address, and products.
Product: Represents a product entity with attributes like name, number of products, and price.
Payment: Represents a payment entity with attributes like mode and bill amount.
CustomerCrud, VendorCurd, ShopCrud, ProductCrud, and PaymentCrud: These classes provide CRUD (Create, Read, Update, Delete) operations for their respective entities.
Implementation

Here's a high-level overview of the code implementation:

MainUser: The main method initializes the application and presents a menu to the user. Based on the user's choice, it calls the corresponding method to handle the functionality.
Customer: The Customer class has methods for registering, logging in, updating profile, and making payments.
Vendor: The Vendor class has methods for registering, logging in, creating and managing shops, and adding products to shops.
Shop: The Shop class has methods for creating, updating, and deleting shops.
Product: The Product class has methods for creating, updating, and deleting products.
Payment: The Payment class has methods for making payments.
Key Features

User Authentication: The application uses a simple authentication mechanism where users can register and log in using their email and password.
Shop Management: Vendors can create, update, and delete shops, as well as add products to shops.
Product Management: Vendors can create, update, and delete products.
Cart and Payment: Customers can add products to their cart and make payments.
CRUD Operations: The application provides CRUD operations for all entities, allowing for data manipulation and retrieval.

Prerequisites
Java Development Kit (JDK) 8 or above
MySQL database server
Maven (for dependency management)
Hibernate Core and JPA dependencies
Database Setup
Install and start MySQL.
Create a new database (e.g., hibernate_example).
Configure MySQL access in persistence.xml.
Configuration (persistence.xml)
The persistence.xml file is located in the src/main/resources/META-INF directory. It includes configurations for:

Database Connection: MySQL URL, username, and password.
Dialect: Specifies the MySQL dialect for Hibernate.
Show SQL: Displays SQL queries in the console.
DDL Auto: Automatically creates or updates tables.
