package Daos;

import Beans.*;

import java.sql.*;
import java.util.ArrayList;

public class AlumnosDao extends ParticipantesDao{

    public ArrayList<Alumnos> listaAlumnosPromPond(int idAlumno, String nombre, String apellido, int edad, int codigo, double ponderado, boolean condicion) {

        ArrayList<Alumnos> listaAlumnosPromPond = new ArrayList<>();

        String sql = "select * from alumnos order by promedio desc;"; // query que permita mostrar alumnos x ponderado

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Alumnos alumnos = new Alumnos();
                alumnos.setIduniversidades(rs.getInt(7));
                alumnos.setNombre(rs.getString(1));
                alumnos.setApellido(rs.getString(2));
                alumnos.setEdad(rs.getString(3));
                alumnos.setCodigo(rs.getString(4));
                alumnos.setPromedio(rs.getDouble(5));
                alumnos.setCondicion(rs.getString(6));

                listaAlumnosPromPond.add(alumnos);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlumnosPromPond;

    }

    public boolean agregarAlumnos(Alumnos alumnos) { //retorna falso si surge una excepcion

        String sql = "INSERT INTO alumnos (idalumnos, nombre, apellido, edad, codigo, promedio, condicion, iduniversidades)\n" +
                "VALUES (?,?,?,?,?,?,?,?)"; // query respectivo, es con insert into y values

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(7, alumnos.getIduniversidades());
            pstmt.setString(1, alumnos.getNombre());
            pstmt.setString(2, alumnos.getApellido());
            pstmt.setString(3, alumnos.getEdad());
            pstmt.setString(4, alumnos.getCodigo());
            pstmt.setDouble(5, alumnos.getPromedio());
            pstmt.setString(6, alumnos.getCondicion());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean editarAlumnos(Alumnos alumnos) {
        String sql = "UPDATE alumnos set idalumnos=?, nombre=?, apellido=?, edad=?, codigo=?, promedio=?, condicion=?, iduniversidades=?";

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(7, alumnos.getIduniversidades());
            pstmt.setString(1, alumnos.getNombre());
            pstmt.setString(2, alumnos.getApellido());
            pstmt.setString(3, alumnos.getEdad());
            pstmt.setString(4, alumnos.getCodigo());
            pstmt.setDouble(5, alumnos.getPromedio());
            pstmt.setString(6, alumnos.getCondicion());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void eliminarAlumnos(int idAlumnos) {
        String sql = "delete from alumno where (idalumnos=?)"; // query respectivo, se usa delete from y where

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idAlumnos);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
