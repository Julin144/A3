/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import Models.CondominioModel;
/**
 *
 * @author Thais Dias
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CondominioDB {
    
    
    public CondominioModel[] buscarCondominios() throws Exception {
        String sql = "SELECT * FROM CONDOMINIO";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery()) {

            int totalDeCondominios = rs.last() ? rs.getRow() : 0;
            CondominioModel[] condominios = new CondominioModel[totalDeCondominios];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("idCondominio");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                
                condominios[contador++] = new CondominioModel(id, nome, endereco);
            }
            return condominios;
        }
    }
    

    public void inserirCondominio(CondominioModel condominio) throws Exception {


        String sql = "INSERT INTO Condominio(nome,endereco) VALUES (?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1, condominio.getNome());
            ps.setString(2, condominio.getEndereco());
            
            ps.execute();
        }
    }

       
    public void updateCondominio(CondominioModel condominio) throws Exception {

        String sql = "UPDATE Condominio SET nome = ?, endereco= ? WHERE   idCondominio = ?;";
        
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1,condominio.getNome());
            ps.setString(2, condominio.getEndereco());
            ps.setInt(3, condominio.getIdCondominio());
     
            
            int rs = ps.executeUpdate();
        }
    }
    
    public void deleteCondominio(CondominioModel condominio) throws Exception {

        String sql = "DELETE FROM Condominio WHERE  idCondominio = ?;";

        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
           
            ps.setInt(1, condominio.getIdCondominio());       
            
            int rs = ps.executeUpdate();
        }
    }
    public boolean existeCondominio(CondominioModel cond) throws Exception {
    String sql = "select * from Inquilino where nome = ?;";
    boolean r;
    
    try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, cond.getNome());
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            r = true;
        } else {
            r = false;
        }

        return r;
        }
    }
}
