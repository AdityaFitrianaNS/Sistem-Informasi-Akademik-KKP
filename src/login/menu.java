package login;
import dataGuru.dataGuru;
import dataSiswa.dataSiswa;
import absensi.absensi;
import jadwalPelajaran.jadwalPelajaran;
import penilaiansikap.tabelsikap;
import form_hitung.hitung_nilai;

public class menu extends javax.swing.JFrame {
    public menu() {
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataGuru = new javax.swing.JButton();
        jadwalPelajaran = new javax.swing.JButton();
        dataSiswa = new javax.swing.JButton();
        daftarHadir = new javax.swing.JButton();
        sikap = new javax.swing.JButton();
        nilaiSiswa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        dataGuru.setBackground(new java.awt.Color(0, 153, 153));
        dataGuru.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        dataGuru.setForeground(new java.awt.Color(255, 255, 255));
        dataGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonGuru.png"))); // NOI18N
        dataGuru.setText("Data Guru");
        dataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataGuruActionPerformed(evt);
            }
        });

        jadwalPelajaran.setBackground(new java.awt.Color(0, 153, 153));
        jadwalPelajaran.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jadwalPelajaran.setForeground(new java.awt.Color(255, 255, 255));
        jadwalPelajaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonJadwal.png"))); // NOI18N
        jadwalPelajaran.setText("Jadwal Pelajaran");
        jadwalPelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalPelajaranActionPerformed(evt);
            }
        });

        dataSiswa.setBackground(new java.awt.Color(0, 153, 153));
        dataSiswa.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        dataSiswa.setForeground(new java.awt.Color(255, 255, 255));
        dataSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonNilai.png"))); // NOI18N
        dataSiswa.setText("Data Siswa");
        dataSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSiswaActionPerformed(evt);
            }
        });

        daftarHadir.setBackground(new java.awt.Color(0, 153, 153));
        daftarHadir.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        daftarHadir.setForeground(new java.awt.Color(255, 255, 255));
        daftarHadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonAbsensi.png"))); // NOI18N
        daftarHadir.setText("Daftar Hadir");
        daftarHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarHadirActionPerformed(evt);
            }
        });

        sikap.setBackground(new java.awt.Color(0, 153, 153));
        sikap.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        sikap.setForeground(new java.awt.Color(255, 255, 255));
        sikap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regist.png"))); // NOI18N
        sikap.setText("Penilaian Sikap");
        sikap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sikapActionPerformed(evt);
            }
        });

        nilaiSiswa.setBackground(new java.awt.Color(0, 153, 153));
        nilaiSiswa.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        nilaiSiswa.setForeground(new java.awt.Color(255, 255, 255));
        nilaiSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonSiswa.png"))); // NOI18N
        nilaiSiswa.setText("Nilai Siswa");
        nilaiSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiSiswaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(daftarHadir, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(dataSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jadwalPelajaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sikap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nilaiSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jadwalPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sikap, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilaiSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarHadir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SMAN 1 BABAKAN MADANG");

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU SISTEM INFORMASI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataGuruActionPerformed
        this.setVisible(false);
        new dataGuru().setVisible(true);
    }//GEN-LAST:event_dataGuruActionPerformed

    private void dataSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSiswaActionPerformed
        this.setVisible(false);
        new dataSiswa().setVisible(true);
    }//GEN-LAST:event_dataSiswaActionPerformed

    private void daftarHadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarHadirActionPerformed
        this.setVisible(false);
        new absensi().setVisible(true);
    }//GEN-LAST:event_daftarHadirActionPerformed

    private void jadwalPelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalPelajaranActionPerformed
        this.setVisible(false);
        new jadwalPelajaran().setVisible(true);
    }//GEN-LAST:event_jadwalPelajaranActionPerformed

    private void sikapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sikapActionPerformed
        this.setVisible(false);
        new tabelsikap().setVisible(true);
    }//GEN-LAST:event_sikapActionPerformed

    private void nilaiSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiSiswaActionPerformed
        this.setVisible(false);
        new hitung_nilai().setVisible(true);
    }//GEN-LAST:event_nilaiSiswaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarHadir;
    private javax.swing.JButton dataGuru;
    private javax.swing.JButton dataSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jadwalPelajaran;
    private javax.swing.JButton nilaiSiswa;
    private javax.swing.JButton sikap;
    // End of variables declaration//GEN-END:variables
}
