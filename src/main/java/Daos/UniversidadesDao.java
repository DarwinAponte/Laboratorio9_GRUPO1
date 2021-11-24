package Daos;

import Beans.*;

import java.sql.*;
import java.util.ArrayList;

public class UniversidadesDao extends BaseDao {
    public ArrayList<Universidades> listaUniversidadesRanking(int idUniversidad, String nombre, String pais, int ranking, int numeroAlumnos, String fotoUniversidad) {

        ArrayList<Universidades> listaUniversidadesRanking = new ArrayList<>();

        String sql = "select * from universidades order by ranking desc"; // query que permita mostrar universidades por ranking

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Universidades universidades = new Universidades();
                universidades.setNumeroAlumnos(rs.getInt(1));
                universidades.setNombre(rs.getString(2));
                universidades.setRanking(rs.getInt(3));
                universidades.setFoto(rs.getString(4));
                universidades.setIdpaises(rs.getInt(5));

                listaUniversidadesRanking.add(universidades);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaUniversidadesRanking;

    }

    public boolean agregarUniversidades(Universidades universidades) { //retorna falso si surge una excepcion

        String sql = "INSERT INTO universidades(iduniversidades, nombre, ranking, numeroalumnos, foto, idpaises)\n" +
                "VALUES (?,?,?,?,?,?)"; // query respectivo, es con insert into y values

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, universidades.getNumeroAlumnos());
            pstmt.setString(2, universidades.getNombre());
            pstmt.setInt(3, universidades.getRanking());
            pstmt.setString(4, universidades.getFoto());
            pstmt.setInt(5, universidades.getIdpaises());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean editarUniversidades(Universidades universidades) {
        String sql = "UPDATE universidades set iduniversidades=?, nombre=?, ranking=?, numeroalumnos=?, foto=?, idpaises=?";

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, universidades.getNumeroAlumnos());
            pstmt.setString(2, universidades.getNombre());
            pstmt.setInt(3, universidades.getRanking());
            pstmt.setString(4, universidades.getFoto());
            pstmt.setInt(5, universidades.getIdpaises());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void eliminarUniversidades(int idUniversidad) {
        String sql = "delete from universidades where (iduniversidades=?)"; // query respectivo, se usa delete from y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idUniversidad);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}