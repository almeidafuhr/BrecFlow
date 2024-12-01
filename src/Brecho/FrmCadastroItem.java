package Brecho;

import Uteis.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class FrmCadastroItem extends JFrame {
    final GeradorLogs log = new GeradorLogs();
    final String user;
    
    public FrmCadastroItem(String user) {
        super("BrecFlow  -->  Cadastro de Novos Itens");
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

        PadicionarItens = new javax.swing.JPanel();
        LBexibeRegistros = new javax.swing.JLabel();
        LBexibeitem = new javax.swing.JLabel();
        LBexibeReferencia = new javax.swing.JLabel();
        LbReferencia = new javax.swing.JLabel();
        TFreferencia = new javax.swing.JTextField();
        LBitem = new javax.swing.JLabel();
        TFitem = new javax.swing.JTextField();
        LBcodigo = new javax.swing.JLabel();
        TFcodigo = new javax.swing.JTextField();
        CBXgenero = new javax.swing.JComboBox<>();
        CBXtamanho = new javax.swing.JComboBox<>();
        LBquantidade = new javax.swing.JLabel();
        FTFquantidade = new javax.swing.JFormattedTextField();
        BTsalvar = new javax.swing.JButton();
        BTlimpar = new javax.swing.JButton();
        SPdados = new javax.swing.JScrollPane();
        TBdados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("FrmCadI"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PadicionarItens.setMaximumSize(new java.awt.Dimension(640, 480));
        PadicionarItens.setMinimumSize(new java.awt.Dimension(640, 480));
        PadicionarItens.setPreferredSize(new java.awt.Dimension(640, 480));

        LBexibeRegistros.setToolTipText("Quantidade de Registros no Banco");

        LBexibeitem.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        LBexibeitem.setForeground(new java.awt.Color(0, 102, 204));

        LBexibeReferencia.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        LBexibeReferencia.setForeground(new java.awt.Color(255, 0, 51));

        LbReferencia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LbReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbReferencia.setLabelFor(TFreferencia);
        LbReferencia.setText("REF");
        LbReferencia.setName("LbReferencia"); // NOI18N

        TFreferencia.setBackground(new java.awt.Color(204, 204, 255));
        TFreferencia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TFreferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFreferencia.setToolTipText("Referencia gerada para o item");
        TFreferencia.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        TFreferencia.setEnabled(false);
        TFreferencia.setFocusable(false);

        LBitem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LBitem.setLabelFor(TFitem);
        LBitem.setText("ITEM");

        TFitem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TFitem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFitem.setToolTipText("Descrição do item");
        TFitem.setNextFocusableComponent(TFcodigo);
        TFitem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFitemFocusLost(evt);
            }
        });
        TFitem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFitemKeyReleased(evt);
            }
        });

        LBcodigo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LBcodigo.setLabelFor(TFcodigo);
        LBcodigo.setText("COD");

        TFcodigo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TFcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFcodigo.setToolTipText("Até 3 Caracteres");
        TFcodigo.setEnabled(false);
        TFcodigo.setNextFocusableComponent(CBXgenero);
        TFcodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFcodigoFocusLost(evt);
            }
        });
        TFcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFcodigoKeyReleased(evt);
            }
        });

        CBXgenero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        CBXgenero.setMaximumRowCount(6);
        CBXgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gênero", "M", "F", "IM", "IF", "US" }));
        CBXgenero.setToolTipText("Gênero do item");
        CBXgenero.setEnabled(false);
        CBXgenero.setNextFocusableComponent(CBXtamanho);
        CBXgenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBXgeneroItemStateChanged(evt);
            }
        });
        CBXgenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CBXgeneroFocusLost(evt);
            }
        });

        CBXtamanho.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        CBXtamanho.setMaximumRowCount(7);
        CBXtamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "PP", "P", "M", "G", "GG", "XG", "PD" }));
        CBXtamanho.setToolTipText("Tamanho do item");
        CBXtamanho.setEnabled(false);
        CBXtamanho.setNextFocusableComponent(FTFquantidade);
        CBXtamanho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBXtamanhoItemStateChanged(evt);
            }
        });
        CBXtamanho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CBXtamanhoFocusLost(evt);
            }
        });

        LBquantidade.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LBquantidade.setLabelFor(FTFquantidade);
        LBquantidade.setText("QTD");

        FTFquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        FTFquantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FTFquantidade.setToolTipText("Quantidade Inicial");
        FTFquantidade.setEnabled(false);
        FTFquantidade.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        FTFquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FTFquantidadeKeyReleased(evt);
            }
        });

        BTsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        BTsalvar.setToolTipText("Salvar dados");
        BTsalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTsalvar.setEnabled(false);
        BTsalvar.setNextFocusableComponent(BTlimpar);
        BTsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsalvarActionPerformed(evt);
            }
        });

        BTlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clean.png"))); // NOI18N
        BTlimpar.setToolTipText("Limpar dados");
        BTlimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimparActionPerformed(evt);
            }
        });

        SPdados.setToolTipText("");

        TBdados.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        TBdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "REFERENCIA", "ITEM", "GÊNERO", "TAMANHO", "QTD"
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
        TBdados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBdados.setFocusable(false);
        TBdados.setMaximumSize(new java.awt.Dimension(620, 300));
        TBdados.setMinimumSize(new java.awt.Dimension(620, 300));
        TBdados.setName("TBdados"); // NOI18N
        TBdados.setShowGrid(true);
        SPdados.setViewportView(TBdados);
        TBdados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout PadicionarItensLayout = new javax.swing.GroupLayout(PadicionarItens);
        PadicionarItens.setLayout(PadicionarItensLayout);
        PadicionarItensLayout.setHorizontalGroup(
            PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PadicionarItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBexibeRegistros)
                    .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PadicionarItensLayout.createSequentialGroup()
                            .addComponent(LBexibeitem, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(LBexibeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PadicionarItensLayout.createSequentialGroup()
                            .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBitem)
                                .addComponent(TFitem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBcodigo)
                                .addComponent(TFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PadicionarItensLayout.createSequentialGroup()
                                    .addComponent(CBXgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LBquantidade))
                                .addGroup(PadicionarItensLayout.createSequentialGroup()
                                    .addComponent(CBXtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(42, 42, 42)
                            .addComponent(BTsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BTlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SPdados, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        PadicionarItensLayout.setVerticalGroup(
            PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PadicionarItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PadicionarItensLayout.createSequentialGroup()
                        .addComponent(LBexibeitem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PadicionarItensLayout.createSequentialGroup()
                        .addComponent(LBexibeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PadicionarItensLayout.createSequentialGroup()
                        .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBquantidade)
                            .addComponent(LBcodigo)
                            .addComponent(CBXgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBXtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFcodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PadicionarItensLayout.createSequentialGroup()
                        .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBitem)
                            .addComponent(LbReferencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PadicionarItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFitem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPdados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBexibeRegistros)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        LbReferencia.getAccessibleContext().setAccessibleName("LbCodigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PadicionarItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PadicionarItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Ação realizada ao abrir o form
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
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
        TFitem.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    //Ação realizada ao clicar no botão salvar (---BANCO DE DADOS---)
    private void BTsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsalvarActionPerformed
        String referencia = TFreferencia.getText();
        String descricao = TFitem.getText();
        String genero = CBXgenero.getSelectedItem().toString();
        String tamanho = CBXtamanho.getSelectedItem().toString();
        int quantidade = Integer.parseInt(FTFquantidade.getText());
        //Instanciar a conexao
        ConexaoSQLite conexao = new ConexaoSQLite();
        //Conectar com o banco
        conexao.Conectar();
        //String de consulta
        String sqlInsert = "INSERT INTO ITEM (Referencia_Item,Descricao_Item,Genero_Item,Tamanho_Item,Qtd_Item) VALUES (?,?,?,?,?);";
        //Preparar execução
        PreparedStatement stmt = conexao.criarPreparedStatement(sqlInsert);
        try{
            stmt.setString(1, referencia);
            stmt.setString(2, descricao);
            stmt.setString(3, genero);
            stmt.setString(4, tamanho);
            stmt.setInt(5, quantidade);
            int resultado = stmt.executeUpdate();
            if(resultado == 1){
                JOptionPane.showMessageDialog(null, "Item gerado com Sucesso!");
                try {
                    log.generateLog("Usuário " + user + " Cadastrou o Item: " + referencia);
                } catch (IOException ex) {
                    Logger.getLogger(FrmCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao Cadastrar!");
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao Cadastrar!");
        }
        finally{
            if(stmt != null){
                try{
                    stmt.close();
                    this.dispose();
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
            conexao.Desconectar();
        }
    }//GEN-LAST:event_BTsalvarActionPerformed
        
    private void CBXtamanhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CBXtamanhoFocusLost
        if(CBXtamanho.getSelectedIndex() == 0){
            CBXtamanho.grabFocus();
        }
        else{
            LBexibeReferencia.setText(LBexibeReferencia.getText() + CBXtamanho.getSelectedItem());
            TFreferencia.setText(LBexibeReferencia.getText());
            CBXtamanho.setEnabled(false);
        }
    }//GEN-LAST:event_CBXtamanhoFocusLost

    private void CBXtamanhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBXtamanhoItemStateChanged
        if(CBXtamanho.getSelectedIndex() != 0){
            FTFquantidade.setEnabled(true);
        }
        else{
            FTFquantidade.setEnabled(false);
        }
    }//GEN-LAST:event_CBXtamanhoItemStateChanged

    private void CBXgeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBXgeneroItemStateChanged
        if(CBXgenero.getSelectedIndex() != 0){
            CBXtamanho.setEnabled(true);
        }
        else{
            CBXtamanho.setEnabled(false);
        }
    }//GEN-LAST:event_CBXgeneroItemStateChanged
    
    private void TFitemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFitemKeyReleased
        LBexibeitem.setText(TFitem.getText());
        if(TFitem.getText().equals("")){
            TFcodigo.setEnabled(false);
        }
        else{
            TFcodigo.setEnabled(true);
        }
    }//GEN-LAST:event_TFitemKeyReleased

    //Limpar componentes e rotulos, bloqueia combobox e inicia
    private void BTlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimparActionPerformed
        limpaComponentes(PadicionarItens);
        limpaRotulos();
        bloqueia();
        inicia();
    }//GEN-LAST:event_BTlimparActionPerformed
    
    private void TFcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcodigoKeyReleased
        String codigo = TFcodigo.getText();
        if(codigo.equals("")){
            CBXgenero.setEnabled(false);
        }
        else if (TFcodigo.getText().length() > 3) {
            LBexibeReferencia.setText("");
            TFcodigo.setText("");
            JOptionPane.showMessageDialog(null, "São permitidos 3 caracteres para código!");
            TFcodigo.setEnabled(true);
            TFcodigo.grabFocus();
        }
        else {
            LBexibeReferencia.setText(codigo.toUpperCase());
            CBXgenero.setEnabled(true);
        }
    }//GEN-LAST:event_TFcodigoKeyReleased

    private void CBXgeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CBXgeneroFocusLost
        LBexibeReferencia.setText(LBexibeReferencia.getText() + CBXgenero.getSelectedItem());
        CBXgenero.setEnabled(false);
    }//GEN-LAST:event_CBXgeneroFocusLost

    private void TFitemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFitemFocusLost
        if(!TFitem.getText().equals("")){
            TFitem.setEnabled(false);
        }
    }//GEN-LAST:event_TFitemFocusLost

    private void TFcodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFcodigoFocusLost
        TFcodigo.setEnabled(false);
    }//GEN-LAST:event_TFcodigoFocusLost

    private void FTFquantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FTFquantidadeKeyReleased
        if(FTFquantidade.getText().equals("")){
            BTsalvar.setEnabled(false);
        }
        else
        {
            try {
                if(Integer.parseInt(FTFquantidade.getText()) >= 0){
                    BTsalvar.setEnabled(true);
                }
            } catch (NumberFormatException e) {
                FTFquantidade.setText("");
                FTFquantidade.grabFocus();
                JOptionPane.showMessageDialog(null, "Valor inválido para um campo numérico!");
            }
        }
    }//GEN-LAST:event_FTFquantidadeKeyReleased

    //Limpa os rótulos exibidos no topo (Item e Referencia)
    private void limpaRotulos(){
        LBexibeitem.setText("");
        LBexibeReferencia.setText("");
    }
    
    //Desabilita campos Quantidade, Genero e Tamanho
    private void bloqueia(){
        TFcodigo.setEnabled(false);
        CBXgenero.setEnabled(false);
        CBXtamanho.setEnabled(false);
        FTFquantidade.setEnabled(false);
        BTsalvar.setEnabled(false);
    }
    
    //Habilita e seta o foco em Item
    private void inicia(){
        TFitem.setEnabled(true);
        TFitem.grabFocus();
    }
   
    //Limpa os componentes do Jpanel
    public void limpaComponentes(JPanel c){
        Component[] cmp = c.getComponents();
        for (Component cmp1 : cmp) {
            if (cmp1 instanceof JTextField jTextField) {
                jTextField.setText("");
            }
            if (cmp1 instanceof JComboBox jComboBox) {
                jComboBox.setSelectedIndex(0);
            }
            if (cmp1 instanceof JFormattedTextField jFormattedTextField){
                jFormattedTextField.setText("");
            }  
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTlimpar;
    private javax.swing.JButton BTsalvar;
    private javax.swing.JComboBox<String> CBXgenero;
    private javax.swing.JComboBox<String> CBXtamanho;
    private javax.swing.JFormattedTextField FTFquantidade;
    private javax.swing.JLabel LBcodigo;
    private javax.swing.JLabel LBexibeReferencia;
    private javax.swing.JLabel LBexibeRegistros;
    private javax.swing.JLabel LBexibeitem;
    private javax.swing.JLabel LBitem;
    private javax.swing.JLabel LBquantidade;
    private javax.swing.JLabel LbReferencia;
    private javax.swing.JPanel PadicionarItens;
    private javax.swing.JScrollPane SPdados;
    private javax.swing.JTable TBdados;
    private javax.swing.JTextField TFcodigo;
    private javax.swing.JTextField TFitem;
    private javax.swing.JTextField TFreferencia;
    // End of variables declaration//GEN-END:variables
}
