package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT * FROM EMPLOYEE ORDER BY LASTNAME";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT * FROM EMPLOYEE WHERE LENGTH(LASTNAME)<6 ORDER BY LASTNAME";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT * FROM EMPLOYEE WHERE SALARY BETWEEN 2000 AND 3000";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT * FROM EMPLOYEE WHERE SALARY NOT BETWEEN 2001 and 2999";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 =
            "select EMPLOYEE.ID, FIRSTNAME, LASTNAME, MIDDLENAME, POSITION, MANAGER, HIREDATE, SALARY, DEPARTMENT, NAME " +
                    "from EMPLOYEE left join DEPARTMENT D on EMPLOYEE.DEPARTMENT = D.ID where DEPARTMENT is not null";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "select EMPLOYEE.ID, FIRSTNAME, LASTNAME, MIDDLENAME, POSITION, MANAGER, HIREDATE, SALARY, DEPARTMENT, NAME as depname " +
            "from EMPLOYEE left join DEPARTMENT depname on EMPLOYEE.DEPARTMENT = depname.ID";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT SUM(SALARY) AS total from EMPLOYEE";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 =
            "SELECT COUNT(EMPLOYEE.ID) as staff_size, DEPARTMENT.NAME as depname " + //why is department.name warning here??
                    "from DEPARTMENT join EMPLOYEE on DEPARTMENT.ID = EMPLOYEE.DEPARTMENT GROUP BY DEPARTMENT.NAME";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT e.LASTNAME as employee, m.LASTNAME as manager from EMPLOYEE e left join EMPLOYEE m on e.MANAGER = m.ID";
    //"Select e.lastname as employee, m.lastname as manager from employee e join employee m on m.manager=e.id";
}
