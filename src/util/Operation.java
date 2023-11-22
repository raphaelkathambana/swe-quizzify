package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ComboBoxModel;

public class Operation {

    GetConnection connection = GetConnection.getInstance();
    int theId, result;
    String theName, theEmail, thePass;

    // Auth
/* ****************************************** */
    public void SignUp(String Name, String Email, String Pass, String Type) {

        String query = "";

        if (Type == "Stud") {
            query = "INSERT INTO Student (`Name`, `Email`, `Password`) VALUES (?, ?, ?);";
        } else if (Type == "Teach") {
            query = "INSERT INTO Teacher (`Name`, `Email`, `Password`) VALUES (?, ?, ?);";
        }

        PreparedStatement pStat;

        try {

            pStat = connection.getConnection().prepareStatement(query);

            pStat.setString(1, Name);
            pStat.setString(2, Email);
            pStat.setString(3, Pass);
            pStat.executeUpdate();

            System.out.println("Inserting Works");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
  
    public void SignIn(int ID, String Pass, String Type) {

        Statement Stat;
        ResultSet rs;
        String query = "";

        if (Type == "Stud") {
            query = "SELECT * FROM Student WHERE Student_ID = " + ID + ";";
        } else if (Type == "Teach") {
            query = "SELECT * FROM Teacher WHERE Teacher_ID = " + ID + ";";
        }

        System.out.println(query);

        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            rs.next();
            theId = rs.getInt(1);
            theName = rs.getString(2);
            theEmail = rs.getString(3);
            thePass = rs.getString(4);
            // theId = Integer.toString(intId);

            System.out.println("Inserting Works");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
/* ****************************************** */

    // Cache
/* ****************************************** */
    public void setCache(int ID, String Type) {

        String query = "";

        if (Type == "Stud") {
            query = "INSERT INTO StudentCache (`ID`) VALUES (?);";
        } else if (Type == "Teach") {
            query = "INSERT INTO TeacherCache (`ID`) VALUES (?);";
        }

        PreparedStatement pStat;

        try {
            pStat = connection.getConnection().prepareStatement(query);
            pStat.setInt(1, ID);
            pStat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public int getCache(String Type) {
        Statement Stat;
        ResultSet rs;
        String query = "";

        if (Type == "Stud") {
            query = "SELECT * FROM StudentCache;";
        } else if (Type == "Teach") {
            query = "SELECT * FROM TeacherCache;";
        }

        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);
            rs.next();
            theId = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return theId;
    }

    public void delCache(String Type) {

        String query = "";

        if (Type == "Stud") {
            query = "DELETE FROM `StudentCache`;";
        } else if (Type == "Teach") {
            query = "DELETE FROM `TeacherCache`;";
        }

        PreparedStatement pStat;

        try {
            pStat = connection.getConnection().prepareStatement(query);
            pStat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
/* ****************************************** */

    // Retrival of User
/* ****************************************** */
    public void Details(int ID, String Type) {

        Statement Stat;
        ResultSet rs;
        String query = "";

        if (Type == "Stud") {
            query = "SELECT * FROM Student WHERE Student_ID = " + ID + ";";
        } else if (Type == "Teach") {
            query = "SELECT * FROM Teacher WHERE Teacher_ID = " + ID + ";";
        }

        System.out.println(query);

        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            rs.next();
            theId = rs.getInt(1);
            theName = rs.getString(2);
            theEmail = rs.getString(3);
            thePass = rs.getString(4);
            // theId = Integer.toString(intId);

            System.out.println("Inserting Works");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public String getStrId(String Type) {

        Statement Stat;
        ResultSet rs;

        int nowId = 0;
        String query = "";
        // String query = "select CID from login.clients where CID =(select max(CID)
        // from clients)";
        if (Type == "Stud") {
            query = "SELECT Student_ID FROM Student WHERE Student_ID = (select max(Student_ID) from Student);";
        } else if (Type == "Teach") {
            query = "SELECT Teacher_ID FROM Teacher WHERE Teacher_ID = (select max(Teacher_ID) from Teacher);";
        }

        try {
            Stat = connection.getConnection().createStatement();
            rs = Stat.executeQuery(query);
            while (rs.next())
                nowId = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Couldn't find number of user");
        }

        String StrId = "";
        int digits = Integer.toString(nowId).trim().length();

        if (digits == 1)
            StrId = "000" + nowId;
        if (digits == 2)
            StrId = "00" + nowId;
        if (digits == 3)
            StrId = "0" + nowId;
        if (digits == 4)
            StrId = "" + nowId;

        System.out.println(StrId);

        return StrId;
    }
/* ****************************************** */

    // Getters
/* ****************************************** */
    public int getId() {
        return theId;
    }

    public String getName() {
        return theName;
    }

    public String getEmail() {
        return theEmail;
    }

    public String getPass() {
        return thePass;
    }
/* ****************************************** */


    public int getResult(int StudID, int QuizID, int SubjID) {

        Statement Stat;
        ResultSet rs;
        String query = "";

        query = "SELECT `Results` FROM `Result` WHERE `Student_ID` = " + StudID + " and `Quiz_ID` = " + QuizID + " and `subject_ID` = " + SubjID + ";";

        System.out.println(query);

        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            rs.next();
            result = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return result;
    }

    public int num(String cQuery){
        int num = 0;
        Statement Stat;
        ResultSet rs;

        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(cQuery);
            rs.next();
            num = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return num;
    }

    public String[] QuizIDList(int SubjID) {
        Statement Stat;
        ResultSet rs;
        String query = "";
        String cQuery = "";

        if (SubjID == 1){
            query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = 1;";
            cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = 1;";
        } else if (SubjID == 2){
            query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = 2;";
            cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = 2;";
        } else if (SubjID == 3){
            query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = 3;";
            cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = 3;";
        }

        String[] QuizIDs = new String[num(cQuery)];
        int count = 0;
        
        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            while (rs.next() == true){
                    QuizIDs[count] = Integer.toString(rs.getInt(1));
                    count++;
            }
            System.out.println("Inserting Works");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        
        return QuizIDs;
    }
    // TODO: operation that takes in SubjID, StudID and gives QuizID
    // TODO: operation that takes SubjID and get result for average total of a subject,
}
