package chatcliente;




import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.ScrollPaneConstants;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pc
 */
public class FrameCliente extends javax.swing.JFrame {
    JFileChooser dlg;

    /**
     * Creates new form FrameCliente
     */
    
    Cliente cliente;
    public FrameCliente() {
        initComponents();
        //Instanciamos la variable cliente pasandole el panel y activamos el hilo
        cliente= new Cliente(peMsg);
        Thread hilo = new Thread(cliente);
        hilo.start();
        
        //Hacemos que el scroll baje automaticamente con los mensajes
        jScrollPane1.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
            public void adjustmentValueChanged(AdjustmentEvent e) {  
                e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
            }
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        peMsg = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        txNom = new javax.swing.JTextField();
        txMsg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        peMsg.setContentType("text/html"); // NOI18N
        peMsg.setText(" <html>   <head>    </head>   <body>     <p style=\"margin-top: 0\">            </p>   </body> </html> ");
        jScrollPane1.setViewportView(peMsg);
        peMsg.getAccessibleContext().setAccessibleDescription("text/plain");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText(" Remitente");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMsgActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("ENVIAR MENSAJE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Guardar Mensaje");

        jButton2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("ENVIAR ARCHIVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Sacamos el nombre y el mensaje de las cajas de texto
        String nombre = txNom.getText();
        
        if(nombre.trim().length() == 0)nombre = "SinNombre";
        String msg = txMsg.getText();
        
       LocalTime horaActual = LocalTime.now();
        
        DateTimeFormatter formatoHora =  DateTimeFormatter.ofPattern("HH:mm");

        String horaFormateada = horaActual.format(formatoHora);
        
//        if(nombre.trim().length() == 0)return;
        //Limpiamos el cuadro de texto del mensaje
        
        txMsg.setText("");
        
        //Utilizamos la funcion del cliente para enviar el mensaje y darle formate al mensaje
        cliente.enviarMsg("<h4>"+horaFormateada+"<h3><FONT COLOR=\"blue\">"+ nombre+"</FONT>"+ ":  </strong> "+msg +"<br> ");
       // cliente.enviarMsg("</h3><strong>"+nombre+": </strong> "+msg+"</h3><strong> "+horaFormateada +"<br> ");
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       /* String NombreCrear = txtNombre.getText();
        String Carpeta= System.getProperty("D:\\GuardarTextosPrueba" );
        String direccionCompleta = Carpeta + "/" + NombreCrear + ".text";
        FileWriter direccion= null;
        try{
            direccion=new FileWriter(direccionCompleta);
            
        }
        catch(IOException ex){
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE
        },null, ex);
        }
        try{
            BufferedWriter escritor = new BufferedWriter (direccion);
            escritor.write(peMsg.getText());
            escritor.close();
            
        }
        catch(Exception ex){
        
            
                    }
        
        */
       
         try{
       JFileChooser filechooser = new JFileChooser();
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt",);
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "htm");
       filechooser.setFileFilter(filter);
       filechooser.showSaveDialog(filechooser);
       File guarda = filechooser.getSelectedFile();
       

       if(guarda != null){
      try (
      /*guardamos el archivo y le damos el formatO*/
              
          FileWriter save = new FileWriter(guarda+".htm")) {
               
          save.write(peMsg.getText());
          }
       }
   }catch(IOException ex){}
   //JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado")
   
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMsgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    /*String nombre = txNom.getText();
        
        if(nombre.trim().length() == 0)nombre = "SinNombre";
        //String msg = txMsg.getText();
        
       JFileChooser file = new JFileChooser();
       file.showOpenDialog(this);
       File archivo =file.getSelectedFile();
       
       
       if(archivo != null)
       {
           {
            LocalTime horaActual = LocalTime.now();
        
        DateTimeFormatter formatoHora =  DateTimeFormatter.ofPattern("HH:mm");

        String horaFormateada = horaActual.format(formatoHora);
           txMsg.setText("");
           {
 
 
       }
        
        //Utilizamos la funcion del cliente para enviar el archivo 
        cliente.enviarMsg("<h3>"+horaFormateada+"<h3><FONT COLOR=\"blue\"> "+nombre+"</FONT>" + ":  </strong>"  + "<u><FONT COLOR=\"navy\">"+archivo+"</FONT>" +"<br> ");
     
           }*/
        
       
       
          

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane peMsg;
    private javax.swing.JTextField txMsg;
    private javax.swing.JTextField txNom;
    // End of variables declaration//GEN-END:variables
}
