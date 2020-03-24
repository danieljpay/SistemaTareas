/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author plupy
 */
public class FrMenuPrincipal extends javax.swing.JFrame {

    public DefaultListModel modeloListaNombres, modeloListaTareas;
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    
    /**
     * Creates new form MenuPrincipal
     */
    public FrMenuPrincipal() {
        initComponents();
        
        //se crean los modelos de los jList
        modeloListaNombres = new DefaultListModel();
        modeloListaTareas = new DefaultListModel();
        
        //se setea los modelos a la interfaz de las listas
        jListNombres.setModel(modeloListaNombres);
        jListTareas.setModel(modeloListaTareas);
    }
    
    //funcion agregar dato a un modelo de lista
    public void agregarDato(String dato, DefaultListModel lista){
        lista.addElement(dato);
    }
    
    //funcion eliminar dato de un modelo de lista
    public void eliminarDato(int index, DefaultListModel lista){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente desea eliminar este nombre?");
        if(respuesta == 0){
            lista.remove(index);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNombres = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();
        btnEliminarPersona = new javax.swing.JButton();
        lbCantidadQueDebe = new javax.swing.JLabel();
        lbTareasPendientes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNombres = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListTareas = new javax.swing.JList<>();
        btnAgregarNombre = new javax.swing.JButton();
        btnEliminarTarea = new javax.swing.JButton();
        btnAgregarTarea = new javax.swing.JButton();
        txtNuevaPersona = new javax.swing.JTextField();
        txtAbono = new javax.swing.JTextField();
        lbAbono = new javax.swing.JLabel();
        txtCantidadQueDebe = new javax.swing.JLabel();
        lbNuevaPersona = new javax.swing.JLabel();
        txtTareaNueva = new javax.swing.JTextField();
        lbTareaNueva = new javax.swing.JLabel();
        lbIngresaSuPrecio = new javax.swing.JLabel();
        txtIngresaSuPrecio = new javax.swing.JTextField();
        txtIngresaFecha = new javax.swing.JTextField();
        lbIngresaFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTitulo.setText("NicoleTareas");

        lbNombres.setText("Nombres");

        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });

        btnEliminarPersona.setText("Eliminar persona");
        btnEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersonaActionPerformed(evt);
            }
        });

        lbCantidadQueDebe.setText("Cantidad que debe: $");

        lbTareasPendientes.setText("Tareas pendientes:");

        jListNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListNombresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListNombres);

        jScrollPane3.setViewportView(jListTareas);

        btnAgregarNombre.setText("Agregar nombre");
        btnAgregarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNombreActionPerformed(evt);
            }
        });

        btnEliminarTarea.setText("Elliminar tarea");
        btnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaActionPerformed(evt);
            }
        });

        btnAgregarTarea.setText("Agregar tarea");
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });

        lbAbono.setText("¿desea abonar?");

        txtCantidadQueDebe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbNuevaPersona.setText("Ingrese nombre de la nueva persona:");

        lbTareaNueva.setText("Ingresa nombre de la tarea nueva:");

        lbIngresaSuPrecio.setText("Ingresa su precio");

        lbIngresaFecha.setText("Ingresa fecha límite:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombres)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarPersona))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(btnAgregarNombre))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNuevaPersona)
                                .addComponent(txtNuevaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAbono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 299, Short.MAX_VALUE)
                                .addComponent(btnAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTareasPendientes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminarTarea)
                                .addComponent(btnAgregarTarea)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbCantidadQueDebe)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtCantidadQueDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbAbono))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTareaNueva)
                            .addComponent(txtTareaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngresaSuPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIngresaSuPrecio))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIngresaFecha)
                            .addComponent(txtIngresaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTareaNueva)
                                    .addComponent(lbIngresaSuPrecio)
                                    .addComponent(lbIngresaFecha)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNuevaPersona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnAgregarTarea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTareasPendientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminarTarea)
                                        .addGap(0, 59, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbCantidadQueDebe))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTareaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIngresaSuPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIngresaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNuevaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarNombre)
                                .addGap(11, 11, 11)
                                .addComponent(lbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarPersona)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lbAbono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidadQueDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNombreActionPerformed
        //Botón agregar nombre
        agregarDato(txtNuevaPersona.getText(), modeloListaNombres); //se agrega el nombre a la vista de la lista
        String nombrePersona = txtNuevaPersona.getText();
        Persona nuevaPersona = new Persona(nombrePersona);
        listaPersonas.add(nuevaPersona);  //se crea la persona y se mete al arryalist
        txtCantidadQueDebe.setText(nuevaPersona.getDineroAPagar()+"");
        txtNuevaPersona.setText("");    //setea jText en blanco
    }//GEN-LAST:event_btnAgregarNombreActionPerformed

    private void btnEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersonaActionPerformed
        //Botón eliminar nombre
        listaPersonas.remove(jListNombres.getSelectedIndex());  //se elimina la persona del array de personas
        eliminarDato(jListNombres.getSelectedIndex(), modeloListaNombres);  //elimina el nombre seleccionado de la lista grafica de nombres
    }//GEN-LAST:event_btnEliminarPersonaActionPerformed

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        //Botón agregar tarea
        int personaSeleccionada = jListNombres.getSelectedIndex();     //índice de la persona dentro de la lista
        Tarea nuevaTarea = new Tarea(txtTareaNueva.getText(), Integer.parseInt(txtIngresaSuPrecio.getText()), txtIngresaFecha.getText());    //creación del objeto tarea
        listaPersonas.get(personaSeleccionada).asignarTarea(nuevaTarea);    //le asignamos la tarea a la persona dentro de la lista con el índice
        //Incrementa el dinero de la persona con cada tarea que se le agregue
        listaPersonas.get(personaSeleccionada).incrementarDineroAPagar(Integer.parseInt(txtIngresaSuPrecio.getText()));
        txtCantidadQueDebe.setText(listaPersonas.get(personaSeleccionada).getDineroAPagar()+"");
        //reiniciamos los campos
        txtTareaNueva.setText("");
        txtIngresaSuPrecio.setText("");
        txtIngresaFecha.setText("");
    }//GEN-LAST:event_btnAgregarTareaActionPerformed

    private void btnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaActionPerformed
        //Botón eliminar tarea
        int personaAEliminarTarea = jListNombres.getSelectedIndex();
        int tareaAEliminar = jListTareas.getSelectedIndex();
        listaPersonas.get(personaAEliminarTarea).eliminarTarea(tareaAEliminar);
        
    }//GEN-LAST:event_btnEliminarTareaActionPerformed

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        //Botón abonar
        int personaAAbonar = jListNombres.getSelectedIndex();
        int cantidadAAbonar = Integer.parseInt(txtAbono.getText());
        listaPersonas.get(personaAAbonar).abonar(cantidadAAbonar);
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void jListNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListNombresMouseClicked
        //Click en la lista de nombres
        int indiceLista = jListNombres.getSelectedIndex();
        txtCantidadQueDebe.setText(listaPersonas.get(indiceLista).getDineroAPagar()+"");
        modeloListaTareas.clear();
        for(int i=0; i<listaPersonas.get(indiceLista).getTareas().size(); i++){
            agregarDato(listaPersonas.get(indiceLista).getTareas().get(i).getNombre(), modeloListaTareas);
        }
        txtCantidadQueDebe.setText(listaPersonas.get(indiceLista).getDineroAPagar()+"");
    }//GEN-LAST:event_jListNombresMouseClicked

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
            java.util.logging.Logger.getLogger(FrMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnAgregarNombre;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JList<String> jListNombres;
    private javax.swing.JList<String> jListTareas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAbono;
    private javax.swing.JLabel lbCantidadQueDebe;
    private javax.swing.JLabel lbIngresaFecha;
    private javax.swing.JLabel lbIngresaSuPrecio;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbNuevaPersona;
    private javax.swing.JLabel lbTareaNueva;
    private javax.swing.JLabel lbTareasPendientes;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JLabel txtCantidadQueDebe;
    private javax.swing.JTextField txtIngresaFecha;
    private javax.swing.JTextField txtIngresaSuPrecio;
    private javax.swing.JTextField txtNuevaPersona;
    private javax.swing.JTextField txtTareaNueva;
    // End of variables declaration//GEN-END:variables
}