package controller;

import model.estrutura.grafo.grafoMatriz;

public class grafoMatrizController{
	public grafoMatrizController(){
		super();
	}
	
	public String test() throws Exception{
		String[] points = new String[] {"A", "B", "C", "D"};
		grafoMatriz g = new grafoMatriz(points);
		
		g.link("A", "B");
		g.link("A", "C");
		g.link("A", "D");
		g.link("B", "C");
		g.remove("A", "B");
		g.removeAll("A", points);
		
		return g.toString();
	}
}