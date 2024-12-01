package Brecho;

import Uteis.*;

import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.io.IOException;


public class FrmLogin extends JFrame {
    
    private GeradorLogs log = new GeradorLogs();
    private String user;
    
    public FrmLogin() {
        super("BrecFlow  -->  Login ");
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        //Imagem de Icone
        ImageIcon icone = new ImageIcon("Src/Imagens/icone.png");
        this.setIconImage(icone.getImage());
        
        ImageIcon usuario = new ImageIcon("Src/Imagens/imagemUsuario.png");
        LBimagemUsuario.setIcon(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pusuario = new java.awt.Panel();
        LBimagemUsuario = new javax.swing.JLabel();
        LBusuario = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        LBsenha = new javax.swing.JLabel();
        PFsenha = new javax.swing.JPasswordField();
        BTentrar = new javax.swing.JButton();
        BTcadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FrmLogin"); // NOI18N
        setResizable(false);

        Pusuario.setName(""); // NOI18N
        Pusuario.setPreferredSize(new java.awt.Dimension(100, 100));
        Pusuario.setLayout(new javax.swing.BoxLayout(Pusuario, javax.swing.BoxLayout.LINE_AXIS));

        LBimagemUsuario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        LBimagemUsuario.setName("LBusuarioImagem"); // NOI18N
        Pusuario.add(LBimagemUsuario);

        LBusuario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        LBusuario.setLabelFor(TFusuario);
        LBusuario.setText("Usuário");

        TFusuario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        TFusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFusuario.setToolTipText("Digitar o usuário");
        TFusuario.setName("TFusuario"); // NOI18N
        TFusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFusuarioFocusLost(evt);
            }
        });

        LBsenha.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        LBsenha.setLabelFor(PFsenha);
        LBsenha.setText("Senha");

        PFsenha.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        PFsenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PFsenha.setToolTipText("Digitar a senha");
        PFsenha.setName("PFsenha"); // NOI18N
        PFsenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PFsenhaFocusLost(evt);
            }
        });

        BTentrar.setBackground(new java.awt.Color(51, 153, 0));
        BTentrar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        BTentrar.setForeground(new java.awt.Color(255, 255, 255));
        BTentrar.setText("Entrar");
        BTentrar.setToolTipText("Efetuar Login");
        BTentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTentrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTentrarActionPerformed(evt);
            }
        });

        BTcadastrar.setBackground(new java.awt.Color(87, 170, 240));
        BTcadastrar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        BTcadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BTcadastrar.setText("Cadastrar");
        BTcadastrar.setToolTipText("Cadastrar Usuario");
        BTcadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTcadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LBusuario)
                        .addComponent(LBsenha)
                        .addComponent(PFsenha)
                        .addComponent(BTentrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBsenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTentrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTcadastrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Pusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTentrarActionPerformed
        //BANCO DE DADOS AQUI + HASH----------------------------------
        String usuario = TFusuario.getText().trim();
        String senha = Criptografar.gerarHash(String.valueOf(PFsenha.getPassword()).trim());  //Hash de senha sha-256

        if(!TFusuario.getText().equals("") 
                && !String.valueOf(PFsenha.getPassword()).equals("") 
                && PFsenha.getPassword().length >= 8 
                && PFsenha.getPassword().length <= 16){
            ConexaoSQLite conexao = new ConexaoSQLite();  //Instanciar a conexao
            ResultSet rs;
            Statement stmt;
            conexao.Conectar();  //Conectar com o banco
            String sqlQuery = "SELECT USUARIO,SENHA FROM LOGIN WHERE USUARIO = '" + usuario + "';";  //String de consulta
            stmt = conexao.criarStatement();  //Preparar execução
            try{
                int encontrou = 0;
                rs = stmt.executeQuery(sqlQuery);
                while (rs.next()){
                    if(usuario.equals(rs.getString("USUARIO"))){
                        encontrou = 1;
                        if(senha.equals(rs.getString("SENHA"))){
                            user = usuario;
                            JOptionPane.showMessageDialog(null, "Bem Vindo, " + user);
                            FrmHome Home = new FrmHome(user);
                            Home.setVisible(true);
                            this.dispose();
                            try {
                                log.generateLog("Usuário " + user + " Conectado!");
                            } catch (IOException ex) {
                                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos! ");
                            limpar();
                        }
                    }
                }
                if(encontrou == 0){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado! ");
                    limpar();
                }
                rs.close();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            } finally{
                try{
                    stmt.close();
                    conexao.Desconectar();
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }    
        }
    }//GEN-LAST:event_BTentrarActionPerformed

    private void BTcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastrarActionPerformed
        String usuario = TFusuario.getText().trim();
        String senha = Criptografar.gerarHash(String.valueOf(PFsenha.getPassword()).trim());  //Hash de senha sha-256
        
        if(!TFusuario.getText().equals("") 
                && !PFsenha.getPassword().equals("")
                && PFsenha.getPassword().length >= 8 && PFsenha.getPassword().length <= 16){
            //Instanciar a conexao
            ConexaoSQLite conexao = new ConexaoSQLite();
            //Conectar com o banco
            conexao.Conectar();
            //String de consulta
            String sqlInsert = "INSERT INTO LOGIN (USUARIO,SENHA) VALUES (?,?);";
            //Preparar execução
            PreparedStatement stmt = conexao.criarPreparedStatement(sqlInsert);

            try{
                stmt.setString(1, usuario);
                stmt.setString(2, senha);
                int resultado = stmt.executeUpdate();
                if(resultado == 1){
                    try {
                        log.generateLog("Usuário " + usuario + " Criado!");
                    } catch (IOException ex) {
                        Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
                    limpar();
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao Cadastrar!");
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Falha ao Cadastrar! \nUsuário já existe?");
                limpar();
            }
            finally{
                if(stmt != null){
                    try{
                        stmt.close();
                    } catch (SQLException ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
                conexao.Desconectar();
            }
        }
    }//GEN-LAST:event_BTcadastrarActionPerformed

    private void TFusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFusuarioFocusLost
        // TODO add your handling code here:
        if(TFusuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Você deve preencher o campo usuario!");
            TFusuario.setText("");
            TFusuario.grabFocus();
        }
    }//GEN-LAST:event_TFusuarioFocusLost

    private void PFsenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PFsenhaFocusLost
        // TODO add your handling code here:
        if(!TFusuario.getText().equals("")){
            if(String.valueOf(PFsenha).equals("")){
                JOptionPane.showMessageDialog(null, "Você deve preencher o campo senha!");
                PFsenha.grabFocus();
            }
            if(PFsenha.getPassword().length < 8 || PFsenha.getPassword().length > 16){
                JOptionPane.showMessageDialog(null, "A senha deve conter entre 8 e 16 caracteres!");
                PFsenha.setText("");
                PFsenha.grabFocus();
            }
        }
    }//GEN-LAST:event_PFsenhaFocusLost
    
    private void limpar(){
        TFusuario.setText("");
        PFsenha.setText("");
        TFusuario.grabFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcadastrar;
    private javax.swing.JButton BTentrar;
    private javax.swing.JLabel LBimagemUsuario;
    private javax.swing.JLabel LBsenha;
    private javax.swing.JLabel LBusuario;
    private javax.swing.JPasswordField PFsenha;
    private java.awt.Panel Pusuario;
    private javax.swing.JTextField TFusuario;
    // End of variables declaration//GEN-END:variables
}
