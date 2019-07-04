package com.co.personalsoft.kitdeemergencia.model;

public class GeoReferenciaPlanes {
	private String riesgo;
	private String contador;
	private String url;
	private String plan;
	
	public String getRiesgo() {
		return riesgo;
	}
	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}
	
	public String getContador() {
		return contador;
	}
	public void setContador(String contador) {
		this.contador = contador;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public String toRow() {
		String text;
		text = "<tr>";
		text += "<td>Contador</td>";
		text += "<td>"+contador+"</td>";
		text += "<td></td>";
		text += "<td><a href=\"" + url + "\">Interes</a></td>";
		text += "<td></td>";
		text += "<td><a href=\" localhost:8080/planes?riesgo="+riesgo+"&plan="+plan+"     \">Plan</a></td>";
		text += "</tr>";
		return text;
	}

}
