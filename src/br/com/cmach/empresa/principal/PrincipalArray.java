package br.com.cmach.empresa.principal;

import br.com.cmach.empresa.modelos.Estoque;
import br.com.cmach.empresa.modelos.Funcionarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrincipalArray {
    public static void main(String[] args){
    Estoque estoquista1 = new Estoque("César ", "Estoquista");
    Estoque estoquista2 = new Estoque("Marcos ", "Estoquista");
    Estoque estoquista3 = new Estoque("Elisa", "Estoquista");
         List<Funcionarios> lista = new ArrayList<>();
        lista.add(estoquista1);
        lista.add(estoquista2);
        lista.add(estoquista3);
        for (Funcionarios item: lista) {
            System.out.println(item.getNome());
        }
        System.out.println(lista.size());
        Collections.sort(lista);
        System.out.println(lista);
    }
}
