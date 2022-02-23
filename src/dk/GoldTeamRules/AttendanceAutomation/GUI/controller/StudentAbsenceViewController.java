package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.ResourceBundle;

public class StudentAbsenceViewController implements Initializable {
    @FXML
    private LineChart lineChart;
    @FXML
    private Label weekLbl;
    @FXML
    private Label currentAbsenceLbl;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Student currentStudent = CurrentStudent.getInstance(null).getCurrentStudent();
        this.weekLbl.setText("Week " + String.valueOf(getCurrentWeek()));
        this.currentAbsenceLbl.setText(currentStudent.getName() + " Current Absence: " + (currentStudent.getAbsence()*100) + "%");
        this.lineChart.getData().add(initLineChart());

    }

    private XYChart.Series initLineChart()
    {
        XYChart.Series series = new XYChart.Series();
        series.setName("Absence");

        /*series.getData().add(new XYChart.Data<String, Double>("Monday", CurrentStudent.getInstance(null).getCurrentStudent().getAbsence()*100));
        series.getData().add(new XYChart.Data<String, Double>("Tuesday", CurrentStudent.getInstance(null).getCurrentStudent().getAbsence()*100));
        series.getData().add(new XYChart.Data<String, Double>("Wednesday", CurrentStudent.getInstance(null).getCurrentStudent().getAbsence()*100));
        series.getData().add(new XYChart.Data<String, Double>("Thursday", CurrentStudent.getInstance(null).getCurrentStudent().getAbsence()*100));
        series.getData().add(new XYChart.Data<String, Double>("Friday", CurrentStudent.getInstance(null).getCurrentStudent().getAbsence()*100));


         */
        series.getData().add(new XYChart.Data<String, Double>("Monday", 5.0));
        series.getData().add(new XYChart.Data<String, Double>("Tuesday", 5.2));
        series.getData().add(new XYChart.Data<String, Double>("Wednesday", 5.7));
        series.getData().add(new XYChart.Data<String, Double>("Thursday", 6.1));
        series.getData().add(new XYChart.Data<String, Double>("Friday", 4.2));

        return series;
    }



    private int getCurrentWeek()
    {
        LocalDate date = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());
    }

}
