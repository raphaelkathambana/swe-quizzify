package util;

// import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import java.util.logging.Level;
import java.util.logging.Logger;

import quizzify.CreateQuiz;
import quizzify.ViewStudents;

public class Operation {

    static GetConnection connection = GetConnection.getInstance();
    Statement stat;
    ResultSet rs;
    PreparedStatement pStat;

    int theId;
    String strId, theName, theEmail, thePass;

    // Auth
    /* ****************************************** */
    public void SignUp(String Name, String Email, String Pass, String type) {

        String query = "";

        if ("Stud".equals(type)) {
            query = "INSERT INTO Student (`Name`, `Email`, `Password`) VALUES (?, ?, ?);";
        } else if ("Teach".equals(type)) {
            query = "INSERT INTO Teacher (`Name`, `Email`, `Password`) VALUES (?, ?, ?);";
        }

        try {
            pStat = connection.getConnection().prepareStatement(query);

            pStat.setString(1, Name);
            pStat.setString(2, Email);
            pStat.setString(3, Pass);
            pStat.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void SignIn(int ID, String Pass, String Type) {

        String query = "";

        if ("Stud".equals(Type)) {
            query = "SELECT * FROM Student WHERE Student_ID = " + ID + ";";
        } else if ("Teach".equals(Type)) {
            query = "SELECT * FROM Teacher WHERE Teacher_ID = " + ID + ";";
        }

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            rs.next();
            theId = rs.getInt(1);
            theName = rs.getString(2);
            theEmail = rs.getString(3);
            thePass = rs.getString(4);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    /* ****************************************** */

    // Cache
    /* ****************************************** */
    public void setCache(int ID, String type) {

        String query = "";

        if ("Stud".equals(type)) {
            query = "INSERT INTO StudentCache (`ID`) VALUES (?);";
        } else if ("Teach".equals(type)) {
            query = "INSERT INTO TeacherCache (`ID`) VALUES (?);";
        }

        try {
            pStat = connection.getConnection().prepareStatement(query);
            pStat.setInt(1, ID);
            pStat.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public int getCache(String type) {

        String query = "";

        if (type == "Stud") {
            query = "SELECT * FROM StudentCache;";
        } else if (type == "Teach") {
            query = "SELECT * FROM TeacherCache;";
        }

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);
            rs.next();
            theId = rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return theId;
    }

    public void delCache(String type) {

        String query = "";

        if ("Stud".equals(type)) {
            query = "DELETE FROM `StudentCache`;";
        } else if ("Teach".equals(type)) {
            query = "DELETE FROM `TeacherCache`;";
        }

        try {
            pStat = connection.getConnection().prepareStatement(query);
            pStat.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    /* ****************************************** */

    // Retrieval of User Details
    /* ****************************************** */
    public void Details(int ID, String Type) {

        String query = "";

        if ("Stud".equals(Type)) {
            query = "SELECT * FROM Student WHERE Student_ID = " + ID + ";";
        } else if ("Teach".equals(Type)) {
            query = "SELECT * FROM Teacher WHERE Teacher_ID = " + ID + ";";
        }

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            rs.next();
            theId = rs.getInt(1);
            theName = rs.getString(2);
            theEmail = rs.getString(3);
            thePass = rs.getString(4);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public String getStrId(String type) {

        int nowId = 0;
        String query = "";

        if ("Stud".equals(type)) {
            query = "SELECT Student_ID FROM Student WHERE Student_ID = (select max(Student_ID) from Student);";
        } else if ("Teach".equals(type)) {
            query = "SELECT Teacher_ID FROM Teacher WHERE Teacher_ID = (select max(Teacher_ID) from Teacher);";
        }

        try {
            stat = connection.getConnection().createStatement();
            rs = stat.executeQuery(query);
            while (rs.next())
                nowId = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error: Couldn't find number of user");
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

        return StrId;
    }

    public void getTableList(DefaultTableModel Model) {

        String query = "select * from `Student`";
        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {

                strId = String.valueOf(rs.getInt("Student_ID")) ;
                theName = rs.getString("Name");
                theEmail = rs.getString("Email");
                thePass = rs.getString("Password");

                String[] list = {strId, theName, theEmail, thePass};

                ViewStudents v = new ViewStudents();
                Model.addRow(list);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
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
    public int QuizIDNum(int subjID) {

        int quizID = 0;
        String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + subjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            quizID = rs.getInt(1);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return quizID;
    }

    public double getResult(int studID, String quizID, int subjID) {

        String query = "";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + subjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";

        int count = 0;
        double result = 0;

        int[] Quiz = quizIDAll(subjID);
        double[] Results = new double[num(cQuery)];

        try {
            do {
                query = "SELECT `Result` FROM `Result` WHERE `Student_ID` = " + studID + " and `Quiz_ID` = "
                        + Quiz[count] + ";";

                stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                rs = stat.executeQuery(query);
                rs.next();

                Results[count] = rs.getInt(1);
                result = result + Results[count];
                count++;

            } while (count != num(cQuery));

            if ("Average".equals(quizID))
                result = result / count;
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return result;
    }

    public double getResult(int StudID, String QuizID) {
        double result = 0;

        String query = "SELECT `Result` FROM `Result` WHERE `Student_ID` = " + StudID + " and `Quiz_ID` = " + QuizID
                + ";";
        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            rs.next();
            result = rs.getDouble(1);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return result;
    }

    public double getAllResult(int studID, String choose) {

        String query = "";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Teacher_ID` = " + getCache("Teach") + ";";

        int count = 0;
        double result = 0;

        int[] quiz = quizIDAll();
        double[] results = new double[num(cQuery)];

        try {
            do {
                query = "SELECT `Result` FROM `Result` WHERE `Student_ID` = " + studID + " and `Quiz_ID` = "
                        + quiz[count] + ";";

                stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                rs = stat.executeQuery(query);
                rs.next();

                results[count] = rs.getInt(1);
                result = result + results[count];
                count++;

            } while (count != num(cQuery));

            if ("Average".equals(choose))
                result = result / count;
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return result;
    }
    /* ****************************************** */

    // List Of Quiz
    /* ****************************************** */
    public int num(String cQuery) {

        int num = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(cQuery);
            rs.next();
            num = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return num;
    }

    public String[] quizIDList(int SubjID) {

        String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + SubjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + SubjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";

        String[] QuizIDs = new String[num(cQuery) + 2];
        int count = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {
                QuizIDs[count] = String.valueOf(rs.getInt(1));
                count++;
            }
            QuizIDs[count] = "Total";
            QuizIDs[count + 1] = "Average";

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return QuizIDs;
    }

    public int[] quizIDAll(int SubjID) {

        String query = "SELECT `Quiz_ID` from `Quiz` where `Subject_ID` = " + SubjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Subject_ID` = " + SubjID + " and `Teacher_ID` = "
                + getCache("Teach") + ";";

        int[] QuizIDs = new int[num(cQuery)];
        int count = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {
                QuizIDs[count] = rs.getInt(1);
                count++;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return QuizIDs;
    }

    public int[] quizIDEach() {

        String query = "SELECT `Quiz_ID` from `Quiz` WHERE `Complete` = 1 ORDER BY Quiz_ID ASC;";
        String cQuery = "SELECT COUNT(*) FROM `Quiz`WHERE `Complete` = 1 ;";

        int[] quizIDs = new int[num(cQuery)];
        int count = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {
                quizIDs[count] = rs.getInt(1);
                count++;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return quizIDs;
    }

    public int[] quizIDEach(int teach_ID) {

        String query = "SELECT `Quiz_ID` from `Quiz` WHERE Teacher_ID = " + getCache("Teach") + " ORDER BY Quiz_ID ASC;";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE Teacher_ID = " + getCache("Teach") + ";";

        int[] QuizIDs = new int[num(cQuery)];
        int count = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {
                QuizIDs[count] = rs.getInt(1);
                count++;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return QuizIDs;
    }

    public int[] quizIDAll() {

        String query = "SELECT `Quiz_ID` from `Quiz` where `Teacher_ID` = " + getCache("Teach") + ";";
        String cQuery = "SELECT COUNT(*) FROM `Quiz` WHERE `Teacher_ID` = " + getCache("Teach") + ";";

        int[] QuizIDs = new int[num(cQuery)];
        int count = 0;

        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);

            while (rs.next()) {
                QuizIDs[count] = rs.getInt(1);
                count++;
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return QuizIDs;
    }

    public String[] quizTeachDetail(int num) {

        String[] QuizDetail = new String[5];
        int NumQuiz = num("SELECT COUNT(*) FROM `Quiz` WHERE Teacher_ID = " + getCache("Teach")+ ";");

        if (NumQuiz <= num) {
            QuizDetail[0] = ""; // QuizID
            QuizDetail[1] = ""; // SubjectID
            QuizDetail[2] = ""; // TeacherID
            QuizDetail[3] = ""; // Title
            QuizDetail[4] = ""; // Complete
        } else {
            int[] quizCount = quizIDEach(getCache("Teach"));

            String query = "SELECT * from `Quiz` WHERE Quiz_ID = " + quizCount[num] + " AND Teacher_ID = " + getCache("Teach") + " ORDER BY Quiz_ID ASC;";

            try {
                stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                rs = stat.executeQuery(query);
                rs.next();

                int QuizID = rs.getInt(1);
                int SubjID = rs.getInt(2);
                int TeachID = rs.getInt(3);
                String Title = rs.getString(4);
                boolean Comp = rs.getBoolean(5);

                QuizDetail[0] = String.valueOf(QuizID); // QuizID
                QuizDetail[1] = getSubject(SubjID); // SubjectID
                QuizDetail[2] = getTeacher(TeachID); // TeacherID
                QuizDetail[3] = Title; // Title
                QuizDetail[4] = String.valueOf(Comp);

                System.out.println(QuizDetail[4]);
            } catch (SQLException e) {
                System.out.println("Error " + e.getMessage());
            }
        }

        return QuizDetail;
    }

    public String[] quizStudDetail(int num) {

        String[] QuizDetail = new String[4];
        int NumQuiz = num("SELECT COUNT(*) FROM `Quiz` WHERE `Complete` = 1;");

        if (NumQuiz <= num) {
            QuizDetail[0] = ""; // QuizID
            QuizDetail[1] = ""; // SubjectID
            QuizDetail[2] = ""; // TeacherID
            QuizDetail[3] = ""; // Title
        } else {
            int[] QuizCount = quizIDEach();

            String query = "SELECT * from `Quiz` WHERE `Complete` = 1 AND Quiz_ID = " + QuizCount[num] + " ORDER BY Quiz_ID ASC;";

            try {
                stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                rs = stat.executeQuery(query);
                rs.next();

                int quizID = rs.getInt(1);
                int subjID = rs.getInt(2);
                int teachID = rs.getInt(3);
                String title = rs.getString(4);

                QuizDetail[0] = String.valueOf(quizID); // QuizID
                QuizDetail[1] = getSubject(subjID); // SubjectID
                QuizDetail[2] = getTeacher(teachID); // TeacherID
                QuizDetail[3] = title; // Title
            } catch (SQLException e) {
                System.out.println("Error " + e.getMessage());
            }
        }

        return QuizDetail;
    }
    /* ****************************************** */

    public void saveQuestionToDatabase(Question question, int quizId) {
        // save question to database
        String sql = "INSERT INTO questions " +
                " VALUES ( " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "? );";

        try {
            pStat = connection.getConnection().prepareStatement(sql);
            pStat.setInt(1, quizId);
            pStat.setString(2, question.getPrompt());
            int param = 3;
            for (int i = 0; i < question.getNumOptions(); i++) {
                if (i == question.getCorrectAnswerIndex()) {
                    // save correct answer to database
                    pStat.setString(6, question.getOption(i));
                } else {
                    pStat.setString(param, question.getOption(i));
                    param++;
                }
            }
            pStat.executeUpdate();
            Logger.getLogger(Operation.class.getName()).info("Question Saved to database");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        // save options to database
        // save multimedia elements to database
    }

    public void saveQuizToDatabase(Quiz quiz, int teacherId) {
        try {
            stat = connection.getConnection().createStatement();
            // get subject id
            rs = stat.executeQuery("SELECT * FROM subject WHERE `Name` = '" + quiz.getSubject() + "';");
            rs.next();
            int subjectId = rs.getInt(1);
            // insert quiz into database
            stat.executeUpdate(
                    "INSERT INTO quiz (Title, Subject_ID, Teacher_ID) VALUES (" + quiz.getTitle() + "," + subjectId + ", " + teacherId + ");");
            Logger.getLogger(Quiz.class.getName()).info("Quiz saved to database");
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getQuizID() {
        int latestQuizID = 0;
        String query = "";
        query = "SELECT Quiz_ID FROM Quiz WHERE Quiz_ID = (select max(Quiz_ID) from Quiz);";

        try {
            stat = connection.getConnection().createStatement();
            rs = stat.executeQuery(query);
            while (rs.next())
                latestQuizID = rs.getInt(1);
            Logger.getLogger(Quiz.class.getName()).info("Quiz id returned");
        } catch (SQLException e) {
            System.out.println("Error: Couldn't find quiz ID" + e.getMessage());
        }
        return latestQuizID;
    }

    public String[] getSubjectsFromDatabase() {
        String[] subjects = new String[3];
        try {
            stat = connection.getConnection().createStatement();
            // get subjects from database
            // add subjects to SubjectMenu
            rs = stat.executeQuery("SELECT * FROM subject;");
            int index = 0;
            while (rs.next()) {
                subjects[index] = (rs.getString(2));
                index++;
            }
            Logger.getLogger(CreateQuiz.class.getName()).info("Subjects returned");
            Logger.getLogger(CreateQuiz.class.getName()).log(Level.INFO, "subjects, {}", subjects);
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuiz.class.getName()).log(Level.SEVERE, "error", ex);
        }
        return subjects;
    }

    public String getSubject(int subjID) {

        String query = "SELECT `Name` FROM `Subject` WHERE Subject_ID = " + subjID + ";";
        String subject = "";
        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);
            rs.next();
            subject = rs.getString(1);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return subject;
    }

    public String getTeacher(int teachID) {

        String query = "SELECT `Name` FROM `Teacher` WHERE teacher_ID = " + teachID + ";";
        String teacher = "";
        try {
            stat = connection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(query);
            rs.next();
            teacher = rs.getString(1);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return teacher;
    }
    /* ****************************************** */

}

// todo: operation that takes SubjID, StudID, QuizID and get result out of 10
// todo: operation that takes SubjID, StudID and get result for average total of
// a subject out of 10
// todo: operation that takes in SubjID and gives list of QuizID