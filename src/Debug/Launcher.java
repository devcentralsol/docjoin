package Debug;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.File;

/**
 *
 * @author Roberto Jose Molina Gonzalez
 */
public class Launcher extends javax.swing.JFrame {

    String Directorio = "";
    String DirectorioDestino = "";
    String DirectorioDestinoUnoDocto = "";
    String nombrDocto = "";
    String[] Lotes = new String[14];

    public Launcher() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tittle = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        filesSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GenericDoctoUno = new javax.swing.JButton();
        SelectDesDocto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoteSelect = new javax.swing.JButton();
        SelectDesDoctoLot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        GenericDoctoLote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 50, 90));

        Tittle.setFont(new java.awt.Font("Poppins ExtraBold", 0, 36)); // NOI18N
        Tittle.setForeground(new java.awt.Color(255, 255, 255));
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("CSPI DOCTO JOIN");
        Tittle.setToolTipText("");
        Tittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tittle.setMaximumSize(new java.awt.Dimension(104, 19));

        salir.setBackground(new java.awt.Color(204, 204, 204));
        salir.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(51, 51, 51));
        salir.setActionCommand("Salir");
        salir.setLabel("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        filesSearch.setBackground(new java.awt.Color(255, 255, 255));
        filesSearch.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        filesSearch.setForeground(new java.awt.Color(102, 102, 102));
        filesSearch.setLabel("Selecciona Archibo");
        filesSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filesSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleciona un Archibo *PDF");

        GenericDoctoUno.setBackground(new java.awt.Color(255, 255, 255));
        GenericDoctoUno.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        GenericDoctoUno.setForeground(new java.awt.Color(102, 102, 102));
        GenericDoctoUno.setText("Anexar Leyenda");
        GenericDoctoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenericDoctoUnoActionPerformed(evt);
            }
        });

        SelectDesDocto.setBackground(new java.awt.Color(255, 255, 255));
        SelectDesDocto.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        SelectDesDocto.setForeground(new java.awt.Color(102, 102, 102));
        SelectDesDocto.setText("Elegir Destino Doc.");
        SelectDesDocto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDesDoctoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleciona Carperta Destino");

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleciona Varios Archibo *PDF");

        LoteSelect.setBackground(new java.awt.Color(255, 255, 255));
        LoteSelect.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        LoteSelect.setForeground(new java.awt.Color(102, 102, 102));
        LoteSelect.setLabel("Selecciona Lote");
        LoteSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoteSelectActionPerformed(evt);
            }
        });

        SelectDesDoctoLot.setBackground(new java.awt.Color(255, 255, 255));
        SelectDesDoctoLot.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        SelectDesDoctoLot.setForeground(new java.awt.Color(102, 102, 102));
        SelectDesDoctoLot.setText("Elegir Destino Doc.");
        SelectDesDoctoLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDesDoctoLotActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleciona Carperta Destino");

        GenericDoctoLote.setBackground(new java.awt.Color(255, 255, 255));
        GenericDoctoLote.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        GenericDoctoLote.setForeground(new java.awt.Color(102, 102, 102));
        GenericDoctoLote.setText("Anexar Leyenda");
        GenericDoctoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenericDoctoLoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filesSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectDesDocto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenericDoctoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(221, 221, 221)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(SelectDesDoctoLot, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenericDoctoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filesSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectDesDocto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenericDoctoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenericDoctoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectDesDoctoLot, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectDesDoctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDesDoctoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Ruta Archibo: " + chooser.getSelectedFile().getPath());
            System.out.println("Nombre Archibo: " + chooser.getSelectedFile().getName());
            String Ruta = chooser.getSelectedFile().getPath();
            DirectorioDestinoUnoDocto = Ruta;
            System.out.println(DirectorioDestinoUnoDocto);
            JOptionPane.showMessageDialog(null, "Destino de documento Selecionado con exito" + DirectorioDestinoUnoDocto);
        }
    }//GEN-LAST:event_SelectDesDoctoActionPerformed

    private void GenericDoctoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenericDoctoUnoActionPerformed

        try {
            PDFMergerUtility ut = new PDFMergerUtility();
            ut.addSource(Directorio);
            ut.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
            ut.setDestinationFileName(DirectorioDestinoUnoDocto + "\\" + nombrDocto);
            ut.mergeDocuments();
            System.out.println("" + DirectorioDestinoUnoDocto + "" + nombrDocto);
            JOptionPane.showMessageDialog(null, "Documentos Generados Con Exito !!!");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error Con la Genereacion \n del nuevo Documento.");
        } catch (IOException ex) {
            Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("" + DirectorioDestinoUnoDocto);
    }//GEN-LAST:event_GenericDoctoUnoActionPerformed

    private void filesSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filesSearchActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Document PDF", "PDF");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Ruta Archibo: " + chooser.getSelectedFile().getPath());
            System.out.println("Nombre Archibo: " + chooser.getSelectedFile().getName());
            String Ruta = chooser.getSelectedFile().getPath();
            Directorio = Ruta;
            nombrDocto = chooser.getSelectedFile().getName();
            System.out.println(Directorio);
            JOptionPane.showMessageDialog(null, "Documento cargado con exitpo \n Documento ---->" + nombrDocto);
        }
    }//GEN-LAST:event_filesSearchActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Hasta pronto!!!");
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void LoteSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoteSelectActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Ruta Archibo: " + chooser.getSelectedFile().getPath());
            //System.out.println("Nombre Archibo: " + chooser.getSelectedFile().getName());
            String Ruta = chooser.getSelectedFile().getPath();
            Directorio = Ruta;
            System.out.println(Ruta);
            File carpeta = new File(Directorio);
            String[] listado = carpeta.list();
            if (listado == null || listado.length == 0) {
                System.out.println("No hay elementos dentro de la carpeta actual");
                JOptionPane.showMessageDialog(null, "No hay elementos dentro de la carpeta actual");
                return;
            } else {
                for (int i = 0; i < listado.length; i++) {
                    Lotes[i] = listado[i];
                    System.out.println(Lotes[i]);
                }
                JOptionPane.showMessageDialog(null, "Reconocimiento Lote de archibos terminado");
            }
        }
    }//GEN-LAST:event_LoteSelectActionPerformed

    private void SelectDesDoctoLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDesDoctoLotActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Ruta Archibo: " + chooser.getSelectedFile().getPath());
            System.out.println("Nombre Archibo: " + chooser.getSelectedFile().getName());
            String Ruta = chooser.getSelectedFile().getPath();
            DirectorioDestino = Ruta;
            System.out.println(DirectorioDestino);
            JOptionPane.showMessageDialog(null, "Destino de documento Selecionado con exito" + DirectorioDestino);
        }
    }//GEN-LAST:event_SelectDesDoctoLotActionPerformed

    private void GenericDoctoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenericDoctoLoteActionPerformed

        try {

            //System.out.println("Lotes"+Lotes.length);
            for (int i = 0; i < Lotes.length;) {
                if (Lotes[i] != null) {
                    if (i == 0) {
                        PDFMergerUtility ut = new PDFMergerUtility();
                        ut.addSource(Directorio + "\\" + Lotes[0]);
                        ut.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        ut.setDestinationFileName(DirectorioDestino + "\\" + Lotes[0]);
                        ut.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento" + Lotes[0]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 1) {
                        PDFMergerUtility uts = new PDFMergerUtility();
                        uts.addSource(Directorio + "\\" + Lotes[1]);
                        uts.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        uts.setDestinationFileName(DirectorioDestino + "\\" + Lotes[1]);
                        uts.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento" + Lotes[1]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 2) {
                        PDFMergerUtility us = new PDFMergerUtility();
                        us.addSource(Directorio + "\\" + Lotes[2]);
                        us.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        us.setDestinationFileName(DirectorioDestino + "\\" + Lotes[2]);
                        us.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento" + Lotes[2]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 3) {
                        PDFMergerUtility usc = new PDFMergerUtility();
                        usc.addSource(Directorio + "\\" + Lotes[3]);
                        usc.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        usc.setDestinationFileName(DirectorioDestino + "\\" + Lotes[3]);
                        usc.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento" + Lotes[3]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 4) {
                        PDFMergerUtility uc = new PDFMergerUtility();
                        uc.addSource(Directorio + "\\" + Lotes[4]);
                        uc.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        uc.setDestinationFileName(DirectorioDestino + "\\" + Lotes[4]);
                        uc.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[4]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 5) {
                        PDFMergerUtility cw = new PDFMergerUtility();
                        cw.addSource(Directorio + "\\" + Lotes[5]);
                        cw.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw.setDestinationFileName(DirectorioDestino + "\\" + Lotes[5]);
                        cw.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[5]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 6) {
                        PDFMergerUtility cwc = new PDFMergerUtility();
                        cwc.addSource(Directorio + "\\" + Lotes[6]);
                        cwc.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cwc.setDestinationFileName(DirectorioDestino + "\\" + Lotes[6]);
                        cwc.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[6]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 7) {
                        PDFMergerUtility cwc1 = new PDFMergerUtility();
                        cwc1.addSource(Directorio + "\\" + Lotes[7]);
                        cwc1.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cwc1.setDestinationFileName(DirectorioDestino + "\\" + Lotes[7]);
                        cwc1.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[7]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 8) {
                        PDFMergerUtility cwc2 = new PDFMergerUtility();
                        cwc2.addSource(Directorio + "\\" + Lotes[8]);
                        cwc2.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cwc2.setDestinationFileName(DirectorioDestino + "\\" + Lotes[8]);
                        cwc2.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[8]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 9) {
                        PDFMergerUtility cwc3 = new PDFMergerUtility();
                        cwc3.addSource(Directorio + "\\" + Lotes[9]);
                        cwc3.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cwc3.setDestinationFileName(DirectorioDestino + "\\" + Lotes[9]);
                        cwc3.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[9]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 10) {
                        PDFMergerUtility cw1 = new PDFMergerUtility();
                        cw1.addSource(Directorio + "\\" + Lotes[10]);
                        cw1.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw1.setDestinationFileName(DirectorioDestino + "\\" + Lotes[10]);
                        cw1.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[10]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 11) {
                        PDFMergerUtility cw2 = new PDFMergerUtility();
                        cw2.addSource(Directorio + "\\" + Lotes[11]);
                        cw2.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw2.setDestinationFileName(DirectorioDestino + "\\" + Lotes[11]);
                        cw2.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[11]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 12) {
                        PDFMergerUtility cw3 = new PDFMergerUtility();
                        cw3.addSource(Directorio + "\\" + Lotes[12]);
                        cw3.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw3.setDestinationFileName(DirectorioDestino + "\\" + Lotes[12]);
                        cw3.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[12]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 13) {
                        PDFMergerUtility cw4 = new PDFMergerUtility();
                        cw4.addSource(Directorio + "\\" + Lotes[13]);
                        cw4.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw4.setDestinationFileName(DirectorioDestino + "\\" + Lotes[13]);
                        cw4.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[13]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 13) {
                        PDFMergerUtility cw4 = new PDFMergerUtility();
                        cw4.addSource(Directorio + "\\" + Lotes[13]);
                        cw4.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw4.setDestinationFileName(DirectorioDestino + "\\" + Lotes[13]);
                        cw4.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[13]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                    if (i == 14) {
                        PDFMergerUtility cw5 = new PDFMergerUtility();
                        cw5.addSource(Directorio + "\\" + Lotes[14]);
                        cw5.addSource("C:\\Users\\rmoli\\iso\\anexo.pdf");
                        cw5.setDestinationFileName(DirectorioDestino + "\\" + Lotes[14]);
                        cw5.mergeDocuments(null);
                        i++;
                        JOptionPane.showMessageDialog(null, "Documento " + Lotes[13]);
                    } else {
                        System.err.println("Sin Documentos");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas Documentos por anexar!!!");
                    return;
                }
            }
            System.out.println("Documentos Realizados");
            JOptionPane.showMessageDialog(null, "Documentos Generados Con Exito!!!");

        } catch (Exception x) {
            System.err.println(x.getMessage().toString());
        }

    }//GEN-LAST:event_GenericDoctoLoteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenericDoctoLote;
    private javax.swing.JButton GenericDoctoUno;
    private javax.swing.JButton LoteSelect;
    private javax.swing.JButton SelectDesDocto;
    private javax.swing.JButton SelectDesDoctoLot;
    private javax.swing.JLabel Tittle;
    private javax.swing.JButton filesSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
