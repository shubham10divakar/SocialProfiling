package com.example.subhamdivakar.socialprofiling;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;


public class PurchasePatterns extends AppCompatActivity
{
    PieChartView pieChartView,pieChartView1,pieChartView2,pieChartView3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_patterns);
        pieChartView = findViewById(R.id.chart);
        pieChartView1 = findViewById(R.id.chart1);
        pieChartView2 = findViewById(R.id.chart2);
        pieChartView3 = findViewById(R.id.chart3);

        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(16000, Color.BLUE).setLabel("Online"));
        pieData.add(new SliceValue(50502, Color.GRAY).setLabel("Offline"));
        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("A1").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);

        List pieData1 = new ArrayList<>();
        pieData1.add(new SliceValue(10000, Color.BLUE).setLabel("Online"));
        pieData1.add(new SliceValue(100000, Color.GRAY).setLabel("Offline"));
        PieChartData pieChartData1 = new PieChartData(pieData1);
        pieChartData1.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData1.setHasCenterCircle(true).setCenterText1("A2").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView1.setPieChartData(pieChartData1);

        List pieData2 = new ArrayList<>();
        pieData2.add(new SliceValue(20000, Color.BLUE).setLabel("Online"));
        pieData2.add(new SliceValue(86000, Color.GRAY).setLabel("Offline"));
        PieChartData pieChartData2 = new PieChartData(pieData2);
        pieChartData2.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData2.setHasCenterCircle(true).setCenterText1("A3").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView2.setPieChartData(pieChartData2);

        List pieData3 = new ArrayList<>();
        pieData3.add(new SliceValue(13980, Color.BLUE).setLabel("Online"));
        pieData3.add(new SliceValue(67890, Color.GRAY).setLabel("Offline"));
        PieChartData pieChartData3 = new PieChartData(pieData3);
        pieChartData3.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData3.setHasCenterCircle(true).setCenterText1("A4").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView3.setPieChartData(pieChartData2);
    }
}
