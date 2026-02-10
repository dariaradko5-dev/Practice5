package Task2;

abstract class ReportGenerator {
    public final void generate() {
        String data = fetchData();
        String formattedData = formatData(data);
        displayReport(formattedData);
    }

    protected abstract String fetchData();

    protected abstract String formatData(String data);

    protected void displayReport(String formattedData) {
        System.out.println("Report:");
        System.out.println(formattedData);
    }

}
