package Entidades;

public class MemoriaVirtual {
    private Long memoriaVirtualAntes;

    private Long memoriaVirtualLiberada;

    public MemoriaVirtual(Long memoriaVirtualAntes, Long memoriaVirtualLiberada) {
        this.memoriaVirtualAntes = memoriaVirtualAntes;
        this.memoriaVirtualLiberada = memoriaVirtualLiberada;
    }

    public Long getMemoriaVirtualAntes() {
        return memoriaVirtualAntes;
    }

    public void setMemoriaVirtualAntes(Long memoriaAntes) {
        this.memoriaVirtualAntes = memoriaAntes;
    }

    public Long getMemoriaVirtualLiberada() {
        return memoriaVirtualLiberada;
    }

    public void setMemoriaVirtualLiberada(Long memoriaLiberada) {
        this.memoriaVirtualLiberada = memoriaLiberada;
    }
}
