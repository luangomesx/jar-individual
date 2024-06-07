package Models;

import Conexao.Conexao;
import Entidades.MemoriaVirtual;

import java.sql.PreparedStatement;

public class MemoriaVirtualDAO {
    public static boolean cadastrarMemoriaVirtual(MemoriaVirtual memoriaVirtual){
        String sql = "INSERT INTO LeituraMemoriaVirtual (memoriaAntes, memoriaLiberada) VALUES (?, ?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setLong(1, memoriaVirtual.getMemoriaVirtualAntes());
            ps.setLong(2, memoriaVirtual.getMemoriaVirtualLiberada());
            ps.execute();

            System.out.println("A Memória Virtual foi cadastrada e limpa com sucesso!");
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Teste erro");

        }

        return false;
    }
}
