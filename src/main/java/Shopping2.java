

import java.util.ArrayList;
import java.util.List;

public class Shopping2 {
    private String nome;
    private int id;

    private List<Product> ListaNova = new ArrayList<>();
    private List<Product> ListaProdutos = new ArrayList<>();
    public void setListaNova(List<Product> ListaNova)
    {
        ListaNova=ListaNova;
    }
    public void setListaProdutos(List<Product> ListaProdutos)
    {
        ListaProdutos = ListaProdutos;
    }

    public Shopping2(String nome, int id)
    {
        this.nome=nome;
        this.id=id;
    }

    public double getPercentageCompleted()
    {
        double percent = 0;

        int sizeList = ListaProdutos.size();
        int sizeCarrinhoList = ListaNova.size();
        if(sizeCarrinhoList == 0 || sizeList ==0)
        {
            System.out.println();
        }
        else if (sizeCarrinhoList != 0 && sizeList != 0){
            percent = (sizeCarrinhoList * 100) / sizeList;


            return percent;
        }


        return percent;
    }

}
