/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import entidades.venta;
import logica.logCalculos;
import logica.logVenta;

/**
 *
 * @author Allan
 */
public class frmReporteVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmReporteVendedor
     */
    public frmReporteVendedor() {
        initComponents();
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
        dtRegistros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbArticulos = new javax.swing.JLabel();
        lbSubTotal = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte por vendedor");

        dtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Vendedor", "Cliente", "Descuento", "Cantidad", "Sub Total", "Total"
            }
        ));
        jScrollPane1.setViewportView(dtRegistros);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar vendedor");

        jLabel2.setText("Cantidad de articulos");

        jLabel3.setText("Sub total");

        jLabel4.setText("Total");

        lbArticulos.setText("Articulos");

        lbSubTotal.setText("Sub total");

        lbTotal.setText("Total");

        jLabel5.setText("Descuento");

        lbDescuento.setText("Descuento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscar)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescuento)
                            .addComponent(lbTotal)
                            .addComponent(lbSubTotal)
                            .addComponent(lbArticulos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbArticulos))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbDescuento))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbSubTotal))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbTotal))))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarTabla(){
        TableModel tablaModel = this.completarTableModel();
        dtRegistros.setModel(tablaModel);
    }    
private TableModel completarTableModel(){
try {       
          //  String variable;
            logVenta logVenta = new logVenta();
            List<venta> miLista = logVenta.ventaPorVendedor(txtCedula.getText());
            Object[] columnas = new Object[]{"ID", "Vendedor", "Cliente", "Cantidad", "Descuento", "SubTotal", "Total"};
            Object[][] datos = new Object[miLista.size()][columnas.length];
            for (int i = 0; i < miLista.size(); i++) {

  
               // if (miLista.get(i).getCedVendedor().equals(txtCedula.getText())) {
                    datos[i][0]=miLista.get(i).getId();
                    datos[i][1]=miLista.get(i).getVendedor();
                    datos[i][2]=miLista.get(i).getCliente();
                    datos[i][3]=miLista.get(i).getCantidad();
                    datos[i][4]=miLista.get(i).getDescuento();
                    datos[i][5]=miLista.get(i).getTotal();
                    datos[i][6]=miLista.get(i).getSubTotal();
                    
                    
                //}

                
            }
                 DefaultTableModel model = new DefaultTableModel(datos, columnas);
                   return model;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
}
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.completarTableModel();
        this.refrescarTabla();
        this.llenarDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    void llenarDatos() {
        logCalculos logCalculos = new logCalculos();
        logVenta logVenta = new logVenta();
        List<venta> miLista = logVenta.ventaPorVendedor(txtCedula.getText());
        lbArticulos.setText(String.valueOf(logCalculos.totalCantidad(miLista)));
        lbDescuento.setText(String.valueOf(logCalculos.totalDescuento(miLista)));
        lbSubTotal.setText(String.valueOf(logCalculos.subTotales(miLista)));
        lbTotal.setText(String.valueOf(logCalculos.totales(miLista)));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTable dtRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbArticulos;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbSubTotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
