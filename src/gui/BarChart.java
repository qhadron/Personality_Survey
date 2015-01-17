package gui;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart{
	public static ChartPanel BarChart(double number[],String name[],String title,String domainLabel,String rangeLabel,String label)
	{
		CategoryDataset dataset = createDataset(name,number,label);
        JFreeChart chart = createChart(dataset,title,domainLabel,rangeLabel);
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseZoomable(true);
        return panel;
	}
	public static  CategoryDataset createDataset(String name[],double number[],String label) 
	{
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<name.length;i++)
        {
        	dataset.addValue(number[i],name[i],"");
        }
        return dataset;
	}
	public static JFreeChart createChart(CategoryDataset dataset, String title,String dl,String rl) 
	{
		JFreeChart chart = ChartFactory.createBarChart3D(
	            title,         // title
	            dl,            // domain axis label
	            rl,            // range axis label
	            dataset        // data
	        );
		
		return chart;
	} 
}