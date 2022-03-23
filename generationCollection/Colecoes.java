package br.com.generationCollection;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
	public static void main(String[] args) {
		Collection <String> Estoque = new ArrayList();
		Estoque.add("Calça boyfriend");//-------------armazena
		Estoque.add("vestido de bolinhas");
		Estoque.add ("Cropped");
		Estoque.add("meia xadrez");
		if (Estoque.isEmpty()) {
			System.out.println("Essa lista está vazia!!");
		}
		else {
			System.out.println("Lista de produtos em Estoque: " + Estoque ); //------apresenta
		}
		Estoque.remove("meia xadrez"); //-----------remove item da lista
		System.out.println("Lista de produtos em Estoque: " + Estoque ); //------apresenta atualizado
		Estoque.clear();
}
}
