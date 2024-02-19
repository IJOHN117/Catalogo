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

        //panel registro de Clientes
        JPanel panelClientes = new JPanel();

        //panel registro de Productos
        JPanel panelProductos = new JPanel();



        //sistema de muestra y cierre
        VentanaC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        VentanaC.setVisible(true);
    }
}
