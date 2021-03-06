/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alcan
 */
public class ExpresionesRegulares extends javax.swing.JFrame {

    /**
     * Creates new form ExpresionesRegulares
     */
    public ExpresionesRegulares() {
        initComponents();
        this.setLocationRelativeTo(null);
        modeloT = new DefaultTableModel();
//        modeloT.addColumn("Aceptadas");
//        modeloT.addColumn("Rechazadas");
          this.jtableER.setModel(modeloT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfRechazadas2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaEntrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        txfRechazadas = new javax.swing.JTextField();
        txf3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txf2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txf1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableER = new javax.swing.JTable();

        jLabel13.setText("No. Control");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expresiones Regulares");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setForeground(java.awt.Color.green);
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);

        txaEntrada.setColumns(20);
        txaEntrada.setRows(5);
        jScrollPane1.setViewportView(txaEntrada);

        jLabel1.setText("Entrada de texto");

        jButton1.setText("New Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Rechazadas:");

        btnAnalizar.setText("analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel12.setText("No. Control");

        jLabel14.setText("Numero");

        jLabel15.setText("ID");

        jtableER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableERMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(btnAnalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel15)
                        .addGap(68, 68, 68)
                        .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14)
                        .addGap(35, 35, 35)
                        .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(txfRechazadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(btnAnalizar))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15))
                    .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(txfRechazadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel modeloT ;
    ArrayList<String> cadenas = new ArrayList<>();
    ArrayList<String> erAceptadas = new ArrayList<>();
    ArrayList<String> erRechazadas = new ArrayList<>();
    ArrayList<String> binaria = new ArrayList<>();
    ArrayList<String> octal = new ArrayList<>();
    ArrayList<String> hexadecimal = new ArrayList<>();
    String[][] mat;
    String filas[] = new String[cadenas.size()];
    File archivo;
    FileWriter escritor;
    String nuevacadena;
    ArrayList<String> noControl = new ArrayList<>();
    
    public void adMat(){
     mat = new String[1000][2];
        for (int i = 0; i < erAceptadas.size(); i++) {
            mat[i][0] = erAceptadas.get(i);
            
        }
        for (int i = 0; i < erRechazadas.size(); i++) {
            mat[i][1]= erRechazadas.get(i);
            
        }
    }
    
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        //Ingresa tex Area a lista

        filas = txaEntrada.getText().split("\n");

        for (int i = 0; i < filas.length; i++) {
            cadenas.add(filas[i]);
        }
        validar();
        
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            nuevacadena = JOptionPane.showInputDialog("Ingresa nueva cadena");
            int tam = filas.length;

            this.cadenas.add(nuevacadena);

            validar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtableERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableERMouseClicked
        // TODO add your handling code here:
        int fila =  jtableER.getSelectedRow();
        int colm = jtableER.getSelectedColumn();
        String palabra = modeloT.getValueAt(fila, colm).toString();
        JOptionPane.showMessageDialog(null, "hola");
        System.out.println(palabra);
    }//GEN-LAST:event_jtableERMouseClicked

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
            java.util.logging.Logger.getLogger(ExpresionesRegulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpresionesRegulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpresionesRegulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpresionesRegulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpresionesRegulares().setVisible(true);

            }
        });
    }

    public void validar() {
        try {

            File pre = new File("C:\\Users\\Alcan\\Documents/pre.txt");
            File R1 = new File("C:\\Users\\Alcan\\Documents/ER1.txt");
            File R2 = new File("C:\\Users\\Alcan\\Documents/ER2.txt");
            File R3 = new File("C:\\Users\\Alcan\\Documents/ER3.txt");
            File Rechazadas = new File("C:\\Users\\Alcan\\Documents/Rechazadas.txt");

            //************************************************************************
            FileWriter fw = new FileWriter(pre.getAbsoluteFile(), true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(cadenas);
            fw.close();

            String ER2 = "(([$_]+)?(([\\w\\D])+([0-9])*)*)+";//id           
            int contadorER2 = 0;
            String ER1 = "[(^[-]?[\\d]*)||(^[\\d]*[.][\\dd]*)||(^[-][\\d]*[.][\\d]*)"; //numeros
            int contadorER1 = 0;
            String ER3 = "(^[DAISTCMEG]{1,1})([0-9]{2,2})(120)([1-9]{3,3})";//no. control
            int contadorER3 = 0;
            int contador = 0;
            String ER4 = "[0|1]+"; // num. binarios.
            String ER5 = "^[0-7]+"; // num octales 
            String ER6 = "^[0-9A-F]+$"; // num Hexadecimales
            String ER7 = "^(GTO)|^(GJ)[-]+[(1-9)(0-9){3}][-]+[1-9]{2}";

            for (int i = 0; i < cadenas.size(); i++) {

                // validacion de id
                if (cadenas.get(i).matches(ER2)) {
                    FileWriter fw2 = new FileWriter(R1.getAbsoluteFile(), true);
                    PrintWriter pw2 = new PrintWriter(fw2);
                    pw2.println(cadenas.get(i));
                    fw2.close();
                    contadorER2++;
                    txf1.setText(contadorER2 + "");
                    erAceptadas.add(cadenas.get(i));
                } else {
//    if(!txaEntrada.getText().matches(ER1) | !txaEntrada.getText().matches(ER11)| 
//       !txaEntrada.getText().matches(ER111)| txaEntrada.getText().matches(ER11)){

                    //validacion de numeros
                    if (cadenas.get(i).matches(ER1)) {
                        FileWriter fw3 = new FileWriter(R2.getAbsoluteFile(), true);
                        PrintWriter pw3 = new PrintWriter(fw3);
                        pw3.println(cadenas.get(i));
                        fw3.close();
                        contadorER1++;
                        txf2.setText(contadorER1 + "");
                        erAceptadas.add(cadenas.get(i));
                    } else {

                        //validacion de num. control
                        if (cadenas.get(i).matches(ER3)) {
                            FileWriter fw4 = new FileWriter(R3.getAbsoluteFile(), true);
                            PrintWriter pw4 = new PrintWriter(fw4);
                            pw4.println(cadenas.get(i));
                            fw4.close();
                            noControl.add(cadenas.get(i));
                            contadorER3++;
                            txf3.setText(contadorER3 + "");
                            erAceptadas.add(cadenas.get(i));
                        } else {
                            
                            if(cadenas.get(i).matches(ER4)){
                                FileWriter fw5 = new FileWriter(R2.getAbsoluteFile(), true);
                        PrintWriter pw5 = new PrintWriter(fw5);
                        pw5.println(cadenas.get(i));
                        fw5.close();
                        contadorER1++;
                        txf2.setText(contadorER1 + "");
                        erAceptadas.add(cadenas.get(i));
                            }else{
                                if(cadenas.get(i).matches(ER5)){
                                    FileWriter fw6 = new FileWriter(R2.getAbsoluteFile(), true);
                        PrintWriter pw6 = new PrintWriter(fw6);
                        pw6.println(cadenas.get(i));
                        fw6.close();
                        contadorER1++;
                        txf2.setText(contadorER1 + "");
                        erAceptadas.add(cadenas.get(i));
                                
                                }else{
                                    if(cadenas.get(i).matches(ER6)){
                                    FileWriter fw7 = new FileWriter(R2.getAbsoluteFile(), true);
                        PrintWriter pw7 = new PrintWriter(fw7);
                        pw7.println(cadenas.get(i));
                        fw7.close();
                        contadorER1++;
                        txf2.setText(contadorER1 + "");
                        erAceptadas.add(cadenas.get(i));
                                    }else{
                                        if(cadenas.get(i).matches(ER7)){
                                            erAceptadas.add(cadenas.get(i));
                                        
                                        
                                        }else{
                            contador++;
                            FileWriter fw7 = new FileWriter(Rechazadas.getAbsoluteFile(), true);
                            PrintWriter pw7 = new PrintWriter(fw7);
                            pw7.println(cadenas.get(i));
                            fw7.close();
                            txfRechazadas.setText("" + contador);
                            erRechazadas.add(cadenas.get(i));
                                        }
                        }   }   }   }
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            
        }
        adMat();
        jtableER.setModel(new javax.swing.table.DefaultTableModel(mat,new String[]{"Aceptadas","Rechazadas"}));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtableER;
    private javax.swing.JTextArea txaEntrada;
    private javax.swing.JTextField txf1;
    private javax.swing.JTextField txf2;
    private javax.swing.JTextField txf3;
    private javax.swing.JTextField txfRechazadas;
    private javax.swing.JTextField txfRechazadas2;
    // End of variables declaration//GEN-END:variables
}
