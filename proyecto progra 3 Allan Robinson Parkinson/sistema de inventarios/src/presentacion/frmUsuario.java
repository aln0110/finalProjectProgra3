/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import entidades.empleados;
import logica.logSeguridad;
import logica.logicaEmpleados;

/**
 *
 * @author Allan
 */
public class frmUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUsuario
     */
    public frmUsuario() {
        initComponents();
         this.refrescarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtRegistros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Cedula");

        jLabel4.setText("Telefono");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario");

        jLabel6.setText("Password");

        dtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Telefono", "Usuario"
            }
        ));
        dtRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dtRegistros);

        btnBuscar.setText("Buscar ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCedula)
                    .addComponent(txtNumero)
                    .addComponent(txtUserName)
                    .addComponent(txtApellidos)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrear))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed
    private void refrescarTabla(){
        TableModel tablaModel = this.completarTableModel();
        dtRegistros.setModel(tablaModel);
    }
        private TableModel completarTableModel(){
        try {
            logicaEmpleados logicaEmpleados = new logicaEmpleados();
            List<empleados> miLista = logicaEmpleados.todosEmpleados();
            Object[] columnas = new Object[]{"Cédula", "Nombre", "Apellidos","Telefono","Usuario"};
            Object[][] datos = new Object[miLista.size()][columnas.length];
            for (int i = 0; i < miLista.size(); i++) {
                datos[i][0] = miLista.get(i).getCedula();
                datos[i][1] = miLista.get(i).getNombre();
                datos[i][2] = miLista.get(i).getApellidos();
                datos[i][3] = miLista.get(i).getTelefono();
                datos[i][4] = miLista.get(i).getUserName();
                
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
        } catch (Exception e) {
           System.out.println(e);
        }
         return null;
    }
    private void dtRegistrosMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.mousePressed();
    }  
    private void mousePressed(){
        txtCedula.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),0).toString());
        txtNombre.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),1).toString());
        txtApellidos.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),2).toString());
        txtNumero.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),3).toString());
        txtUserName.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),4).toString());


    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe llenar todos los campos", "Falta informacion", JOptionPane.WARNING_MESSAGE);
        } else {
            logicaEmpleados logicaEmpleados = new logicaEmpleados();
            empleados empleados = new empleados();
            empleados = logicaEmpleados.consultarEmpleado(txtCedula.getText());
            if (empleados==null) {
                JOptionPane.showMessageDialog(new JFrame(), "Algo salio mal", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                txtCedula.setText(empleados.getCedula());
                txtNombre.setText(empleados.getNombre());
                txtApellidos.setText(empleados.getApellidos());
                txtNumero.setText(empleados.getTelefono());
                txtUserName.setText(empleados.getUserName());
                txtPassword.setText("");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        if (txtCedula.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellidos.getText().isEmpty()||txtNumero.getText().isEmpty()||txtUserName.getText().isEmpty()||txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe llenar todos los campos", "Falta informacion", JOptionPane.WARNING_MESSAGE);
        } else {
            empleados empleados = new empleados();
            logicaEmpleados logicaEmpleados = new logicaEmpleados();
            empleados.setCedula(txtCedula.getText());
            empleados.setNombre(txtNombre.getText());
            empleados.setApellidos(txtApellidos.getText());
            empleados.setTelefono(txtNumero.getText());
            empleados.setUserName(txtUserName.getText());
            empleados.setPassword(logSeguridad.encriptar(txtPassword.getText()));
            if (logicaEmpleados.crearEmpleado(empleados)) {
                JOptionPane.showMessageDialog(new JFrame(), "Se guardo correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.refrescarTabla();
                } else {
                JOptionPane.showMessageDialog(new JFrame(), "Algo salio mal", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
         
        }
        this.refrescarTabla();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
       if (txtCedula.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellidos.getText().isEmpty()||txtNumero.getText().isEmpty()||txtUserName.getText().isEmpty()||txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe llenar todos los campos", "Falta informacion", JOptionPane.WARNING_MESSAGE);
        } else {
            empleados empleados = new empleados();
            logicaEmpleados logicaEmpleados = new logicaEmpleados();
            empleados.setCedula(txtCedula.getText());
            empleados.setNombre(txtNombre.getText());
            empleados.setApellidos(txtApellidos.getText());
            empleados.setTelefono(txtNumero.getText());
            empleados.setUserName(txtUserName.getText());
            empleados.setPassword(logSeguridad.encriptar(txtPassword.getText()));
            if (logicaEmpleados.actualizarEmpleado(empleados)) {
                JOptionPane.showMessageDialog(new JFrame(), "Se actualizo correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.refrescarTabla();
                } else {
                JOptionPane.showMessageDialog(new JFrame(), "Algo salio mal", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            this.refrescarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        logicaEmpleados logicaEmpleados = new logicaEmpleados();
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar una cedula", "Falta informacion", JOptionPane.WARNING_MESSAGE);
        } else {
            if (logicaEmpleados.eliminarEmpleado(txtCedula.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Se elimino correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.refrescarTabla();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Algo salio mal", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.refrescarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTable dtRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
