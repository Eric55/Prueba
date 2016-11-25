/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static programa.Articulos.r;



/**
 *
 * @author W7Entornos
 */
public class Articulos extends javax.swing.JFrame {

    static public ResultSet r;
   
    public Articulos() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select A.*, F.NOMBRE from articulos A, fabricantes F WHERE F.COD_FABRICANTE=A.FABRICANTE";
        r = s.executeQuery(query);
        r.first();
        cod_articulo.setText(r.getString("COD_ARTICULO"));
        articulo.setText(r.getString("ARTICULO"));
        fabricante.setText(r.getString("F.NOMBRE"));
        peso.setText(r.getString("PESO"));
        categoria.setText(r.getString("CATEGORIA"));
        precioVenta.setText(r.getString("PRECIO_VENTA"));
        precioCoste.setText(r.getString("PRECIO_COSTE"));
        existencias.setText(r.getString("EXISTENCIAS"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cod_articulo = new javax.swing.JTextField();
        articulo = new javax.swing.JTextField();
        fabricante = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        precioCoste = new javax.swing.JTextField();
        existencias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        primero = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cod_articulo.setEditable(false);

        jLabel1.setText("Codigo Articulo");

        jLabel2.setText("Articulo");

        jLabel3.setText("Fabricante");

        jLabel4.setText("Peso");

        jLabel5.setText("Categoria");

        jLabel6.setText("Precio Venta");

        jLabel7.setText("Precio Coste");

        jLabel8.setText("Existencias");

        primero.setText("Primero");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        ultimo.setText("Último");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(147, 191, 38));
        jLabel9.setText("ARTICULOS");

        guardar.setText("Guardar");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(borrar)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente)
                                .addGap(71, 71, 71)
                                .addComponent(ultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editar)
                                        .addGap(18, 18, 18)
                                        .addComponent(guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(nuevo)
                                        .addGap(29, 29, 29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(categoria, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fabricante, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(precioCoste, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                            .addComponent(cod_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(existencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(precioVenta)
                                        .addComponent(articulo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atras)))))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(primero)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cod_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(existencias, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(ultimo)
                    .addComponent(primero)
                    .addComponent(siguiente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(nuevo)
                    .addComponent(atras)
                    .addComponent(guardar)
                    .addComponent(cancelar)
                    .addComponent(borrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        try {
            r.first();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricante.class.getName()).log(Level.SEVERE, null, ex);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_primeroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
 try {
            r.previous();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricante.class.getName()).log(Level.SEVERE, null, ex);
        }                  // TODO add your handling code here:
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
 try {
            r.next();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricante.class.getName()).log(Level.SEVERE, null, ex);
        }                  // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
 try {
            r.last();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricante.class.getName()).log(Level.SEVERE, null, ex);
        }                  // TODO add your handling code here:
    }//GEN-LAST:event_ultimoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
      try {
        String vCod_Articulo, vArticulo, vCategoria, vPeso, vFabricante, vPrecioVenta, vPrecioCoste, vExistencias;
        vCod_Articulo = cod_articulo.getText();
        vArticulo = articulo.getText();
        vCategoria = categoria.getText();
        vPeso = peso.getText();
        vFabricante = fabricante.getText();
        vPrecioVenta = precioVenta.getText();
        vPrecioCoste = precioCoste.getText();
        vExistencias = existencias.getText();
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user,pass);
        Statement s = connection.createStatement();
        String query = "update articulos set EXISTENCIAS='" + vExistencias + "', ARTICULO='" + vArticulo + "', CATEGORIA='" + vCategoria + "'PESO='" + vPeso + "', FABRICANTE='" + vFabricante + "', PRECIO_COSTE='" + vPrecioCoste + "', PRECIO_VENTA='" + vPrecioVenta + "' WHERE COD_ARTICULO='" + vCod_Articulo +"'";
        int resultado = s.executeUpdate(query);
        r.refreshRow();
    } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }// TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    Menu cli = new Menu();
    cli.setLocationRelativeTo (null);
    this.setVisible(false);
       cli.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
           cod_articulo.setEditable(true);
           anterior.setEnabled(false);
           nuevo.setEnabled(false);
           editar.setEnabled(false);
           siguiente.setEnabled(false);
           primero.setEnabled(false);
           ultimo.setEnabled(false);
           borrar.setEnabled(false);
           guardar.setEnabled(true);
           guardar.setVisible(true);
           cancelar.setEnabled(true);
           cancelar.setVisible(true);
           atras.setEnabled(false);
           cod_articulo.setText(null);
           articulo.setText(null);
           peso.setText(null);
           fabricante.setText(null);
           categoria.setText(null);
           precioVenta.setText(null);
           precioCoste.setText(null); 
           existencias.setText(null); // TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
try {
        String vCod_Articulo, vArticulo, vCategoria, vPeso, vFabricante, vPrecioVenta, vPrecioCoste, vExistencias;
        vCod_Articulo = articulo.getText();
        vArticulo = articulo.getText();
        vCategoria = categoria.getText();
        vPeso = peso.getText();
        vFabricante = fabricante.getText();
        vPrecioVenta = precioVenta.getText();
        vPrecioCoste = precioCoste.getText();
        vExistencias = existencias.getText();
            String url = "jdbc:mysql://localhost:3306/bases";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "insert into articulos values ('" + vCod_Articulo + "','" + vArticulo + "','" + vFabricante + "','" + vPeso + "','" + vCategoria + "','" + vExistencias + "','" + vPrecioVenta + "','" + vPrecioCoste + "')";
            int resultado = s.executeUpdate(query);
            String query2 = "select * from articulos";
            r = s.executeQuery(query2);
            r.first();        

        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cod_articulo.setEditable(false);
            nuevo.setEnabled(true);
            editar.setEnabled(true);
            anterior.setEnabled(true);
            siguiente.setEnabled(true);
            primero.setEnabled(true);
            ultimo.setEnabled(true);
            borrar.setEnabled(true);
            guardar.setVisible(false);
            cancelar.setVisible(false);
            guardar.setEnabled(false);
            cancelar.setEnabled(false);
            atras.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
try {
            cod_articulo.setEditable(false);
            nuevo.setEnabled(true);
            editar.setEnabled(true);
            anterior.setEnabled(true);
            siguiente.setEnabled(true);
            primero.setEnabled(true);
            ultimo.setEnabled(true);
            borrar.setEnabled(true);
            guardar.setVisible(false);
            cancelar.setVisible(false);
            guardar.setEnabled(false);
            atras.setEnabled(true);
            cancelar.setEnabled(false);
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
                      
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed
    }
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
    try {
        String vCod_Articulo;
            vCod_Articulo=cod_articulo.getText();
            
            String url = "jdbc:mysql://localhost:3306/bases";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement s = connection.createStatement();
            String query = "DELETE FROM articulos WHERE COD_ARTICULO='"+ vCod_Articulo + "'";
        
            int resultado = s.executeUpdate(query);
       
            String query2 = "select * from articulos";
            r = s.executeQuery(query2);
            r.first();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            fabricante.setText(r.getString("F.NOMBRE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precioVenta.setText(r.getString("PRECIO_VENTA"));
            precioCoste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
} catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Articulos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JTextField articulo;
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField cod_articulo;
    private javax.swing.JButton editar;
    private javax.swing.JTextField existencias;
    private javax.swing.JTextField fabricante;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField precioCoste;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JButton primero;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables

}