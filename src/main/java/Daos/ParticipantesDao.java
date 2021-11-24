package Daos;

import Beans.*;

import java.sql.*;
import java.util.ArrayList;

public class ParticipantesDao extends BaseDao{

    public ArrayList<Participantes> listaParticipantes(int idParticipante, String nombre, String apellido, int edad, String nacionalidad, String gender) {

        ArrayList<Participantes> listaParticipantes = new ArrayList<>();

        String sql = "select * from participantes"; // query que permita mostrar participantes

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Participantes participantes = new Participantes();
                participantes.setNombre(rs.getString(2));
                participantes.setApellido(rs.getString(3));
                participantes.setEdad(rs.getInt(4));
                participantes.setIdpaises(rs.getInt(5));
                participantes.setGenero(rs.getString(6));
                listaParticipantes.add(participantes);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaParticipantes;
    }

    public boolean agregarParticipantes(Participantes participantes) { //retorna falso si surge una excepcion

        String sql = "INSERT INTO participantes(idparticipantes, nombre, apellido, edad, genero, idpaises)\n" +
                "VALUES (?,?,?,?,?,?)"; // query respectivo, es con insert into y values

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, participantes.getNombre());
            pstmt.setString(2, participantes.getApellido());
            pstmt.setInt(3, participantes.getEdad());
            pstmt.setInt(4, participantes.getIdpaises());
            pstmt.setString(5, participantes.getGenero());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean editarParticipantes(Participantes participantes) {
        String sql = "UPDATE participantes set idparticipantes=?, nombre=?, apellido=?, edad=?, genero=?, idpaises=?"; // query respectivo, es con update, set y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, participantes.getNombre());
            pstmt.setString(2, participantes.getApellido());
            pstmt.setInt(3, participantes.getEdad());
            pstmt.setInt(4, participantes.getIdpaises());
            pstmt.setString(5, participantes.getGenero());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void eliminarParticipantes(int idParticipante) {
        String sql = "delete from participantes where (idparticipantes=?)"; // query respectivo, se usa delete from y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idParticipante);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
