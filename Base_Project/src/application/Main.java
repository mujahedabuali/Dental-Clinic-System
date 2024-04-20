package application;
	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class Main extends Application {
	
	Button doctor,dentist,enter,restore;	 // sharable buttons
	
	static Connection connect;
	static Statement statement;
	static PreparedStatement pstatement;
	static ResultSet res;	
	ImageView back;
	String dbURL ;
	String db_user_name = "root";
	String db_pass_word = "MmM002003@";
	String url= "127.0.0.1";
	String port ="3306";
	String dbName="clinicProject";
		
	public void connectDB() throws ClassNotFoundException { // Connect the dataBase with javaFX
		try {
			
			dbURL="jdbc:mysql://"+url+":"+port+"/"+dbName+"?verifyServerCertificate=false";
			
			Properties p = new Properties();
			p.setProperty("user", db_user_name);
			p.setProperty("password", db_pass_word);
			p.setProperty("userSSL", "false");
			p.setProperty("autoReconnect", "true");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connect = DriverManager.getConnection(dbURL,p);
			System.out.println("Connect with DataBase");
			
		} catch (SQLException e) {
			e.getMessage();
			System.out.println("Failed Connection");
		}	
	}	
	@Override
	public void start(Stage primaryStage) {
		try {
			new FirstStage();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
