package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection obterConexao(){
        Connection conn=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DZA","root","");
            //JOptionPane.showMessageDialog(null,"Sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERRO NA CONEXAO");
        }
        return conn;
    }
}
