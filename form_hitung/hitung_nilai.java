package form_hitung;
import koneksi.koneksi;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import login.menu;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class hitung_nilai extends javax.swing.JFrame {
    private Connection con = new koneksi().getKoneksi();
    private DefaultTableModel model;
    
    public hitung_nilai() {
        initComponents();
        datatable();
        clear();
    }
    protected void aktif(){
        txtnis.setEnabled(true);
        txtnama.setEnabled(true);
        txtkelas.setEnabled(true);
        txttugas.setEnabled(true);
        txtuts.setEnabled(true);
        txtuas.setEnabled(true);
        txttotalnilai.setEnabled(false);
        txtnis.requestFocus(true);
    }
    protected void clear(){
        txtnama.setText("");
        txtkelas.setSelectedIndex(0);
        txttugas.setText("");
        txtuts.setText("");
        txtuas.setText("");
        txttotalnilai.setText("");
        txtnis.setText("");    
    }
    protected void datatable(){
        Object [] Baris ={"NIS","Nama","Kelas","Tugas","UTS","UAS","Total Nilai"};
        model= new DefaultTableModel(null, Baris);
        jtabel1.setModel(model);
        Connection cn = koneksi.getKoneksi();
        String sql = "select * from tb_nilai";
        try{
        Statement st = cn.createStatement();
        ResultSet hasil = st.executeQuery(sql);
        while(hasil.next()){
        String a = hasil.getString("nis");
        String b = hasil.getString("nama");
        String c = hasil.getString("kelas");
        String d = hasil.getString("tugas");
        String e = hasil.getString("uts");
        String f = hasil.getString("uas");
        String g = hasil.getString("totalNilai");

        String[] data ={a,b,c,d,e,f,g};
        model.addRow(data);
    }
    }catch(Exception e){
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtabel1 = new javax.swing.JTable();
        jsimpan = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txttotalnilai = new javax.swing.JTextField();
        txtuts = new javax.swing.JTextField();
        txtuas = new javax.swing.JTextField();
        txttugas = new javax.swing.JTextField();
        txtkelas = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 79));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Nilai Siswa / i");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 79);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 634));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tugas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Kelas");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("UTS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("UAS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Total Nilai");

        jtabel1.setBackground(new java.awt.Color(51, 204, 255));
        jtabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Kelas", "Tugas", "UTS", "UAS", "Total Nilai"
            }
        ));
        jtabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabel1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtabel1);

        jsimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        jsimpan.setText("SIMPAN");
        jsimpan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsimpanActionPerformed(evt);
            }
        });

        jdelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        jdelete.setText("DELETE");
        jdelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jexit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kembali.png"))); // NOI18N
        jexit.setText("EXIT");
        jexit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("NIS");

        txtnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnisActionPerformed(evt);
            }
        });

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txttotalnilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalnilaiActionPerformed(evt);
            }
        });

        txtuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtutsActionPerformed(evt);
            }
        });

        txtuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuasActionPerformed(evt);
            }
        });

        txttugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttugasActionPerformed(evt);
            }
        });

        txtkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R61", "R62", "RE1", "RA2" }));

        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        update.setText("UPDATE");
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cetak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regist.png"))); // NOI18N
        cetak.setText("CETAK");
        cetak.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttugas)
                            .addComponent(txtuts))
                        .addGap(253, 253, 253)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnis)
                        .addGap(146, 146, 146)
                        .addComponent(jsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalnilai)
                            .addComponent(txtuas))
                        .addGap(253, 253, 253)
                        .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttugas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtuts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtuas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 75, 720, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabel1MouseClicked
        // TODO add your handling code here:
        int bar = jtabel1.getSelectedRow();
        String a = model.getValueAt(bar,0).toString();
        String b = model.getValueAt(bar,1).toString();
        String c = model.getValueAt(bar,2).toString();
        String d = model.getValueAt(bar,3).toString();
        String e = model.getValueAt(bar,4).toString();
        String f = model.getValueAt(bar,5).toString();
        String g = model.getValueAt(bar,6).toString();

        txtnis.setText(a);
        txtnama.setText(b);
        txtkelas.setSelectedItem(c);
        txttugas.setText(d);
        txtuts.setText(e);
        txtuas.setText(f);
        txttotalnilai.setText(g);
    }//GEN-LAST:event_jtabel1MouseClicked

    private void jsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsimpanActionPerformed
        // TODO add your handling code here:
        double tugas,uts,uas,nilai;

        tugas = Integer.parseInt(txttugas.getText());
        uts = Integer.parseInt(txtuts.getText());
        uas = Integer.parseInt(txtuas.getText());
        nilai = (tugas*20/100) + (uts*30/100) + (uas*50/100);
        txttotalnilai.setText(String.valueOf(nilai));

        try{
            String sql = "insert into tb_nilai values (?,?,?,?,?,?,?)";
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1, txtnis.getText());
            pst.setString(2, txtnama.getText());
            pst.setString(3, txtkelas.getSelectedItem().toString());
            pst.setString(4, txttugas.getText());
            pst.setString(5, txtuts.getText());
            pst.setString(6, txtuas.getText());
            pst.setString(7, txttotalnilai.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Behasil Disimpan");
            txtnis.requestFocus();
            datatable();
            clear();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" +e);
        }

    }//GEN-LAST:event_jsimpanActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        int hps = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION );
        if (hps==0){
            String sql = "delete from tb_nilai where nis ='"+txtnis.getText()+"'";
            try{
                PreparedStatement pst =con.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus");
                datatable();
                clear();
                txtnis.requestFocus();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal di Hapus");
            }
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_jexitActionPerformed

    private void txtnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnisActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txttotalnilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalnilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalnilaiActionPerformed

    private void txtutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtutsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtutsActionPerformed

    private void txtuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuasActionPerformed

    private void txttugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttugasActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String updateQuery = null;
        PreparedStatement ps = null;
        
        updateQuery = "UPDATE tb_nilai SET nis=?, nama=?, kelas=?, tugas=?, uts=?, uas=?, totalNilai=? WHERE nis=?";
        
        try {
            ps =con.prepareStatement(updateQuery);
            ps.setString(1, txtnis.getText());
            ps.setString(2, txtnama.getText());
            ps.setString(3, txtkelas.getSelectedItem().toString());
            ps.setString(4, txttugas.getText());
            ps.setString(5, txtuts.getText());
            ps.setString(6, txtuas.getText());
            ps.setString(7, txttotalnilai.getText());
            ps.setString(8, txtnis.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Behasil DiUpdate");
            clear();
            txtnis.requestFocus();
            datatable();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Data Gagal DiUpdate");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        JasperReport reports;
        
        String path = ".\\src\\report\\reportNilai.jasper";
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, con);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
            
            System.out.println("Masuk try");
            
        } catch (JRException ex) {
            Logger.getLogger(hitung_nilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cetakActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hitung_nilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jsimpan;
    private javax.swing.JTable jtabel1;
    private javax.swing.JComboBox<String> txtkelas;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txttotalnilai;
    private javax.swing.JTextField txttugas;
    private javax.swing.JTextField txtuas;
    private javax.swing.JTextField txtuts;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
