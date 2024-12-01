package Brecho;

import Uteis.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import com.itextpdf.text.*;
import java.util.logging.*;
import com.itextpdf.text.pdf.*;
import java.time.LocalDate;
import java.awt.Desktop;
import java.time.format.DateTimeFormatter;

public class FrmHome extends JFrame {
    final GeradorLogs log = new GeradorLogs();
    final String user;
    final String mensagem = "Funcionalidade Futura!";
    
    public FrmHome(String user) {
        super("BrecFlow  -->  Home ");
        initComponents();
        
        this.user = user;
        this.setLocationRelativeTo(null);
        
        //Imagem de Icone
        ImageIcon icone = new ImageIcon("Src/Imagens/icone.png");
        this.setIconImage(icone.getImage());
        
        //Imagem de fundo
        ImageIcon fundo = new ImageIcon("Src/Imagens/logotipo.png");
        JLabel lFundo = new JLabel(fundo);
        this.add(lFundo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MB = new javax.swing.JMenuBar();
        Mcadastro = new javax.swing.JMenu();
        Mentrada = new javax.swing.JMenu();
        Msaida = new javax.swing.JMenu();
        Mestoque = new javax.swing.JMenu();
        Mcusto = new javax.swing.JMenu();
        MIcfixo = new javax.swing.JMenuItem();
        MIcflex = new javax.swing.JMenuItem();
        Mrelatório = new javax.swing.JMenu();
        MIdiario = new javax.swing.JMenuItem();
        MIanual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("FrmHome"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Mcadastro.setText("Cadastro");
        Mcadastro.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Mcadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                McadastroMouseClicked(evt);
            }
        });
        MB.add(Mcadastro);

        Mentrada.setText("Entrada");
        Mentrada.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Mentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MentradaMouseClicked(evt);
            }
        });
        MB.add(Mentrada);

        Msaida.setText("Saida");
        Msaida.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Msaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MsaidaMouseClicked(evt);
            }
        });
        MB.add(Msaida);

        Mestoque.setText("Estoque");
        Mestoque.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Mestoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MestoqueMouseClicked(evt);
            }
        });
        MB.add(Mestoque);

        Mcusto.setText("Custo");
        Mcusto.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        MIcfixo.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        MIcfixo.setText("Fixo");
        MIcfixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIcfixoActionPerformed(evt);
            }
        });
        Mcusto.add(MIcfixo);

        MIcflex.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        MIcflex.setText("Flexível");
        MIcflex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIcflexActionPerformed(evt);
            }
        });
        Mcusto.add(MIcflex);

        MB.add(Mcusto);

        Mrelatório.setText("Relatório");
        Mrelatório.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        MIdiario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        MIdiario.setText("Diário");
        MIdiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIdiarioActionPerformed(evt);
            }
        });
        Mrelatório.add(MIdiario);

        MIanual.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        MIanual.setText("Período");
        MIanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIanualActionPerformed(evt);
            }
        });
        Mrelatório.add(MIanual);

        MB.add(Mrelatório);

        setJMenuBar(MB);
    }// </editor-fold>//GEN-END:initComponents

    private void MentradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MentradaMouseClicked
        // TODO add your handling code here:
        FrmEntrada entrada = new FrmEntrada(user);
        entrada.setVisible(true);
    }//GEN-LAST:event_MentradaMouseClicked

    private void MIcfixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIcfixoActionPerformed
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_MIcfixoActionPerformed

    private void MIcflexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIcflexActionPerformed
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_MIcflexActionPerformed

    private void MestoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MestoqueMouseClicked
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_MestoqueMouseClicked

    private void McadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_McadastroMouseClicked
        FrmCadastroItem cadastroItem = new FrmCadastroItem(user);
        cadastroItem.setVisible(true);
    }//GEN-LAST:event_McadastroMouseClicked

    private void MsaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MsaidaMouseClicked
        FrmSaida saida = new FrmSaida(user);
        saida.setVisible(true);
    }//GEN-LAST:event_MsaidaMouseClicked

    private void MIdiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIdiarioActionPerformed
        // GERAR ReLATÓRIO DIÁRIO
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
        LocalDate data = LocalDate.now();
        gerarRelatorioDiario(data.format(formato));
    }//GEN-LAST:event_MIdiarioActionPerformed

    private void MIanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIanualActionPerformed
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_MIanualActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            log.generateLog("Usuário " + user + " Desconectado!");
        } catch (IOException ex) {
            Logger.getLogger(FrmHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void gerarRelatorioDiario(String data){
        Document relatorioDiario = new Document();
        String path = "src\\Relatorios\\RelatorioDiario" + data.replace("/", "_") + ".pdf";
        String sqlQueryEntrada = "SELECT ITEM.Referencia_Item, ITEM.Descricao_Item, ENTRADA.Qtd_Entrada, ENTRADA.Valor_Entrada "
                + "FROM ITEM INNER JOIN ENTRADA ON ITEM.ID_ITEM = ENTRADA.ID_ITEM "
                + "WHERE Data_Entrada = '" + data + "';";
        
        String sqlQuerySaida = "SELECT ITEM.Referencia_Item, ITEM.Descricao_Item, SAIDA.Qtd_Saida, SAIDA.Valor_Saida "
                + "FROM ITEM INNER JOIN SAIDA ON ITEM.ID_ITEM = SAIDA.ID_ITEM "
                + "WHERE Data_Saida = '" + data + "';";
        
        //Gerar Documento PDF
        try{
            PdfWriter.getInstance(relatorioDiario, new FileOutputStream(path));
            relatorioDiario.open();
            
            relatorioDiario.add(new Paragraph(new Phrase(20F, "Entradas geradas no dia " + data, 
                    FontFactory.getFont(FontFactory.COURIER_BOLD,16F, BaseColor.GREEN))));
            
            //Chamar função para buscar dados de entrada no banco e escrever no relatorio
            buscarDadosEntrada(relatorioDiario, sqlQueryEntrada);
            
            relatorioDiario.newPage();

            relatorioDiario.add(new Paragraph(new Phrase(20F, "Saídas geradas no dia " + data, 
                    FontFactory.getFont(FontFactory.COURIER_BOLD,16F, BaseColor.GREEN))));
            
            //Chamar função para buscar dados de saída do banco
            buscarDadosSaida(relatorioDiario, sqlQuerySaida);
            
            try {
                log.generateLog("Usuário " + user + " gerou um relatório!");
            } catch (IOException ex) {
                Logger.getLogger(FrmHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally{
            relatorioDiario.close();
        }
        //Abrir documento PDF no leitor padrão
        try{
            Desktop.getDesktop().open(new File(path));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void buscarDadosEntrada(Document relatorio, String sqlQuery){
        //Instanciar a conexao
        ConexaoSQLite conexao = new ConexaoSQLite();
        ResultSet rs;
        java.sql.Statement stmt;

        //Conectar com o banco
        conexao.Conectar();
        //String de consulta
        
        //Preparar execução
        stmt = conexao.criarStatement();
        try{
            rs = stmt.executeQuery(sqlQuery);
            while (rs.next()){
                if(rs.getRow() % 9 == 0){  //8 Registros por página
                    relatorio.newPage();
                }
                
                relatorio.add(new Paragraph(new Phrase(15F, "-------------------------------------------------------------", 
                        FontFactory.getFont(FontFactory.COURIER,12F,BaseColor.DARK_GRAY))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "Registro " + rs.getRow(), 
                        FontFactory.getFont(FontFactory.COURIER,12F, BaseColor.GRAY))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "REFERÊNCIA: " + rs.getString("Referencia_Item"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "ITEM: " + rs.getString("Descricao_Item"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "QUANTIDADE: " + rs.getString("Qtd_Entrada"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "VALOR: R$ " + rs.getString("Valor_Entrada"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
            }
            relatorio.add(new Paragraph(new Phrase("Registros Gerados: " + rs.getRow(), 
                    FontFactory.getFont(FontFactory.COURIER,13F, BaseColor.RED))));
            rs.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao Consultar! " + ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FrmHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                stmt.close();
                conexao.Desconectar();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    private void buscarDadosSaida(Document relatorio, String sqlQuery){
        //Instanciar a conexao
        ConexaoSQLite conexao = new ConexaoSQLite();
        ResultSet rs;
        Statement stmt;

        //Conectar com o banco
        conexao.Conectar();
        //String de consulta

        //Preparar execução
        stmt = conexao.criarStatement();
        try{
            rs = stmt.executeQuery(sqlQuery);
            while (rs.next()){
                
                if(rs.getRow() % 9 == 0){  //8 Registros por página
                    relatorio.newPage();
                }
                
                relatorio.add(new Paragraph(new Phrase(9F, "------------------------------------------------------", 
                        FontFactory.getFont(FontFactory.COURIER,12F, BaseColor.DARK_GRAY))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "Registro " + rs.getRow(), 
                        FontFactory.getFont(FontFactory.COURIER,12F, BaseColor.GRAY))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "REFERÊNCIA: " + rs.getString("Referencia_Item"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "ITEM: " + rs.getString("Descricao_Item"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "QUANTIDADE" + rs.getString("Qtd_Saida"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
                
                relatorio.add(new Paragraph(new Phrase(15F, "VALOR: R$ " + rs.getString("Valor_Saida"), 
                        FontFactory.getFont(FontFactory.COURIER,11F))));
            }
            relatorio.add(new Paragraph(new Phrase("Registros Gerados: " + rs.getRow(), 
                    FontFactory.getFont(FontFactory.COURIER,13F, BaseColor.RED))));
            rs.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao Consultar! " + ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FrmHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                stmt.close();
                conexao.Desconectar();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MB;
    private javax.swing.JMenuItem MIanual;
    private javax.swing.JMenuItem MIcfixo;
    private javax.swing.JMenuItem MIcflex;
    private javax.swing.JMenuItem MIdiario;
    private javax.swing.JMenu Mcadastro;
    private javax.swing.JMenu Mcusto;
    private javax.swing.JMenu Mentrada;
    private javax.swing.JMenu Mestoque;
    private javax.swing.JMenu Mrelatório;
    private javax.swing.JMenu Msaida;
    // End of variables declaration//GEN-END:variables
}
