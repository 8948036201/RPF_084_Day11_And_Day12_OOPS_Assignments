package com.bridgelabz.oops.stockreport;

public class StockReport {
	MyLinkedList<Stock> list;

	StockDataAndPrintReport stockDataAndPrintReport = new StockDataAndPrintReport();

	public static void main(String[] args) {
		StockDataAndPrintReport.getStockData();
		StockDataAndPrintReport.printReport();
	}
}
