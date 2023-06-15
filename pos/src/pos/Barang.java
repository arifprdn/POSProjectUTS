/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Tento
 */
public class Barang {
    public String Kode;
    public String nama;
    public float Harga;
    
    static ArrayList<Barang> daftarBarang;
    public static void loadBarangFromDB(){
        daftarBarang=new ArrayList<Barang>();
     Barang barang; 
    try{
        Statement stmt=DBconnector.connection.createStatement();
        String sql="SELECT * FROM barang";
        
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            barang=new Barang();
            barang.Kode=Integer.toString(rs.getInt("Kode"));
            barang.nama=rs.getString("nama");
            barang.Harga=rs.getFloat("harga");
            daftarBarang.add(barang);
        }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    }
    
    public static void insertBarangtoDB(){
        try {
            Statement stmt=DBconnector.connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
