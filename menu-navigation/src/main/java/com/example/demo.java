package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;



@ManagedBean(name="chart", eager = true)
@ViewScoped
public class demo {
	private LineChartModel areaModel;


 
	public demo() {
		createChartModel();
	}
	
	public void createChartModel() {
		areaModel=new LineChartModel();
		LineChartSeries rayalaseema=new LineChartSeries();
		rayalaseema.setFill(true);
		rayalaseema.setLabel("Rayalase");
		rayalaseema.set("KADAPA", 10000);
		rayalaseema.set("PRODDATUR", 20000);
		rayalaseema.set("JAMMALAMADUGU", 15000);
		rayalaseema.set("Anantapur", 5000);
		
		LineChartSeries kostha=new LineChartSeries();
		kostha.setFill(true);
		kostha.setLabel("kOSTHA CITYS");
		kostha.set("KADAPA", 12000);
		kostha.set("PRODDATUR", 13000);
		kostha.set("JAMMALAMADUGU", 15000);
		kostha.set("Anantapur", 10000);
		
		areaModel.addSeries(rayalaseema);
		areaModel.addSeries(kostha);
		areaModel.setTitle("CITY NAMES IN RAYALASEEMA AND KOSTHA");
		areaModel.setLegendPosition("sw");
		areaModel.setStacked(true);
		areaModel.setShowPointLabels(true);
		
		Axis xAxis=new CategoryAxis();
		areaModel.getAxes().put(AxisType.X, xAxis);
		
		Axis yAxis=areaModel.getAxis(AxisType.Y);
		
		yAxis.setLabel("CITYS");
		yAxis.setMin(4000);
		yAxis.setMax(25000);
	}
	public LineChartModel getAreaModel() {
		return areaModel;
	}

	public void setAreaModel(LineChartModel areaModel) {
		this.areaModel = areaModel;
	}

}
