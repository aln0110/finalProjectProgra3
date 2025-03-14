/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import entidades.articulos;
import entidades.carrito;
import entidades.cliente;
import entidades.empleados;
import entidades.venta;
import logica.logArticulo;
import logica.logCalculos;
import logica.logCliente;
import logica.logVenta;
import logica.logicaEmpleados;

/**
 *
 * @author Allan
 */
public class frmVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmVenta
     */
    //lista del carrito y la creo aqui para que los valores perdure
    private List<carrito>miCarrito = new ArrayList<>();
    


    //esta variable esta guarda el total
    private double total=0.0;

    //esta variable guarda la cantidad
    private int cantidadArticulos=0;


    public frmVenta() {
        initComponents();
        this.llenarComboBoxCliente();
        this.llenarComboBoxVendedor();
        this.completarTableModel();
        this.refrescarTabla();

        dtRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtRegistrosMouseClicked(evt);
            }
        });
            //Lista del carrito
       // List<venta>carrito = new ArrayList<>();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCedVendedor = new javax.swing.JTextField();
        cbCliente = new javax.swing.JComboBox<>();
        cbVendedor = new javax.swing.JComboBox<>();
        txtCedCliente = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtRegistros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dtCarrito = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbSubTotal = new javax.swing.JLabel();
        btnCalcularDescuento = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Venta");

        jLabel1.setText("Articulo");

        jLabel2.setText("Marca");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Cedula vendedor");

        jLabel5.setText("Cliente");

        jLabel6.setText("Cedula cliente");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Descuento");

        jLabel9.setText("Precio");

        txtArticulo.setEditable(false);

        txtMarca.setEditable(false);

        txtCedVendedor.setEditable(false);

        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        cbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVendedorActionPerformed(evt);
            }
        });

        txtCedCliente.setEditable(false);

        txtTotal.setEditable(false);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        dtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Articulo", "Marca", "Descripcion", "Categoria", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(dtRegistros);

        dtCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Articulo", "Marca", "Cantidad", "Precio"
            }
        ));
        dtCarrito.setEnabled(false);
        jScrollPane2.setViewportView(dtCarrito);

        jLabel10.setText("Carrito");

        jLabel11.setText("Inventario");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel12.setText("Sub total");

        jlTotal.setText("total");

        lbTotal.setText("SubTotal");

        lbSubTotal.setText("Total");

        btnCalcularDescuento.setText("Calcular");
        btnCalcularDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDescuentoActionPerformed(evt);
            }
        });

        jLabel13.setText("Cantidad de articulos");

        lbCantidad.setText("Cantidad");

        jLabel14.setText("ID");

        txtID.setEditable(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(433, 433, 433))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedVendedor)
                                    .addComponent(txtMarca)
                                    .addComponent(txtArticulo)
                                    .addComponent(txtCedCliente)
                                    .addComponent(txtCantidad)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(txtID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(58, 58, 58)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jlTotal))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCantidad)
                            .addComponent(lbTotal)
                            .addComponent(lbSubTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcularDescuento))
                            .addComponent(btnComprar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCedVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lbCantidad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotal)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularDescuento))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSubTotal)
                            .addComponent(jlTotal))
                        .addGap(18, 18, 18)
                        .addComponent(btnComprar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void llenarComboBoxCliente(){
        logCliente logCliente = new logCliente();
        List<cliente> miLista = logCliente.todosClientes();
        for (int i = 0; i < miLista.size(); i++) {
           cbCliente.addItem(miLista.get(i).getNombre()+" "+miLista.get(i).getApellidos());
      }
    }
    void llenarComboBoxVendedor(){
        logicaEmpleados logicaEmpleados =  new logicaEmpleados();
        List<empleados> miLista = logicaEmpleados.todosEmpleados();
        for (int i = 0; i < miLista.size(); i++) {
            cbVendedor.addItem(miLista.get(i).getNombre()+" "+miLista.get(i).getApellidos());          
        }
    }

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        logVenta logVenta = new logVenta();
        logArticulo logArticulo = new logArticulo();
        logCalculos logCalculos = new logCalculos();
        venta venta = new venta();

              
                if (txtArticulo.getText().isEmpty()||txtMarca.getText().isEmpty()||txtCedVendedor.getText().isEmpty()||txtCedCliente.getText().isEmpty()||txtCantidad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Debe llenar todos los campos", "Falta informacion", JOptionPane.WARNING_MESSAGE);
                } else {

                    venta.setVendedor(String.valueOf(cbVendedor.getSelectedItem()));
                    venta.setCedVendedor(txtCedVendedor.getText());
                    venta.setCliente(String.valueOf(cbCliente.getSelectedItem()));
                    venta.setCedCliente(txtCedCliente.getText());
                    venta.setCantidad(Integer.valueOf(lbCantidad.getText()));
                    if (txtDescuento.getText().isEmpty()) {
                        venta.setDescuento(0);
                    } else {
                        venta.setDescuento(Integer.parseInt(txtDescuento.getText()));
                    }
                    venta.setTotal(Double.parseDouble(lbTotal.getText()));
                    venta.setSubTotal(Double.parseDouble(lbSubTotal.getText()));

                    if (logVenta.crearVenta(venta)) {

                        for (int i = 0; i < miCarrito.size(); i++) {
                            logArticulo.nuevaCantidad(logCalculos.ActualizarCantidad(miCarrito.get(i).getCantidadOriginal(),miCarrito.get(i).getCantidad()),miCarrito.get(i).getId());
                        }
                        
                        this.limpiarTodo();
                        miCarrito.clear();
                        this.refrescarTabla();
                        this.refrescarCarrito();
                        JOptionPane.showMessageDialog(new JFrame(), "Se realizo la compra correctamente", "Exito",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Algo salio mal", "Error",JOptionPane.ERROR_MESSAGE);
                    }

                }
    
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        logCalculos logCalculos = new logCalculos();
        logArticulo logArticulo = new logArticulo();
        if (txtArticulo.getText().isEmpty()||txtMarca.getText().isEmpty()||txtCedVendedor.getText().isEmpty()||txtCedCliente.getText().isEmpty()||txtCantidad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Debe llenar todos los campos", "Falta informacion", JOptionPane.WARNING_MESSAGE);
                } else { 
                    if (logCalculos.calcularCantidad(logArticulo.obtenerCantidad(Integer.parseInt(txtID.getText())), Integer.parseInt(txtCantidad.getText()))) {
                        carrito carrito = new carrito();
                        carrito.setId(Integer.parseInt(txtID.getText()));
                        carrito.setArticulo(txtArticulo.getText());
                        carrito.setMarca(txtMarca.getText());
                        carrito.setCantidad(Integer.parseInt(txtCantidad.getText()));
                        carrito.setCantidadOriginal(logArticulo.obtenerCantidad(Integer.parseInt(txtID.getText()))); 
                        carrito.setPrecio(logCalculos.calcularPrecio(Double.parseDouble(txtTotal.getText()),Integer.parseInt(txtCantidad.getText())));
                        total = total + logCalculos.calcularPrecio(Double.parseDouble(txtTotal.getText()), Integer.parseInt(txtCantidad.getText()));
                        cantidadArticulos = cantidadArticulos + Integer.parseInt((txtCantidad.getText()));
                        lbTotal.setText(String.valueOf(total));
                        lbCantidad.setText(String.valueOf(cantidadArticulos));                       
                        miCarrito.add(carrito);
                        refrescarCarrito();
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Excede la cantidad diponible", "Excede el stock", JOptionPane.WARNING_MESSAGE);
                    
                    }
                }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDescuentoActionPerformed
        if (txtDescuento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar un descuento", "Falta informacion", JOptionPane.WARNING_MESSAGE);
        } else {
             logCalculos logCalculos = new logCalculos();
        lbSubTotal.setText(String.valueOf(logCalculos.calcularDescuento(total, Integer.parseInt(txtDescuento.getText()))));
        }
    }//GEN-LAST:event_btnCalcularDescuentoActionPerformed
     /*
      * estos metodos se encargan de consultar la lista de empleados, lo que hace es que se obtine el index del combo box y se hace u .get() recibe el index y me devuelve la cedula
      * esto para que el usuario no tenga que digitar alguna cedula
      */
  
       // estos eventops de  comboBox hace que cuando se seleccione un cliente o vendedor automaticamente se ponga la cedula en el txt
    private void cbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVendedorActionPerformed
        logicaEmpleados logicaEmpleados =  new logicaEmpleados();
        List<empleados> miLista = logicaEmpleados.todosEmpleados();
        // como la lista con la que se llena el combobox es igual a esta, solo ocupo seleccionar el index del combo box y hacer un get(getSelectedInedex) y me indica la cedula
        txtCedVendedor.setText(miLista.get(cbVendedor.getSelectedIndex()).getCedula());
    }//GEN-LAST:event_cbVendedorActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        logCliente logCliente = new logCliente();
        List<cliente> miLista = logCliente.todosClientes();
        txtCedCliente.setText(miLista.get(cbCliente.getSelectedIndex()).getCedula());
    }//GEN-LAST:event_cbClienteActionPerformed
    
    //este  metodo limpia la lista carrito la que se encarga de guardar cosas que se agrega y refresca el dtCarrito
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          this.limpiarTodo();
          miCarrito.clear();
          this.refrescarCarrito();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    void limpiarTodo(){
         total=0;
         cantidadArticulos=0;
         lbCantidad.setText(String.valueOf(cantidadArticulos));
         lbSubTotal.setText(String.valueOf(total));
         lbTotal.setText(String.valueOf(0));
         txtDescuento.setText("");

    }
    
    private void refrescarTabla(){
        TableModel tablaModel = this.completarTableModel();
        dtRegistros.setModel(tablaModel);
    }
    private TableModel completarTableModel(){
        try {
            logArticulo logArticulo = new logArticulo();
            List<articulos> miLista = logArticulo.todosArticulos();
            Object[] columnas = new Object[]{"ID", "Articulo", "Marca","Descripcion","Categoria","Cantidad","Precio"};
            Object[][] datos = new Object[miLista.size()][columnas.length];
            for (int i = 0; i < miLista.size(); i++) {
                datos[i][0] = miLista.get(i).getId();
                datos[i][1] = miLista.get(i).getNombre();
                datos[i][2] = miLista.get(i).getMarca();
                datos[i][3] = miLista.get(i).getDescripcion();
                datos[i][4] = miLista.get(i).getCategoria();
                datos[i][5] = miLista.get(i).getCantidad();
                datos[i][6] = miLista.get(i).getPrecioUnitario();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    private TableModel completarCarrito(){
        try {
            Object[] columnas = new Object[]{"Articulo", "Marca","Cantidad","Precio"};
            Object[][] datos = new Object[miCarrito.size()][columnas.length];
            for (int i = 0; i < miCarrito.size(); i++) {
                 datos[i][0] = miCarrito.get(i).getArticulo();
                 datos[i][1] = miCarrito.get(i).getMarca();
                 datos[i][2] = miCarrito.get(i).getCantidad();
                 datos[i][3] = miCarrito.get(i).getPrecio();
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    private void refrescarCarrito(){
        TableModel tablaModel = this.completarCarrito();
        dtCarrito.setModel(tablaModel);
    }
    //codigo para pasar datos del dt al txtBox
    private void dtRegistrosMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.mousePressed();
    }  
    private void mousePressed(){
        txtID.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),0).toString());
        txtArticulo.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),1).toString());
        txtMarca.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),2).toString());
        txtCantidad.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),5).toString());
        txtTotal.setText(dtRegistros.getValueAt(dtRegistros.getSelectedRow(),6).toString());
    }
    
    
                                          



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcularDescuento;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbVendedor;
    private javax.swing.JTable dtCarrito;
    private javax.swing.JTable dtRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbSubTotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedCliente;
    private javax.swing.JTextField txtCedVendedor;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
