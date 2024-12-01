package Brecho;

import Uteis.*;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import java.util.logging.*;
import java.time.LocalDate;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;


public class FrmSaida extends JFrame {
    final GeradorLogs log = new GeradorLogs();
    final String user;
    
    public FrmSaida(String user) {
        super("BrecFlow  -->  Saída de itens");
        initComponents();
        
        this.user = user;
        this.setLocationRelativeTo(null);
        //Imagem de Icone
        ImageIcon icone = new ImageIcon("Src/Imagens/icone.png");
        this.setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGpesquisa = new javax.swing.ButtonGroup();
        PcadastrarEntrada = new javax.swing.JPanel();
        SPdados = new javax.swing.JScrollPane();
        TBdados = new javax.swing.JTable();
        LBdata = new javax.swing.JLabel();
        RBid = new javax.swing.JRadioButton();
        RBreferencia = new javax.swing.JRadioButton();
        TFbusca = new javax.swing.JTextField();
        LBquantidade = new javax.swing.JLabel();
        FTFquantidade = new javax.swing.JFormattedTextField();
        LBvalor = new javax.swing.JLabel();
        FTFvalor = new javax.swing.JFormattedTextField();
        BTatualizar = new javax.swing.JButton();
        LBexibeRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("FrmEntrada"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PcadastrarEntrada.setMaximumSize(new java.awt.Dimension(640, 480));
        PcadastrarEntrada.setMinimumSize(new java.awt.Dimension(640, 480));
        PcadastrarEntrada.setName("PcadastrarEntrada"); // NOI18N
        PcadastrarEntrada.setPreferredSize(new java.awt.Dimension(640, 480));

        TBdados.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        TBdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "REFERENCIA", "ITEM", "GENERO", "TAMANHO", "QTD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBdados.setToolTipText("Dados que estão registradosno Banco de Dados");
        TBdados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TBdados.setFocusable(false);
        TBdados.setShowGrid(true);
        TBdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBdadosMouseClicked(evt);
            }
        });
        SPdados.setViewportView(TBdados);
        TBdados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        LBdata.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LBdata.setForeground(new java.awt.Color(0, 102, 204));
        LBdata.setText("Data");

        BGpesquisa.add(RBid);
        RBid.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        RBid.setText("Id");
        RBid.setFocusable(false);
        RBid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBidMouseClicked(evt);
            }
        });

        BGpesquisa.add(RBreferencia);
        RBreferencia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        RBreferencia.setText("Referência");
        RBreferencia.setFocusable(false);
        RBreferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBreferenciaMouseClicked(evt);
            }
        });

        TFbusca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TFbusca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFbusca.setToolTipText("Item a ser atualizado");
        TFbusca.setEnabled(false);
        TFbusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFbuscaFocusLost(evt);
            }
        });
        TFbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFbuscaKeyReleased(evt);
            }
        });

        LBquantidade.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LBquantidade.setText("Quantidade");

        FTFquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        FTFquantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FTFquantidade.setToolTipText("Quantidade a ser atualizada");
        FTFquantidade.setEnabled(false);
        FTFquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FTFquantidadeKeyReleased(evt);
            }
        });

        LBvalor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LBvalor.setText("Valor");

        FTFvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        FTFvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FTFvalor.setToolTipText("Valor unitario (Utilizar \".\")");
        FTFvalor.setEnabled(false);
        FTFvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FTFvalorKeyReleased(evt);
            }
        });

        BTatualizar.setText("Atualizar");
        BTatualizar.setEnabled(false);
        BTatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTatualizarActionPerformed(evt);
            }
        });

        LBexibeRegistros.setToolTipText("Quantidade de Registros no Banco");

        javax.swing.GroupLayout PcadastrarEntradaLayout = new javax.swing.GroupLayout(PcadastrarEntrada);
        PcadastrarEntrada.setLayout(PcadastrarEntradaLayout);
        PcadastrarEntradaLayout.setHorizontalGroup(
            PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcadastrarEntradaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PcadastrarEntradaLayout.createSequentialGroup()
                        .addComponent(LBexibeRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBdata)
                        .addGap(81, 81, 81))
                    .addGroup(PcadastrarEntradaLayout.createSequentialGroup()
                        .addGroup(PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SPdados, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PcadastrarEntradaLayout.createSequentialGroup()
                                .addComponent(RBid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBreferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LBquantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(LBvalor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(BTatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        PcadastrarEntradaLayout.setVerticalGroup(
            PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcadastrarEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBid)
                    .addComponent(RBreferencia)
                    .addComponent(TFbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBquantidade)
                    .addComponent(FTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBvalor)
                    .addComponent(FTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SPdados, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PcadastrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdata)
                    .addComponent(LBexibeRegistros))
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PcadastrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PcadastrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTatualizarActionPerformed
        //---- BANCO DE DADOS ----   
        int quantidade = Integer.parseInt(FTFquantidade.getText());  //Quantidade a ser atualizada
        int id = 0;
        String referencia = "";
        String sqlUpdate = null;
        
        if(RBid.isSelected()){
            sqlUpdate = "UPDATE ITEM SET Qtd_Item = Qtd_Item - ? WHERE ID_ITEM = ? AND Qtd_Item >= ?;";
            id = Integer.parseInt(TFbusca.getText());
        }
        if(RBreferencia.isSelected()){
            sqlUpdate = "UPDATE ITEM SET Qtd_Item = Qtd_Item - ? WHERE Referencia_Item = ? AND Qtd_Item >= ?;";
            referencia = TFbusca.getText();
            id = pesquisaIdPorReferencia(referencia);
        }
        //Instanciar a conexao
        ConexaoSQLite conexao = new ConexaoSQLite();
        //Conectar com o banco
        conexao.Conectar();
        //Preparar execução
        PreparedStatement stmt = conexao.criarPreparedStatement(sqlUpdate);
        try{
            //quantidade item 1º Parametro do update
            stmt.setInt(1,quantidade);
            //campo de busca 2º Parametro do update
            if(RBid.isSelected()){  //Se seleção por ID
                stmt.setInt(2,id);
            }
            if(RBreferencia.isSelected()){  //Se seleção por Referencia
                stmt.setString(2,referencia);
            }
            stmt.setInt(3, quantidade);
            int resultado = stmt.executeUpdate();  //Executa o Update
            if(resultado == 1){  //Se houve uma execução
                cadastrarSaida(conexao, id);  //Cadastra um registro na tabela Saida enviando a conexão e o id
                try {
                   log.generateLog("Usuário " + user + " Atualizou o item de id " + id + ", gerando saída de " + quantidade + " itens no estoque.");
                } catch (IOException ex) {
                    Logger.getLogger(FrmCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Cadastrar! \nQuantidade não é permitida ou registro não foi encontrado.");
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao Cadastrar!");
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
            this.dispose();
        }       
        
    }//GEN-LAST:event_BTatualizarActionPerformed

    private void RBidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBidMouseClicked
        TFbusca.setEnabled(true);
        TFbusca.grabFocus();
        desabilitarRadios();
    }//GEN-LAST:event_RBidMouseClicked

    private void RBreferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBreferenciaMouseClicked
        TFbusca.setEnabled(true);
        TFbusca.grabFocus();
        desabilitarRadios();
    }//GEN-LAST:event_RBreferenciaMouseClicked

    private void TFbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFbuscaKeyReleased
        if(TFbusca.getText().equals("")){
            FTFquantidade.setEnabled(false);
        }
        else{
            if(RBid.isSelected()){
                try{
                    if(Integer.parseInt(TFbusca.getText()) > 0){
                        FTFquantidade.setEnabled(true);
                    }
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido para um campo numérico!");
                    TFbusca.setEnabled(true);
                    TFbusca.setText("");
                    TFbusca.grabFocus();
                }
            }
            if(RBreferencia.isSelected()){
                FTFquantidade.setEnabled(true);
            }
        }
    }//GEN-LAST:event_TFbuscaKeyReleased

    private void FTFquantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FTFquantidadeKeyReleased
        if(FTFquantidade.getText().equals("")){
            FTFvalor.setEnabled(false);
        }
        else
        {
            try {
                if(Integer.parseInt(FTFquantidade.getText()) > 0){
                    FTFvalor.setEnabled(true);
                }
            } catch (NumberFormatException ex) {
                FTFquantidade.setText("");
                FTFquantidade.grabFocus();
                JOptionPane.showMessageDialog(null, "Valor inválido para um campo numérico!");
            }
        }
    }//GEN-LAST:event_FTFquantidadeKeyReleased

    private void FTFvalorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FTFvalorKeyReleased
        if(FTFvalor.getText().equals("")){
            BTatualizar.setEnabled(false);
        }
        else
        {
            try {
                if(Float.parseFloat(FTFvalor.getText()) > 0){
                    BTatualizar.setEnabled(true);
                }
            } catch (NumberFormatException e) {
                FTFvalor.setText("");
                FTFvalor.grabFocus();
                JOptionPane.showMessageDialog(null, "Valor inválido para um campo numérico!");
            }
        }
    }//GEN-LAST:event_FTFvalorKeyReleased

    private void TFbuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFbuscaFocusLost
        TFbusca.setText(TFbusca.getText().trim().toUpperCase());
        TFbusca.setEnabled(false);
    }//GEN-LAST:event_TFbuscaFocusLost

    private void TBdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBdadosMouseClicked
        // TODO add your handling code here:
        if(RBid.isSelected()){
            TFbusca.setText(TBdados.getModel().getValueAt(TBdados.getSelectedRow(), 0).toString());
        }
        
        if(RBreferencia.isSelected()){
            TFbusca.setText(TBdados.getModel().getValueAt(TBdados.getSelectedRow(), 1).toString());
        }
        
        if( !RBid.isSelected() && !RBreferencia.isSelected()){
            RBid.setSelected(true);
            TFbusca.setText(TBdados.getModel().getValueAt(TBdados.getSelectedRow(), 0).toString());
        }
        
        desabilitarRadios();
        TFbusca.setEnabled(false);
        FTFquantidade.setEnabled(true);
        FTFquantidade.grabFocus();
    }//GEN-LAST:event_TBdadosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        LBdata.setText(data.format(System.currentTimeMillis()));
        
        //Instanciar a conexao
        ConexaoSQLite conexao = new ConexaoSQLite();
        ResultSet rs;
        Statement stmt;

        //Conectar com o banco
        conexao.Conectar();
        //String de consulta
        String sqlQuery = "SELECT ID_ITEM, Referencia_Item, Descricao_Item, Genero_Item, Tamanho_Item, Qtd_Item FROM ITEM;";
        //Preparar execução
        stmt = conexao.criarStatement();
        try{
            DefaultTableModel modelo = (DefaultTableModel) TBdados.getModel();
            rs = stmt.executeQuery(sqlQuery);
            while (rs.next()){
                Object[] dados = {
                    rs.getInt("ID_ITEM"),
                    rs.getString("Referencia_Item"),
                    rs.getString("Descricao_Item"),
                    rs.getString("Genero_Item"),
                    rs.getString("Tamanho_Item"),
                    rs.getInt("Qtd_Item"),
                };
                modelo.addRow(dados);
            }
            LBexibeRegistros.setText("Quantidade de Registros: " + rs.getRow());
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
    }//GEN-LAST:event_formWindowOpened
    
    private void desabilitarRadios(){
        RBid.setEnabled(false);
        RBreferencia.setEnabled(false);
    }
    
    private int pesquisaIdPorReferencia(String referencia){
        int registros = TBdados.getRowCount();
        int id = 0;
        for(int i = 0; i < registros; i++){
            if(referencia.equals((String)TBdados.getValueAt(i, 1))){
                id = (int) TBdados.getValueAt(i, 0);
                break;
            }
        }
        return id;
    }
    
    private void cadastrarSaida(ConexaoSQLite conexao, int id_item){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //Formatação de Data  
        LocalDate data = LocalDate.now();  //Data atual
        int qtd_item = Integer.parseInt(FTFquantidade.getText());  //Quantidade de Itens
        float valor = Float.parseFloat(FTFvalor.getText());  //Valor unitário
        
        //String de consulta
        String sqlInsert = "INSERT INTO SAIDA (ID_ITEM,Data_Saida,Qtd_Saida,Valor_Saida) VALUES (?,?,?,?);";
        //Preparar execução
        PreparedStatement stmt = conexao.criarPreparedStatement(sqlInsert);
        
        try{
            stmt.setInt(1, id_item);
            stmt.setString(2, data.format(formato));
            stmt.setInt(3, qtd_item);
            stmt.setFloat(4, valor);
            int resultado = stmt.executeUpdate();
            if(resultado == 1){
                JOptionPane.showMessageDialog(null, "Saída gerada com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            if(stmt != null){
                try{
                    stmt.close();
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGpesquisa;
    private javax.swing.JButton BTatualizar;
    private javax.swing.JFormattedTextField FTFquantidade;
    private javax.swing.JFormattedTextField FTFvalor;
    private javax.swing.JLabel LBdata;
    private javax.swing.JLabel LBexibeRegistros;
    private javax.swing.JLabel LBquantidade;
    private javax.swing.JLabel LBvalor;
    private javax.swing.JPanel PcadastrarEntrada;
    private javax.swing.JRadioButton RBid;
    private javax.swing.JRadioButton RBreferencia;
    private javax.swing.JScrollPane SPdados;
    private javax.swing.JTable TBdados;
    private javax.swing.JTextField TFbusca;
    // End of variables declaration//GEN-END:variables
}
