package org.example.interaccion;
import javax.swing.*;
import java.awt.*;


public class Ventana {
    public static void main(String[] args) {
        //Creacion y Edicion de Ventana Principal-----------------------------------------------------------------------
        JFrame VentanaC = new JFrame();
        VentanaC.setSize(1920, 1080);
        VentanaC.setBackground(Color.white);
        VentanaC.setResizable(true);

        ImageIcon icono = new ImageIcon("C://Users//Jsanc//IdeaProjects//EDAD2023//Catalogo//src//main//java//org//example//LOGO-VERTICAL-TECNM.png");
        VentanaC.setIconImage(icono.getImage());

        Font fuenteArial40 = new Font("Arial Narrow", Font.BOLD, 40);

        Font fuenteArial30 = new Font("Arial", Font.BOLD, 30);
        Font fuenteArial20 = new Font("Arial", Font.BOLD, 20);
        Font fuenteArial10 = new Font("Arial", Font.BOLD, 10);

        //panel General con Gridlayout
        JPanel panelGeneral = new JPanel();
        VentanaC.add(panelGeneral);
        panelGeneral.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        panelGeneral.setBackground(Color.lightGray);

        //Panel Encabezado----------------------------------------------------------------------------------------------
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setBackground(Color.decode("#BF75E5"));
        JLabel lblEncabezado = new JLabel("Catalogo de clientes");
        lblEncabezado.setFont(fuenteArial40);
        lblEncabezado.setHorizontalTextPosition(SwingConstants.LEFT);
        panelEncabezado.add(lblEncabezado);
        VentanaC.add(panelEncabezado,BorderLayout.NORTH);

        //Panel Cuerpo--------------------------------------------------------------------------------------------------
        //panel registro de ciudades
        JPanel panelCiudades = new JPanel();
        JLabel lblEncabezadoC = new JLabel("Registro de Ciudades");
        lblEncabezadoC.setFont(fuenteArial30);
        panelCiudades.add(lblEncabezadoC, BorderLayout.NORTH);

        JLabel lblNombre_Ciudades = new JLabel("Nombre de la ciudad");
        lblNombre_Ciudades.setFont(fuenteArial20);
        JTextField jtxNombre_Ciudades = new JTextField(1);
        jtxNombre_Ciudades.setFont(fuenteArial20);
        panelCiudades.add(lblNombre_Ciudades);
        panelCiudades.add(jtxNombre_Ciudades);

        JLabel lblCodigo_Postal = new JLabel("Codigo postal");
        lblNombre_Ciudades.setFont(fuenteArial20);
        JTextField jtxCodigo_Postal = new JTextField(1);
        jtxCodigo_Postal.setFont(fuenteArial20);
        panelCiudades.add(lblCodigo_Postal);
        panelCiudades.add(jtxCodigo_Postal);

        JButton jBtnRegistrarCiudad = new JButton("Registrar");
        panelCiudades.add(jBtnRegistrarCiudad, BorderLayout.SOUTH);

        //panel registro de Estados
        JPanel panelEstados = new JPanel();
        JLabel lblEncabezadoE = new JLabel("Registro de Estados");
        lblEncabezadoE.setFont(fuenteArial30);
        panelEstados.add(lblEncabezadoE, BorderLayout.NORTH);

        JLabel lblNombre_Estados = new JLabel("Nombre del Estado");
        lblNombre_Estados.setFont(fuenteArial20);
        JTextField jtxNombre_Estados = new JTextField(1);
        jtxNombre_Estados.setFont(fuenteArial20);
        panelEstados.add(lblNombre_Estados);
        panelEstados.add(jtxNombre_Estados);

        JLabel lblClave = new JLabel("Clave");
        lblClave.setFont(fuenteArial20);
        JTextField jtxClave = new JTextField(1);
        jtxClave.setFont(fuenteArial20);
        panelEstados.add(lblClave);
        panelEstados.add(jtxClave);

        JButton jBtnRegistrarEstados = new JButton("Registrar");
        panelEstados.add(jBtnRegistrarEstados, BorderLayout.SOUTH);

        //panel registro de Proveedores
        JPanel panelProveedores = new JPanel();
        JLabel lblEncabezadoP = new JLabel("Registro de Proveedores");
        lblEncabezadoP.setFont(fuenteArial30);
        panelProveedores.add(lblEncabezadoP, BorderLayout.NORTH);

        JLabel lblNobre_Proveedor = new JLabel("Nombre del Proveedor");
        lblNobre_Proveedor.setFont(fuenteArial20);
        JTextField jtxNobre_Proveedor = new JTextField(1);
        jtxNobre_Proveedor.setFont(fuenteArial20);
        panelProveedores.add(lblNobre_Proveedor);
        panelProveedores.add(jtxNobre_Proveedor);

        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setFont(fuenteArial20);
        JTextField jtxDireccion = new JTextField(1);
        jtxDireccion.setFont(fuenteArial20);
        panelProveedores.add(lblDireccion);
        panelProveedores.add(jtxDireccion);

        JLabel lblNum_Telef = new JLabel("Numero Telefonoco");
        lblNum_Telef.setFont(fuenteArial20);
        JTextField jtxNum_Telef = new JTextField(1);
        jtxNum_Telef.setFont(fuenteArial20);
        panelProveedores.add(lblNum_Telef);
        panelProveedores.add(jtxNum_Telef);

        JButton jBtnRegistrarProveedores = new JButton("Registrar");
        panelProveedores.add(jBtnRegistrarProveedores, BorderLayout.SOUTH);


        //panel registro de Clientes
        JPanel panelClientes = new JPanel();
        JLabel lblEncabezadoCl = new JLabel("Registro de Clientes");
        lblEncabezadoCl.setFont(fuenteArial30);
        panelClientes.add(lblEncabezadoCl, BorderLayout.NORTH);

        JLabel lblNombre_Completo = new JLabel("Nombre Completo");
        lblNombre_Completo.setFont(fuenteArial20);
        JTextField jtxNombre_Completo = new JTextField(1);
        jtxNombre_Completo.setFont(fuenteArial20);
        panelClientes.add(lblNombre_Completo);
        panelClientes.add(jtxNombre_Completo);

        JLabel lblNum_Telef_Clientes = new JLabel("Numero Telefonoco");
        lblNum_Telef_Clientes.setFont(fuenteArial20);
        JTextField jtxNum_Telef_Clientes = new JTextField(1);
        jtxNum_Telef_Clientes.setFont(fuenteArial20);
        panelClientes.add(lblNum_Telef_Clientes);
        panelClientes.add(jtxNum_Telef_Clientes);

        JLabel lblCorreo_Elec = new JLabel("Correo Electronico");
        lblCorreo_Elec.setFont(fuenteArial20);
        JTextField jtxCorreo_Elec = new JTextField(1);
        jtxCorreo_Elec.setFont(fuenteArial20);
        panelClientes.add(lblCorreo_Elec);
        panelClientes.add(jtxCorreo_Elec);

        JLabel lblEstado = new JLabel("Estado donde recide");
        lblEstado.setFont(fuenteArial20);
        JComboBox <String> jCmbEstados = new JComboBox<>();
        jCmbEstados.setFont(fuenteArial10);
        jCmbEstados.addItem("Aguascalientes");
        jCmbEstados.addItem("Baja California");
        jCmbEstados.addItem("Campeche");
        jCmbEstados.addItem("Chiapas");
        jCmbEstados.addItem("Chihuahua");
        jCmbEstados.addItem("Ciudad de México");
        jCmbEstados.addItem("Coahuila");
        jCmbEstados.addItem("Colima");
        jCmbEstados.addItem("Durango");
        jCmbEstados.addItem("Guanajuato");
        jCmbEstados.addItem("Jalisco");
        jCmbEstados.addItem("Michoacán");
        jCmbEstados.addItem("Oaxaca");
        jCmbEstados.addItem("Veracruz");

        JLabel lblCiudad = new JLabel("Ciudad donde recide");
        lblCiudad.setFont(fuenteArial20);
        JTextField jtxCiudad = new JTextField(1);
        jtxCiudad.setFont(fuenteArial20);
        panelClientes.add(lblCiudad);
        panelClientes.add(jtxCiudad);

        JLabel lblDireccion_Cliente = new JLabel("Direccion");
        lblDireccion_Cliente.setFont(fuenteArial20);
        JTextField jtxDireccion_Cliente = new JTextField(1);
        jtxDireccion_Cliente.setFont(fuenteArial20);
        panelClientes.add(lblDireccion_Cliente);
        panelClientes.add(jtxDireccion_Cliente);


        JButton jBtnRegistrarClientes = new JButton("Registrar");
        panelClientes.add(jBtnRegistrarClientes, BorderLayout.SOUTH);

        //panel registro de Productos
        JPanel panelProductos = new JPanel();
        JLabel lblEncabezadoPr = new JLabel("Registro de Proveedores");
        lblEncabezadoPr.setFont(fuenteArial30);
        panelProductos.add(lblEncabezadoPr, BorderLayout.NORTH);

        JLabel lblNombre_Producto = new JLabel("Nombre del Producto");
        lblNombre_Producto.setFont(fuenteArial20);
        JTextField jtxNombre_Producto = new JTextField(1);
        jtxNombre_Producto.setFont(fuenteArial20);
        panelClientes.add(lblNombre_Producto);
        panelClientes.add(jtxNombre_Producto);

        JLabel lblClave_Producto = new JLabel("Clave del producto");
        lblClave_Producto.setFont(fuenteArial20);
        JTextField jtxClave_Producto = new JTextField(1);
        jtxClave_Producto.setFont(fuenteArial20);
        panelClientes.add(lblClave_Producto);
        panelClientes.add(jtxClave_Producto);

        JLabel lblPrecio_Producto = new JLabel("Precio del producto");
        lblPrecio_Producto.setFont(fuenteArial20);
        JTextField jtxPrecio_Producto = new JTextField(1);
        jtxPrecio_Producto.setFont(fuenteArial20);
        panelClientes.add(lblPrecio_Producto);
        panelClientes.add(jtxPrecio_Producto);

        JLabel lblCategoria_Producto = new JLabel("Categoría del producto");
        lblCategoria_Producto.setFont(fuenteArial20);
        JTextField jtxCategoria_Producto = new JTextField(1);
        jtxCategoria_Producto.setFont(fuenteArial20);
        panelClientes.add(lblCategoria_Producto);
        panelClientes.add(jtxCategoria_Producto);

        JLabel lblProveedor_Producto = new JLabel("Proveedor del producto");
        lblProveedor_Producto.setFont(fuenteArial20);
        JTextField jtxProveedor_Producto = new JTextField(1);
        jtxProveedor_Producto.setFont(fuenteArial20);
        panelClientes.add(lblProveedor_Producto);
        panelClientes.add(jtxProveedor_Producto);


        JButton jBtnRegistrarProductos = new JButton("Registrar");
        panelClientes.add(jBtnRegistrarProductos, BorderLayout.SOUTH);


        //sistema de muestra y cierre
        VentanaC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        VentanaC.setVisible(true);
    }
}
