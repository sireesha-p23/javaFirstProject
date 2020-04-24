/*Database(SQL)
 
Open source object-relational database system : Postgre
NAME : sireesha
*/

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 1:Write a query which displays the module code and the duration for modules whose duration is less than 6. */

SELECT modulecode,duration FROM modules WHERE duration<6;

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/* query 2:Write a query which will display the BATCHCODE, TRAINERID, COURSECODE, STARTDATE, CAPACITY 
and BATCHSTRENGTH of the batches handled by the trainer KRISHNAN.*/

SELECT batchcode, trainerid ,coursecode, startdate, capacity,batchstrength FROM batches WHERE trainerid IN (SELECT trainerid FROM trainers WHERE trainername='KRISHNAN');

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 3:
Write a query which displays all the module names of the course code 100.*/

SELECT modulename FROM modules WHERE modulecode IN (SELECT modulecode FROM courseandmodules WHERE coursecode=100);

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 4:
Write a query which displays the module names and course code for the course code 100.*/

SELECT modulename,coursecode FROM modules INNER JOIN courseandmodules ON modules.modulecode=courseandmodules.modulecode WHERE coursecode=100;

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 5:
"Write a query which will display the number of modules present in the course code 100.*/

SELECT COUNT(modulename) AS NumberofModules FROM modules WHERE modulecode IN (SELECT modulecode FROM courseandmodules WHERE coursecode=100);

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 6:
Write a query which will display all the course code and the number of modules present */

SELECT coursecode,COUNT(modulename) AS NumberofModules FROM modules INNER JOIN courseandmodules ON modules.modulecode=courseandmodules.modulecode GROUP BY coursecode;

/*-------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 7:
Write a query which will display the course title and fees which has the maximum fees.*/

SELECT title, fees FROM courses WHERE fees=(SELECT MAX(fees) FROM courses);

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 8:
Write a query which will display the student id, student name, batch code, place and phone number of the students who belongs to Batch '3001'.*/

SELECT studentid,studentname,batchcode,place,phone FROM students WHERE batchcode=3001;

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 9:
Write a Query which will display the student ID, Student name, Batch code, place and phone number who are from CHENNAI.*/

 SELECT studentid,studentname,batchcode,place,phone FROM students WHERE place='CHENNAI';

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 10
Write a query which displays the total number of modules which has less than 6 days duration. */

SELECT count(modulename) AS LESSTHANSIXDAYS FROM modules WHERE duration<6;

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*query 11:
Write a query to display the batch code, course title, start date of the batches for the month of May and year 2012.*/

SELECT batchcode,title,startdate FROM courses,batches WHERE courses.coursecode=batches.coursecode AND startdate BETWEEN '2012-03-01' AND '2012-03-31';

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*Query 12:
Write a query to display courses code, course title, course fees of the courses for which no batches/training has been planned in the month of January and year 2012.*/

SELECT courses.coursecode,title,fees FROM courses,batches WHERE courses.coursecode=batches.coursecode AND startdate NOT IN (SELECT startdate FROM batches WHERE startdate BETWEEN '2012-01-01' AND '2012-01-31');

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*Query 13:
Write a query which displays the names of all the modules of the course titled 'Oracle DBA'*/

SELECT modulename FROM modules,courses WHERE title='Oracle DBA';

/*query 14:
Write a Query which displays the student ID, Student name, Batch code, place and phone number of the student's who took training from CHENNAI in the year 2012.*/

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*Query 14:
Write a query which will display the student id, student names who are enrolled for the course code 200?*/

SELECT studentid,studentname,students.batchcode,place,phone FROM students INNER JOIN batches ON batches.batchcode=students.batchcode WHERE place='CHENNAI' AND startdate BETWEEN '2012-01-01' AND '2012-12-31'; 

/*------------------------------------------------------------------------------------------------------------------------------------------*/

/*Query 15:
Write a query which will display the student id, student names who are enrolled for the course code 200?*/

SELECT studentid,studentname FROM students INNER JOIN batches ON batches.batchcode=students.batchcode WHERE coursecode=200;

/*------------------------------------------------------------------------------------------------------------------------------------------*/


