import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;
        try {
            // VERIFIQUE SE O NOME DO BANCO DE DADOS 'ativ_1_uc11' ESTÁ EXATAMENTE IGUAL
            // E SE A SENHA '270908Av@' ESTÁ CORRETA PARA O SEU USUÁRIO 'root'
            String url = "jdbc:mysql://localhost:3306/uc11";
            String usuario = "root";
            String senha = "270908Av@"; // SUA SENHA REAL DO MYSQL LOCAL

            conn = DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
        }
        return conn;
    }
}