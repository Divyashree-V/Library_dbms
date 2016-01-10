================
CSC540 Project: Library Management System
================

# Library_dbms
Library management system using Java Swing and Oracle
IDE: NetBeans
A detailed level Library Management application with the following featues:
1. Books issue and return
2. User management
3. Study and conference rooms booking
4. Camera checkout and return
5. Dues calculation and clearance
6. Account holds and release
7. Special priviledges for Faculty
8. Notification reminders for all of the above

Most of the implemenation has been done in Oracle procedures and triggers using PL/SQL.
The basic generic interface is a Java Swing application.

Team
1.	Nishtha Garg
2.	Shifali Jain
3.	Shivam Gulat
4.	Sudhanshi Jain

User instructions:
Please run the NCSULibrary.jar file from dist folder.
Login
Select the option button for Student/Faculty login.
By default, it will consider Student login.
Students should login with their STUDENTNO and Password.
Faculty should login with their FACULTYNO and Password.

User will be presented with Home page screen.
He can choose below options:

1. Profile - Update profile
2. Resources - Checkout books, journals,conference proceedings, camera, rooms.
Students can only book study rooms, not conference rooms.
If user is on hold, he will not be able to access this and will get an error message.
It is assumed that there are unlimited copies of conference proceedings and journals.
3. Checked out resources - User can see all the resouces he has checked out.
He also gets a button QUEUE on the screen to see all queued resources.

4. Resource requests - Complete history for user for all resources.
5. Notifications - User messages
6. Dues balance - Total pending dues for user and option to clear dues.
7. Logout - User logout. 

All constraints as required have been implemented in DBMS through procedures, triggers and cursors.
