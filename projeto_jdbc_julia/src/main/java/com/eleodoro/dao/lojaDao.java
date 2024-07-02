
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.loja;

    
public class lojaDao{

    private loja loja;
    private final String SQLINCLUIR = "INSERT INTO LOJA VALUES (?, ?, ?)";
    private final String SQLALTERAR = "UPDATE LOJA SET CLIENTE = ?, ID = ? WHERE MARCA = ?";
    private final String SQLEXCLUIR = "DELETE FROM LOJA WHERE ID = ?";
    private final String SQLCONSULTAR = "SELECT * FROM LOJA WHERE ID = ?";

    public lojaDao (loja loja) {
        this.loja = loja;
    }

    public boolean incluir(){
         try {
            PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLINCLUIR);
            ps.setString(1, loja.getCliente());
            ps.setInt(2, loja.getId());
            ps.setString(3, loja.getMarca());
            ps.executeUpdate();
            return true;
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir o equipamento");
            return false;
         }
    }

    public boolean alterar(){
        try {
           PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLALTERAR);
           ps.setString(1, loja.getCliente());
           ps.setInt(2, loja.getId());
           ps.setString(3, loja.getMarca());
           ps.executeUpdate();
           return true;
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar o equipamento");
           return false;
        }
   }

   public boolean excluir(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLEXCLUIR);
       ps.setString(1, loja.getCliente());
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel excluir o equipamento");
       return false;
    }
}

public boolean consultar(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLCONSULTAR);
       ps.setString(1, loja.getCliente());
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
        loja.setId(rs.getInt(2));
        loja.setMarca(rs.getString(3));
       }
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel consultar o equipamento");
       return false;
    }
}
}
    
