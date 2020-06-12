import java.util.Properties;

public class Produto {
    private double preco;
    private String name;

    public Produto(){
        
    }
   
   
    public Produto(double preco, String name) {
        this.preco = preco;
        this.name = name;
    }
    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Produto [name=" + name + ", preco=" + preco + "]";
    }

    

    
}