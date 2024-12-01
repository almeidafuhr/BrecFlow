package Uteis;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoSQLite {
    private Connection Conexao;
    
    public boolean Conectar(){
        try{
            String Url = "jdbc:sqlite:Src/BancoDados/BrecFlow.db";
            this.Conexao = DriverManager.getConnection(Url);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    public boolean Desconectar(){
        try{
            if(this.Conexao.isClosed() == false){
                this.Conexao.close();
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try{
            return this.Conexao.prepareStatement(sql);
        }
        catch(SQLException ex){
            return null;
        }
    }
    
    public Connection getConexao(){
        return this.Conexao;
    }

    public Statement criarStatement() {
        try{
            return this.Conexao.createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
