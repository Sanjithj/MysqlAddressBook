package com.bridgelabz;

public class Mysql {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Mysql Databse");
		 create database Address_Book_Service;
		 use Address_Book_Service;
		 show databases;
		 
		 create table address_book(
				 
		 first_name varchar(40),
		 last_name varchar(30),
		 address varchar(65),
		 city varchar(30),
		 state varchar(50),
		 zip int,
		 phone_number long,
		 email varchar(20));
				 
	}

}
