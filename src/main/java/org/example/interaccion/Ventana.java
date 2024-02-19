package org.example.interaccion;
import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.*;


public class Ventana {
    public static void main(String[] args) {
        //Creacion y Edicion de Ventana Principal-----------------------------------------------------------------------
        JFrame VentanaC = new JFrame();
        VentanaC.setSize(1920, 1080);
        VentanaC.setBackground(Color.white);
        VentanaC.setResizable(true);

        //Para mostrar la ventana centrada en pantalla
        VentanaC.setLocationRelativeTo(null);

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
        panelCiudades.setLayout(new BorderLayout());

        JPanel panelCuerpoCiudades = new JPanel();
        panelCuerpoCiudades.setLayout(new BoxLayout(panelCuerpoCiudades, Y_AXIS));

        JPanel panelEncabezadoCiudades = new JPanel();
        JLabel lblEncabezadoC = new JLabel("Registro de Ciudades");
        lblEncabezadoC.setFont(fuenteArial30);
        panelEncabezadoCiudades.add(lblEncabezadoC);
        panelCuerpoCiudades.add(panelEncabezadoCiudades);

        JPanel panelNombreCiudades = new JPanel();
        JLabel lblNombre_Ciudades = new JLabel("Nombre de la ciudad: ");
        lblNombre_Ciudades.setFont(fuenteArial20);
        JTextField jtxNombre_Ciudades = new JTextField(20);
        jtxNombre_Ciudades.setFont(fuenteArial20);
        panelNombreCiudades.add(lblNombre_Ciudades);
        panelNombreCiudades.add(jtxNombre_Ciudades);
        panelCuerpoCiudades.add(panelNombreCiudades);

        JPanel panelCodigoPostal = new JPanel();
        JLabel lblCodigo_Postal = new JLabel("Codigo postal:            ");
        lblCodigo_Postal.setFont(fuenteArial20);
        JTextField jtxCodigo_Postal = new JTextField(20);
        jtxCodigo_Postal.setFont(fuenteArial20);
        panelCodigoPostal.add(lblCodigo_Postal);
        panelCodigoPostal.add(jtxCodigo_Postal);
        panelCuerpoCiudades.add(panelCodigoPostal);

        panelCiudades.add("Center",panelCuerpoCiudades);

        //panel registro de Estados
        JPanel panelEstados = new JPanel();
        panelEstados.setLayout(new BorderLayout());

        JPanel panelCuerpoEstados = new JPanel();
        panelCuerpoEstados.setLayout(new BoxLayout(panelCuerpoEstados, Y_AXIS));

        JPanel panelEncabezadoE = new JPanel();
        JLabel lblEncabezadoE = new JLabel("Registro de Estados");
        lblEncabezadoE.setFont(fuenteArial30);
        panelEncabezadoE.add(lblEncabezadoE);
        panelCuerpoEstados.add(panelEncabezadoE);

        JPanel panelNombreE = new JPanel();
        JLabel lblNombre_Estados = new JLabel("Nombre del Estado: ");
        lblNombre_Estados.setFont(fuenteArial20);
        JTextField jtxNombre_Estados = new JTextField(20);
        jtxNombre_Estados.setFont(fuenteArial20);
        panelNombreE.add(lblNombre_Estados);
        panelNombreE.add(jtxNombre_Estados);
        panelCuerpoEstados.add(panelNombreE);

        JPanel panelClaveE = new JPanel();
        JLabel lblClave = new JLabel("Clave:                      ");
        lblClave.setFont(fuenteArial20);
        JTextField jtxClave = new JTextField(20);
        jtxClave.setFont(fuenteArial20);
        panelClaveE.add(lblClave);
        panelClaveE.add(jtxClave);
        panelCuerpoEstados.add(panelClaveE);

        panelEstados.add("Center",panelCuerpoEstados);

        //panel registro de Proveedores
        JPanel panelProveedores = new JPanel();
        panelProveedores.setLayout(new BorderLayout());

        JPanel panelCuerpoProveedores = new JPanel();
        panelCuerpoProveedores.setLayout(new BoxLayout(panelCuerpoProveedores, Y_AXIS));

        JPanel panelEncabezadoP = new JPanel();
        JLabel lblEncabezadoP = new JLabel("Registro de Proveedores");
        lblEncabezadoP.setFont(fuenteArial30);
        panelEncabezadoP.add(lblEncabezadoP);
        panelCuerpoProveedores.add(panelEncabezadoP);

        JPanel panelNombreP = new JPanel();
        JLabel lblNombre_Proveedor = new JLabel("Nombre del Proveedor: ");
        lblNombre_Proveedor.setFont(fuenteArial20);
        JTextField jtxNobre_Proveedor = new JTextField(20);
        jtxNobre_Proveedor.setFont(fuenteArial20);
        panelNombreP.add(lblNombre_Proveedor);
        panelNombreP.add(jtxNobre_Proveedor);
        panelCuerpoProveedores.add(panelNombreP);

        JPanel panelDireccionP = new JPanel();
        JLabel lblDireccion = new JLabel("Direccion:                     ");
        lblDireccion.setFont(fuenteArial20);
        JTextField jtxDireccion = new JTextField(20);
        jtxDireccion.setFont(fuenteArial20);
        panelDireccionP.add(lblDireccion);
        panelDireccionP.add(jtxDireccion);
        panelCuerpoProveedores.add(panelDireccionP);

        JPanel panelNumTelP = new JPanel();
        JLabel lblNum_Telef = new JLabel("Numero Telefonico:      ");
        lblNum_Telef.setFont(fuenteArial20);
        JTextField jtxNum_Telef = new JTextField(20);
        jtxNum_Telef.setFont(fuenteArial20);
        panelNumTelP.add(lblNum_Telef);
        panelNumTelP.add(jtxNum_Telef);
        panelCuerpoProveedores.add(panelNumTelP);

        panelProveedores.add(panelCuerpoProveedores);
        //panel registro de Clientes

        JPanel panelClientes = new JPanel();


        //panel registro de Productos
        JPanel panelProductos = new JPanel();




        //sistema de muestra y cierre

        //panelGeneral.add();

        VentanaC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        VentanaC.setVisible(true);
    }
}
