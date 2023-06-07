import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demotest";
        String userName = "root";
        String password = "207661844Firas";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,userName,password);

            Statement statement = connection.createStatement();
            ArrayList<String> queryResults = new ArrayList<>();

            queryResults.add("##############################");
            queryResults.add("######### Question 1 #########");
            queryResults.add("##############################");
            ResultSet resultSet = statement.executeQuery("SELECT students.first_name,students.last_name,students.email FROM students WHERE date_of_birth BETWEEN '1994-01-01' AND '1994-12-31';");

            while (resultSet.next()){
                String result = resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3);
                queryResults.add(result);
            }

            queryResults.add("##############################");
            queryResults.add("######### Question 2 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT c.course_name, COUNT(sc.student_id) AS enrolled_students\n" +
                    "FROM studentcourse sc\n" +
                    "JOIN courses c ON c.course_id = sc.course_id\n" +
                    "GROUP BY c.course_name;");

            while (resultSet.next()){
                String result = resultSet.getString(1) + " " + resultSet.getInt(2);
                queryResults.add(result);
            }

            queryResults.add("##############################");
            queryResults.add("######### Question 3 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT s.first_name, s.last_name, c.course_name\n" +
                    "FROM students s\n" +
                    "JOIN studentcourse sc ON s.student_id = sc.student_id\n" +
                    "JOIN courses c ON c.course_id = sc.course_id\n" +
                    "WHERE c.course_name = 'Computer Science';");

            while (resultSet.next()){
                String result = resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3);
                queryResults.add(result);
            }

            queryResults.add("##############################");
            queryResults.add("######### Question 4 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT email FROM students WHERE first_name LIKE 'J%' AND last_name LIKE 'D%';");

            while (resultSet.next()){
                String result = resultSet.getString(1);
                queryResults.add(result);
            }

            queryResults.add("##############################");
            queryResults.add("######### Question 5 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT course_name, instructor_name FROM courses WHERE instructor_name = 'Professor Brown';");

            while (resultSet.next()){
                String result = resultSet.getString(1) + " " + resultSet.getString(2);
                queryResults.add(result);
            }

            queryResults.add("##############################");
            queryResults.add("######### Question 6 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT s.student_id, s.first_name, s.last_name\n" +
                    "FROM students s\n" +
                    "JOIN studentcourse sc1 ON s.student_id = sc1.student_id\n" +
                    "JOIN courses c1 ON c1.course_id = sc1.course_id\n" +
                    "JOIN studentcourse sc2 ON s.student_id = sc2.student_id\n" +
                    "JOIN courses c2 ON c2.course_id = sc2.course_id\n" +
                    "WHERE c1.course_name = 'Mathematics'\n" +
                    "  AND c2.course_name = 'History';");

            ArrayList<String> resultToFile = new ArrayList<>();
            while (resultSet.next()){
                String result = resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3);
                queryResults.add(result);
                resultToFile.add(result);
            }
            Reporter.writeFile(resultToFile,"QueryOutputData.txt");

            queryResults.add("##############################");
            queryResults.add("######### Question 7 #########");
            queryResults.add("##############################");
            resultSet = statement.executeQuery("SELECT student_id, first_name, last_name FROM students WHERE student_id NOT IN (SELECT student_id FROM studentcourse);");

            while (resultSet.next()){
                String result = resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3);
                queryResults.add(result);
            }

            for (String result: queryResults) {
                System.out.println(result);
            }

            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}