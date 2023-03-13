package TrainingClassesPractice.DataBaseConnectivity;

import java.sql.*;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = scn.nextInt();
        System.out.println("Enter the name: ");
        String name = scn.next();
        System.out.println("Enter the age: ");
        int age = scn.nextInt();

        try {
            Class.forName("");
            Connection con = DriverManager.getConnection("", "", "");
            Statement st = con.createStatement();
            String str = "insert into student(id, name, age) values(" + id + ", '" + name + ",'" + age + ")";
            st.executeUpdate(str);
        } catch (Exception e) {

        }
    }
}
