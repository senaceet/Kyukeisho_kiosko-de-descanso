package modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Juegos;
import java_interfaces.CRUD_Juegos;


public class JuegoDAO implements CRUD_Juegos {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Juegos CJ =new Juegos();

    @Override
    public List listar() {
        ArrayList<Juegos>list=new ArrayList<>();
        String sql="select codigo_juego,nombre_juego from juegos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Juegos ma=new Juegos();
                ma.setcodigo_juego(rs.getInt("codigo_juego"));
                ma.setnombre_juego(rs.getString("nombre_juego"));
                list.add(ma);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Juegos list(int codigo_juego) {
        String sql="select codigo_juego,nombre_juego from juegos where codigo_juego=" + codigo_juego;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                CJ.setcodigo_juego(rs.getInt("codigo_juego"));
                CJ.setnombre_juego(rs.getString("nombre_juego"));

            }
        } catch (Exception e) {
        }
        return CJ;
    }

    @Override
    public boolean add(Juegos ma) {
       String sql="insert into juegos (nombre_juego)values('"+ma.getnombre_juego()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }


    @Override
    public boolean edit(Juegos ma) {
        String sql="update juegos set nombre_juego= '"+ma.getnombre_juego()+"' where codigo_juego="+ma.getcodigo_juego();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    @Override
    public boolean eliminar(int codigo_juego) {
        String sql="delete from juegos where codigo_juego="+codigo_juego;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
