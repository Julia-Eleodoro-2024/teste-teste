package com.eleodoro.modelo;

public class loja {
  private String cliente;
  private int id;
  private String marca;
  


    public loja() {

    }

    public loja(String cliente, int id, String marca) {
        this.cliente = cliente;
        this.id = id;
        this.marca = marca;
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + id;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        loja other = (loja) obj;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (id != other.id)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

}