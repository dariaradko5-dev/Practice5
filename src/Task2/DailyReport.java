package Task2;

public class DailyReport extends ReportGenerator {
    @Override
    protected String fetchData() {
        return "Daily sales: 1000 грн, New customers: 50";
    }

    @Override
    protected String formatData(String data) {
        return "Formatted Daily Report:" + data;
    }
}
