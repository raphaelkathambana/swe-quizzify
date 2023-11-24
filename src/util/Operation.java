package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operation {

    GetConnection connection = GetConnection.getInstance();
    int theId;
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

    // Retrival of User Details
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

// Results 
/* ****************************************** */
    public int QuizIDNum(int SubjID) {
    Statement Stat;
    ResultSet rs;

    String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";

    int QuizID = 0;        
    try {
        Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        rs = Stat.executeQuery(query);

        QuizID = rs.getInt(1);

    } catch (SQLException e) {
        System.out.println("Error " + e.getMessage());
    }
    
    return QuizID;
}    

    public double getResult(int StudID, String QuizID, int SubjID) {
        double result = 0;

        Statement Stat;
        ResultSet rs;

        String query = "";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";
        
        int[] Quiz = QuizIDAll(SubjID);
        double[] Results = new double[num(cQuery)];

        int count = 0;
           
        
        try {
            do {
                    query = "SELECT `Result` FROM `Result` WHERE `Student_ID` = " + StudID + " and `Quiz_ID` = " + Quiz[count] + ";";

                    Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
                    rs = Stat.executeQuery(query);
                    rs.next();

                    Results[count] = rs.getInt(1);

                    System.out.println(Results[count]);
                    result = result + Results[count];
                    count++;
            
                } while (count != num(cQuery));

                if (QuizID == "Average")
                    result = result/count;
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }            
        
        return result;
    }

    public double getResult(int StudID, String QuizID) {
        double result = 0;

        Statement Stat;
        ResultSet rs;
        String query = "";

            query = "SELECT `Result` FROM `Result` WHERE `Student_ID` = " + StudID + " and `Quiz_ID` = " + QuizID + ";";
            try {
                Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                rs = Stat.executeQuery(query);

                rs.next();
                result = rs.getDouble(1);
            } catch (SQLException e) {
                System.out.println("Error " + e.getMessage());
            }
        
        return result;
    }
/* ****************************************** */

// List Of QuizID
/* ****************************************** */
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

        String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";

        String[] QuizIDs = new String[num(cQuery) + 2];
        int count = 0;
        
        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            while (rs.next() == true){
                    QuizIDs[count] = String.valueOf(rs.getInt(1));
                    count++;
            }
            QuizIDs[count] = "Total";
            QuizIDs[count + 1] = "Average";
            System.out.println("Inserting Works");

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        
        return QuizIDs;
    }

    public int[] QuizIDAll(int SubjID) {
        Statement Stat;
        ResultSet rs;

        String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + SubjID + " and `Teacher_ID` = " + getCache("Teach") + ";";

        int[] QuizIDs = new int[num(cQuery)];
        int count = 0;
        
        try {
            Stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = Stat.executeQuery(query);

            while (rs.next() == true){
                    QuizIDs[count] = rs.getInt(1);
                    count++;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        
        return QuizIDs;
    }
    /* ****************************************** */

}

// todo: operation that takes SubjID, StudID, QuizID and get result out of 10
// todo: operation that takes SubjID, StudID and get result for average total of a subject out of 10
// todo: operation that takes in SubjID and gives list of QuizID