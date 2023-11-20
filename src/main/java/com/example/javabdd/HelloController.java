package com.example.javabdd;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class HelloController implements Initializable {
    public Button button;
    @FXML
    private Label label;
    /*final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    //final LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);
    //@FXML private LineChart<String, Number> lineChart;
    @FXML private LineChart<String, Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);*/
    @FXML private CategoryAxis xAxis ;
    @FXML private NumberAxis yAxis ;
    @FXML private LineChart<String, Number> lineChart ;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Visualiser");
        visualisationGraph();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lineChart.setAnimated(false);
        visualisationGraph();
    }
    private void visualisationGraph(){
        lineChart.setTitle("Temperature Capteur mélange");
        yAxis.setLabel("Température");
        xAxis.setLabel("Mois");
        XYChart.Series series = new XYChart.Series();
        series.setName("Année 2022");
        series.getData().add(new XYChart.Data("Jan", 23));
        series.getData().add(new XYChart.Data("Fev", 14));
        series.getData().add(new XYChart.Data("Mar", 15));
        series.getData().add(new XYChart.Data("Avr", 24));
        series.getData().add(new XYChart.Data("Mai", 34));
        series.getData().add(new XYChart.Data("Jui", 36));
        series.getData().add(new XYChart.Data("Jul", 22));
        series.getData().add(new XYChart.Data("Aou", 45));
        series.getData().add(new XYChart.Data("Sep", 43));
        series.getData().add(new XYChart.Data("Oct", 17));
        series.getData().add(new XYChart.Data("Nov", 29));
        series.getData().add(new XYChart.Data("Dec", 25));
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Année 2021");
        series2.getData().add(new XYChart.Data("Jan", 28));
        series2.getData().add(new XYChart.Data("Fev", 17));
        series2.getData().add(new XYChart.Data("Mar", 19));
        series2.getData().add(new XYChart.Data("Avr", 14));
        series2.getData().add(new XYChart.Data("Mai", 20));
        series2.getData().add(new XYChart.Data("Jui", 42));
        series2.getData().add(new XYChart.Data("Jul", 27));
        series2.getData().add(new XYChart.Data("Aou", 48));
        series2.getData().add(new XYChart.Data("Sep", 47));
        series2.getData().add(new XYChart.Data("Oct", 19));
        series2.getData().add(new XYChart.Data("Nov", 39));
        series2.getData().add(new XYChart.Data("Dec", 29));
        lineChart.getData().addAll(series, series2);
    }
}