/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Models.AreaModel;
import Models.InquilinoModel;
import Models.UsuarioModel;
/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InquilinoDB {

    public void inserirInquilino(InquilinoModel inquilino) throws Exception {
        String sql = "INSERT INTO Inquilino(nome,cpf,aprtNumero) VALUES (?,?,?);";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql);) {

            ps.setString(1, inquilino.getNome());
            ps.setString(2, inquilino.getCpf());
            ps.setInt(3, inquilino.getAprtNumero());

            ps.execute();
        }
    }

    public InquilinoModel[] buscarInquilino() throws Exception {
        String sql = "SELECT * FROM INQUILINO";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  ResultSet rs = ps.executeQuery()) {

            int totalInquilinos = rs.last() ? rs.getRow() : 0;
            InquilinoModel[] inquilinos = new InquilinoModel[totalInquilinos];
            rs.beforeFirst();
            int contador = 0;

            while (rs.next()) {
                InquilinoModel inq = new InquilinoModel();

                int id = rs.getInt("idInquilino");
                String nome = rs.getString("nome");
                String CPF = rs.getString("cpf");
                int apartNumero = rs.getInt("aprtNumero");

                inq.setIdInquilino(id);
                inq.setNome(nome);
                inq.setCpf(CPF);
                inq.setAprtNumero(apartNumero);

                inquilinos[contador++] = inq;
            }
            return inquilinos;
        }
    }
    
    public InquilinoModel[] buscarInquilinoVacinasReq(AreaModel area) throws Exception {
        String sql = " SELECT I.* FROM INQUILINO I  WHERE EXISTS (SELECT * FROM  VACINA V WHERE V.idInquilino = I.idInquilino AND V.qtdDose >= ?);";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setInt(1, area.getDosesRequisitadas());
            ResultSet rs = ps.executeQuery();

            int totalInquilinos = rs.last() ? rs.getRow() : 0;
            InquilinoModel[] inquilinos = new InquilinoModel[totalInquilinos];
            rs.beforeFirst();
            int contador = 0;

            while (rs.next()) {
                InquilinoModel inq = new InquilinoModel();

                int id = rs.getInt("idInquilino");
                String nome = rs.getString("nome");
                String CPF = rs.getString("cpf");
                int apartNumero = rs.getInt("aprtNumero");

                inq.setIdInquilino(id);
                inq.setNome(nome);
                inq.setCpf(CPF);
                inq.setAprtNumero(apartNumero);

                inquilinos[contador++] = inq;
            }
            return inquilinos;
        }
    }

    public void updateInquilino(InquilinoModel inquilino) throws Exception {

        String sql = "UPDATE Inquilino SET nome = ?,cpf= ?,aprtNumero= ? WHERE  idInquilino = ?";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setString(1, inquilino.getNome());
            ps.setString(2, inquilino.getCpf());
            ps.setInt(3, inquilino.getAprtNumero());
            ps.setInt(4, inquilino.getIdInquilino());

            int rs = ps.executeUpdate();
        }
    }

    public void deleteInquilino(InquilinoModel inquilino) throws Exception {

        String sql = "DELETE FROM Inquilino WHERE idInquilino = ?;";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setInt(1, inquilino.getIdInquilino());

            int rs = ps.executeUpdate();
        }
    }

    public boolean existeInquilino(InquilinoModel inq) throws Exception {
        String sql = "select * from Inquilino where cpf = ?;";

        boolean r;
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, inq.getCpf());
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
