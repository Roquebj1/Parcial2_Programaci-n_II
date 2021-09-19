/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Interfaces.Interfaz1;
import datos.UsuarioJDBC;
import dominio.Usuario;
import java.sql.*;

import java.util.*;

/**
 *
 * @author HP
 */
public class MenudeUsuario {
    public static void ej1() {
        //paso 1 definir el string de conexion
        String url = "jdbc:mysql://localhost:3306/dbvendedor?zeroDateTimeBehavior=CONVERT_TO_NULL";

        try {
            Connection conexion = DriverManager.getConnection(url, "root", "Junior2021");//creo el objeto conexion
            Statement sentencia = conexion.createStatement();//creo el objeto statement
            String sql = "select * from usuario"; //paso 4 crear instruccion sql
            ResultSet resultado = sentencia.executeQuery(sql); //ejecuto el query


            //por ultimo procesar los result
            while (resultado.next()) {
                System.out.println("IdUsuario=" + resultado.getInt(1));
                System.out.println("Username=" + resultado.getString(2));
                System.out.println("Password=" + resultado.getInt(3));

            }

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
        }
    }

    public static void insert() {
        UsuarioJDBC UsuarioJDBC = new UsuarioJDBC();
        Usuario insert = new Usuario();

        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String Username = t.nextLine();

        System.out.println("Ingrese la contraseña");
        int Password = t.nextInt();

        insert.setUsername(Username);
        insert.setPassword(Password);
        UsuarioJDBC.insert(insert);

        List<Usuario> todos = UsuarioJDBC.select();

        for (Usuario usuario : todos) {
            System.out.println("Usuario = " + usuario);
        }
    }

    public static void borrador() {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        Usuario delete = new Usuario();
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el ID del Usuario");
        int Id = t.nextInt();

        delete.setIdUsuario(Id);
        usuarioJDBC.delete(delete);

        List<Usuario> todos = usuarioJDBC.select();

        for (Usuario usuario : todos) {
            System.out.println("Usuario = " + usuario);
        }

    }

    public static void seleccionar() {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        List<Usuario> all = usuarioJDBC.select();

        for (Usuario ven : all) {
            System.out.println("Usuario:" + ven);
        }

    }

    public static void actualizar() {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        Usuario actua = new Usuario();
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el Username");
        String Username = t.nextLine();

        System.out.println("Ingrese el Password");
        int Password = t.nextInt();

        System.out.println("Ingrese el Id");
        int Id = t.nextInt();

        actua.setUsername(Username);
        actua.setPassword(Password);
        actua.setIdUsuario(Id);

        usuarioJDBC.update(actua);

        List<Usuario> all = usuarioJDBC.select();

        for (Usuario usuario : all) {
            System.out.println("Usuario = " + usuario);
        }
    }

    public static void main(String[] args) {
        Interfaz1 inte = new Interfaz1();
        inte.setVisible(true);
    }

}


