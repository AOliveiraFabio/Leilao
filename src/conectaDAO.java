
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        String url = "jdbc:mysql://localhost:3306/leilao_db";
        String user = "root";
        String password = "Convergente1";
        
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            java.util.Properties config = new java.util.Properties();
            config.setProperty("user", user);
            config.setProperty("password", password);
            config.setProperty("useSSL", "true");
            config.setProperty("verifyServerCertificate", "false");
            
            conn = DriverManager.getConnection(url,config);
            
            if(conn != null){
                System.out.println("Conexão bem-sucessida!");
            }
            
        } catch (ClassNotFoundException erro){
            System.out.println("Erro ao conectar ao banco de dados." + erro.getMessage());
        } catch(SQLException erro){
            System.out.println("Falha na Conexão." + erro.getMessage());
        }
        return conn;
    }
    
}
