/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

/**
 *
 * @author ILHAM
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormData extends javax.swing.JFrame {

    /**
     * Creates new form FormData
     */
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksiDatabase.koneksi.BukaKoneksi();

    public FormData() {
        initComponents();
        TampilData();
    }

    public void Bersih() {
        txtID.setText("");
        txtKode.setText("");
        txtNama.setText("");
        txtJenisID.setText("");
        txtCP.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
        txtFax.setText("");
        txtKota.setText("");
        txtEmail.setText("");
        txtJT.setText("");
        txtDisc.setText("");
        txtAwal.setText("");
        txtPiutang.setText("");
        txtBayar.setText("");
        txtAkhir.setText("");
        txtTanggal.setText("");
        txtPWD.setText("");
        txtUID.setText("");

        btnSimpan.setText("Simpan");
        txtID.setEditable(true);
    }

    private void CariData(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM r_customer WHERE " + cmbCari.getSelectedItem().toString() + 
            " LIKE '%" + txtCari.getText() + "%'");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("ID");
            model.addColumn("Kode");
            model.addColumn("Nama");
            model.addColumn("Jenis ID");
            model.addColumn("Contact Person");
            model.addColumn("Alamat");
            model.addColumn("Telepon");
            model.addColumn("Fax");
            model.addColumn("Kota");
            model.addColumn("E-Mail");
            model.addColumn("Juta");
            model.addColumn("Diskon");
            model.addColumn("Awal");
            model.addColumn("Piutang");
            model.addColumn("Bayar");
            model.addColumn("Akhir");
            model.addColumn("Tanggal");
            model.addColumn("User ID");
            model.addColumn("Password");
            int no = 1;

            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] data = {
                        no++,
                        rs.getString("id"),
                        rs.getString("kode"),
                        rs.getString("nama"),
                        rs.getString("jenisid"),
                        rs.getString("cp"),
                        rs.getString("alamat"),
                        rs.getString("telp"),
                        rs.getString("fax"),
                        rs.getString("kota"),
                        rs.getString("email"),
                        rs.getString("jt"),
                        rs.getString("disc"),
                        rs.getString("AWAL"),
                        rs.getString("Piutang"),
                        rs.getString("Bayar"),
                        rs.getString("Akhir"),
                        rs.getString("tgl"),
                        rs.getString("userid"),
                        rs.getString("pwd"),
                };
                model.addRow(data);
                tblData.setModel(model);
            }
        } catch (Exception e) {
        }
    }

    private void TampilData() {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM r_customer");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("ID");
            model.addColumn("Kode");
            model.addColumn("Nama");
            model.addColumn("Jenis ID");
            model.addColumn("Contact Person");
            model.addColumn("Alamat");
            model.addColumn("Telepon");
            model.addColumn("Fax");
            model.addColumn("Kota");
            model.addColumn("E-Mail");
            model.addColumn("Juta");
            model.addColumn("Diskon");
            model.addColumn("Awal");
            model.addColumn("Piutang");
            model.addColumn("Bayar");
            model.addColumn("Akhir");
            model.addColumn("Tanggal");
            model.addColumn("User ID");
            model.addColumn("Password");
            int no = 1;

            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] data = {
                        no++,
                        rs.getString("id"),
                        rs.getString("kode"),
                        rs.getString("nama"),
                        rs.getString("jenisid"),
                        rs.getString("cp"),
                        rs.getString("alamat"),
                        rs.getString("telp"),
                        rs.getString("fax"),
                        rs.getString("kota"),
                        rs.getString("email"),
                        rs.getString("jt"),
                        rs.getString("disc"),
                        rs.getString("AWAL"),
                        rs.getString("Piutang"),
                        rs.getString("Bayar"),
                        rs.getString("Akhir"),
                        rs.getString("tgl"),
                        rs.getString("userid"),
                        rs.getString("pwd"),
                };
                model.addRow(data);
                tblData.setModel(model);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJenisID = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtKota = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtJT = new javax.swing.JTextField();
        txtDisc = new javax.swing.JTextField();
        txtAwal = new javax.swing.JTextField();
        txtPiutang = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        txtAkhir = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtPWD = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        cmbCari = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Kode");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis ID");

        jLabel5.setText("Contact Person");

        jLabel6.setText("Alamat");

        jLabel7.setText("Telepon");

        jLabel8.setText("Fax");

        jLabel9.setText("Kota");

        jLabel10.setText("E-Mail");

        jLabel11.setText("Juta");

        jLabel12.setText("Disc");

        jLabel13.setText("Awal");

        jLabel14.setText("Piutang");

        jLabel15.setText("Bayar");

        jLabel16.setText("Akhir");

        jLabel17.setText("Tanggal");

        jLabel18.setText("User ID");

        jLabel19.setText("Password");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Kode", "Nama", "Jenis ID", "Contact Person", "Alamat", "Telepon", "Fax", "Kota", "E-Mail", "Juta", "Diskon", "Awal", "Piutang", "Bayar", "Akhir", "Tanggal", "User ID", "Password"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel20.setText("Cari");

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nama", "alamat" }));

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel21.setText("Manajemen Table Customer");

        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel22.setText("Kelompok 5 - IK-1A");

        jLabel23.setForeground(new java.awt.Color(255, 51, 0));
        jLabel23.setText("Pastikan Format Tanggal adalah YYYY-MM-DD.");

        jLabel24.setForeground(new java.awt.Color(255, 51, 0));
        jLabel24.setText("Contoh: 2024-05-04");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID)
                                            .addComponent(txtKode)
                                            .addComponent(txtNama)
                                            .addComponent(txtJenisID)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addComponent(btnSimpan))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAlamat)
                                            .addComponent(txtFax)
                                            .addComponent(txtTelepon)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnHapus)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBatal)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtCP))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmail)
                                                .addComponent(txtJT)
                                                .addComponent(txtDisc)
                                                .addComponent(txtAwal)
                                                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPiutang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(25, 25, 25)
                                .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtPWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel17)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtJT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtJenisID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(txtPiutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal)
                    .addComponent(jLabel20)
                    .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        // TODO add your handling code here:
        CariData();
    }//GEN-LAST:event_txtCariKeyPressed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        txtID.setText(tblData.getValueAt(tblData.getSelectedRow(), 1).toString());
        txtKode.setText(tblData.getValueAt(tblData.getSelectedRow(), 2).toString());
        txtNama.setText(tblData.getValueAt(tblData.getSelectedRow(), 3).toString());
        txtJenisID.setText(tblData.getValueAt(tblData.getSelectedRow(), 4).toString());
        txtCP.setText(tblData.getValueAt(tblData.getSelectedRow(), 5).toString());
        txtAlamat.setText(tblData.getValueAt(tblData.getSelectedRow(), 6).toString());
        txtTelepon.setText(tblData.getValueAt(tblData.getSelectedRow(), 7).toString());
        txtFax.setText(tblData.getValueAt(tblData.getSelectedRow(), 8).toString());
        txtKota.setText(tblData.getValueAt(tblData.getSelectedRow(), 9).toString());
        txtEmail.setText(tblData.getValueAt(tblData.getSelectedRow(), 10).toString());
        txtJT.setText(tblData.getValueAt(tblData.getSelectedRow(), 11).toString());
        txtDisc.setText(tblData.getValueAt(tblData.getSelectedRow(), 12).toString());
        txtAwal.setText(tblData.getValueAt(tblData.getSelectedRow(), 13).toString());
        txtPiutang.setText(tblData.getValueAt(tblData.getSelectedRow(), 14).toString());
        txtBayar.setText(tblData.getValueAt(tblData.getSelectedRow(), 15).toString());
        txtAkhir.setText(tblData.getValueAt(tblData.getSelectedRow(), 16).toString());
        txtTanggal.setText(tblData.getValueAt(tblData.getSelectedRow(), 17).toString());
        txtUID.setText(tblData.getValueAt(tblData.getSelectedRow(), 18).toString());
        txtPWD.setText(tblData.getValueAt(tblData.getSelectedRow(), 19).toString());

        txtID.setEditable(false);
        btnSimpan.setText("Ubah");
    }// GEN-LAST:event_tblDataMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtIDActionPerformed

    private void txtFaxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFaxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFaxActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silakan pilih data yang akan dihapus!");
        } else {
            int jawa = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION);
            if (jawa == 0) {
                try {
                    st = cn.createStatement();
                    String sql = "DELETE FROM r_customer WHERE id = '" + txtID.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    TampilData();
                    Bersih();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
            }
        }
    }// GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:

        try {
            st = cn.createStatement();

            JTextField[] textFields = { txtAkhir, txtAlamat, txtAwal, txtBayar, txtCP, txtDisc, txtEmail, txtFax, txtID,
                    txtJT, txtJenisID, txtKode, txtKota, txtNama, txtPWD, txtPiutang, txtTanggal, txtTelepon, txtUID };
            boolean adaYangKosong = false;

            // Iterasi melalui array text field
            for (JTextField textField : textFields) {
                if (textField.getText().equals("")) {
                    adaYangKosong = true;
                    break; // Keluar dari loop segera setelah menemukan yang kosong
                }
            }

            // Jika ada yang kosong, tampilkan pesan peringatan
            if (adaYangKosong) {
                JOptionPane.showMessageDialog(null, "Pastikan tidak ada data yang kosong", "Validasi Data",
                        JOptionPane.INFORMATION_MESSAGE);
                return; // Menghentikan eksekusi lebih lanjut setelah menampilkan pesan peringatan
            }

            // Aksi simpan data

            if (btnSimpan.getText().equals("Simpan")) {
                String cek = "SELECT * FROM r_customer WHERE id = '" + txtID.getText() + "'";
                rs = st.executeQuery(cek);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "ID ini sudah ada!");
                } else {
                    String sql = "INSERT INTO r_customer VALUES ('"
                            + txtID.getText() + "', '" + txtKode.getText() + "', '" + txtNama.getText() + "', '"
                            + txtJenisID.getText()
                            + "', '" + txtCP.getText() + "', '" + txtAlamat.getText() + "', '"
                            + txtTelepon.getText() + "', '" + txtFax.getText()
                            + "', '" + txtKota.getText() + "', '" + txtEmail.getText() + "', '" + txtJT.getText()
                            + "', '" + txtDisc.getText()
                            + "', '" + txtAwal.getText() + "', '" + txtPiutang.getText() + "', '"
                            + txtBayar.getText() + "', '" + txtAkhir.getText()
                            + "', '" + txtTanggal.getText() + "', '" + txtUID.getText() + "', '" + txtPWD.getText()
                            + "')";
                    st.execute(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                    Bersih();
                    TampilData();
                }
            } else {
                // Aksi ubah data

                String update = "UPDATE r_customer SET kode = '" + txtKode.getText() + "', nama = '" + txtNama.getText() + "', jenisid = '" + txtJenisID.getText() + "', cp = '" + txtCP.getText() + "', alamat = '" + txtAlamat.getText() + "', telp = '" + txtTelepon.getText() + "', fax = '" + txtFax.getText() + "', kota = '" + txtKota.getText() + "', email = '" + txtEmail.getText() + "', jt = '" + txtJT.getText() + "', disc = '" + txtDisc.getText() + "', AWAL = '" + txtAwal.getText() + "', Piutang = '" + txtPiutang.getText() + "', Bayar = '" + txtBayar.getText() + "', Akhir = '" + txtAkhir.getText() + "', tgl = '" + txtTanggal.getText() + "', userid = '" + txtUID.getText() + "', pwd = '" + txtPWD.getText() + "' WHERE id = '" + txtID.getText() + "'";

                st.execute(update);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                Bersih();
                TampilData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }// GEN-LAST:event_btnSimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAkhir;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDisc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJT;
    private javax.swing.JTextField txtJenisID;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPWD;
    private javax.swing.JTextField txtPiutang;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables
}
