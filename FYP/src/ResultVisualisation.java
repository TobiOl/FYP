import javax.swing.JFrame;  
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  

public class ResultVisualisation extends JFrame{
	//visualisation of the data calculated in the Simulation class in form of a bar chart
	//code gotten from https://www.javatpoint.com/jfreechart-bar-chart
	  private static final long serialVersionUID = 1L;  
	  
	  
	  public ResultVisualisation(String apptitle) {
		  super(apptitle);
		  
		  //Dataset
		  CategoryDataset Admissions = createDataset();
		  
		  //Chart created here
		  JFreeChart chart = ChartFactory.createBarChart("Hospital admissions per week", "Weeks", "Total admissions", Admissions, PlotOrientation.VERTICAL,true,true,false);
		  ChartPanel panel = new ChartPanel(chart);
		  setContentPane(panel);
		  
		  }
	  
	  //private int HospitalAdmissions() {
		  
	  //}
	  
	  private CategoryDataset createDataset() {
		  DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
		  dataset.addValue(20, "Week 1", "Week 1");
		  dataset.addValue(30, "Week 1", "Week 2");
		  dataset.addValue(50, "Week 1", "Week 3");
		  dataset.addValue(90, "Week 1", "Week 4");
		  dataset.addValue(90, "Week 1", "Week 5");
		  dataset.addValue(90, "Week 1", "Week 6");
		  dataset.addValue(90, "Week 1", "Week 7");
		  dataset.addValue(90, "Week 1", "Week 8");
		  dataset.addValue(90, "Week 1", "Week 9");
		  dataset.addValue(90, "Week 1", "Week 10");
		  dataset.addValue(90, "Week 1", "Week 11");
		  dataset.addValue(90, "Week 1", "Week 12");
		  return dataset;
	  }
	  
	  public static void main(String[] args) throws Exception{
		  SwingUtilities.invokeAndWait(()->{  
			  ResultVisualisation example=new ResultVisualisation("Bar Chart Window");  
		      example.setSize(800, 400);  
		      example.setLocationRelativeTo(null);  
		      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
		      example.setVisible(true);  
		    });  
	}
	  }
