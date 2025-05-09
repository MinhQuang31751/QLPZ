
package QuanLyPizza.DAO;

import MyCustom.MyDialog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnect {

    public static Connection conn = null;
    private String serverName;
    private String dbName;
    private String userName;
    private String password;

    public MyConnect() {
        docFileText();

        String strConnect = "jdbc:sqlserver://" + serverName + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            // Load SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish connection
            conn = DriverManager.getConnection(strConnect, pro);
        } catch (ClassNotFoundException ex) {
            new MyDialog("Không tìm thấy driver SQL Server!", MyDialog.ERROR_DIALOG);
            System.exit(0);
        } catch (SQLException ex) {
            new MyDialog("Không kết nối được tới CSDL!", MyDialog.ERROR_DIALOG);
            System.exit(0);
        }
    }

    private void docFileText() {
        // Xử lý đọc file để lấy ra 4 tham số
        serverName = "";
        dbName = "";
        userName = "";
        password = "";

        try {
            FileInputStream fis = new FileInputStream("ConnectVariable.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            serverName = br.readLine();
            dbName = br.readLine();
            userName = br.readLine();
            password = br.readLine();

            if (password == null) {
                password = "";
            }

        } catch (Exception e) {
            new MyDialog("Lỗi khi đọc file cấu hình!", MyDialog.ERROR_DIALOG);
        }
    }
}

