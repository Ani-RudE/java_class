### SQL Commands ###

- Create Command:

SQL > Create table student100 (rollno number(10), Firstname varchar2(20), Lastname varchar2(20), pap1 number(3), pap2 number(3), pap3 number(3));
     
//table created



#



- Insert Command:

SQL > insert into student100(rollno, Firstname, Lastname, pap1, pap2, pap3)
          values(1, 'k', 'Pavan', 52, 59, 71);

//1 row created

SQL > insert into student100(rollno, Firstname, Lastname, pap1, pap2, pap3)
          values(2, 'M', 'Kiran', 72, 55, 81);

SQL > insert into student100(rollno, Firstname, Lastname, pap1, pap2, pap3)
          values (3, 'B', 'Bhanu', 42, 61, 71);



#



- Select Command:

SQL > Select * from student100 //Prints all the contents of the table "student100"

SQL > Select rollno, Firstname, pap3 from student100 where rollno>=2;
     //Prints the "rollno", "Firstname" and "pap3" values from "student100" table where the rollno>=2



#



- Alter Command:

SQL > alter table student100 add
                         add column address varchar(20);
     
//table altered

SQL > alter table student100 modify column lastname varchar(30);
     
//table altered

SQL > alter table student100
          drop column Firstname;
     
//table altered



#



- Update Command:

SQL > update student100
          set address='India'
          where rollno=2;
     
//1 row updated

SQL > update student100
          set pap2=pap2+10;
     
//3 rows updated



#



- Delete Command:

SQL > delete from student100
          where pap3=71;
     //Deletes selected row(s)
     
//2 rows deleted



#



- Truncate Command:

SQL > truncate table student100;
     //Deletes all the rows from the table



#



- Drop Command:

SQL > drop table student100;
     //Deletes the complete table from the database



#



- Insert Null Values:
SQL > insert into student100(rollno, Firstname, lastname, pap1, pap3)
          values(4, 'C', 'RAVI', 54, 73);
     //Inserts values for selected fields only

SQL > select * from student100
          where pap2=null;

SQL > select * from student100
          where pap2 IS NOT NULL;
     //select cmd selects fields, where cmd selects rows