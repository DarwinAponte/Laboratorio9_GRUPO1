package Daos;

import Beans.*;

import java.sql.*;
import java.util.ArrayList;

public class PaisesDao extends BaseDao {

    public ArrayList<Paises> listaPaisesContinente(int idPais, String nombre, String continente, double poblacion, double tamano) {

        ArrayList<Paises> listaPaisesPorContinente = new ArrayList<>();

        String sql = "select * from paises order by continente asc"; // query que permita filtrar paises x continente

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Paises pais = new Paises(nombre, poblacion, tamano, idContinente);
                pais.setNombre(rs.getString(1));
                pais.setPoblacion(rs.getInt(2));
                pais.setTamano(rs.getInt(3));
                pais.setIdcontinentes(rs.getInt(4));
                listaPaisesPorContinente.add(pais);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPaisesPorContinente;
    }

    public boolean agregarPaises(Paises pais) { //retorna falso si surge una excepcion

        String sql = "INSERT INTO paises(idpaises, nombre, poblacion, tamaño, idcontientes)\n" +
                "VALUES (?,?,?,?,?,?)"; // query respectivo, es con insert into y values

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, pais.getNombre());
            pstmt.setInt(2, pais.getPoblacion());
            pstmt.setInt(3, pais.getTamano());
            pstmt.setInt(4, pais.getIdcontinentes());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean editarPaises(Paises pais) {
        String sql = "UPDATE paises set idpaises=?, nombre=?, poblacion=?, tamaño=?, idcontinentes=?"; // query respectivo, es con update, set y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, pais.getNombre());
            pstmt.setInt(2, pais.getPoblacion());
            pstmt.setInt(3, pais.getTamano());
            pstmt.setInt(4, pais.getIdcontinentes());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void eliminarPaises(String nombrePais) {
        String sql = "delete from universidades where (iduniversidades=?)"; // query respectivo, se usa delete from y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, nombrePais);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
