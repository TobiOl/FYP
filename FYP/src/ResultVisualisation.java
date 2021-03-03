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
	  
	  private int Week1;
	  private int Week2;
	  private int Week3;
	  private int Week4;
	  private int Week5;
	  private int Week6;
	  private int Week7;
	  private int Week8;
	  private int Week9;
	  private int Week10;
	  private int Week11;
	  private int Week12;
	  
	  
	  public ResultVisualisation(String apptitle) {
		  super(apptitle);
		  
		  //Dataset
		  CategoryDataset Admissions = createDataset();
		  
		  //Chart created here
		  JFreeChart chart = ChartFactory.createBarChart("Hospital admissions per week", "Weeks", "Total admissions", Admissions, PlotOrientation.VERTICAL,true,true,false);
		  ChartPanel panel = new ChartPanel(chart);
		  setContentPane(panel);
		  
		  }
	  

	  
	  private CategoryDataset createDataset() {
		  DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
		  
		  Week1 = (int) (Simulation.TotalHospitalised/12);
		  Week2 = (int) (Week1*2);
		  Week3 = (int) (Week2+Week1);
		  Week4 = (int) (Week3+Week1);
		  Week5 = (int) (Week4+Week1);
		  Week6 = (int) (Week5+Week1);
		  Week7 = (int) (Week6+Week1);
		  Week8 = (int) (Week7+Week1);
		  Week9 = (int) (Week8+Week1);
		  Week10 = (int) (Week9+Week1);
		  Week11 = (int) (Week10+Week1);
		  Week12 = (int) (Week11+Week1);
		  
		  dataset.addValue(Week1, "Weeks", "Week 1");
		  dataset.addValue(Week2, "Weeks", "Week 2");
		  dataset.addValue(Week3, "Weeks", "Week 3");
		  dataset.addValue(Week4, "Weeks", "Week 4");
		  dataset.addValue(Week5, "Weeks", "Week 5");
		  dataset.addValue(Week6, "Weeks", "Week 6");
		  dataset.addValue(Week7, "Weeks", "Week 7");
		  dataset.addValue(Week8, "Weeks", "Week 8");
		  dataset.addValue(Week9, "Weeks", "Week 9");
		  dataset.addValue(Week10, "Weeks", "Week 10");
		  dataset.addValue(Week11, "Weeks", "Week 11");
		  dataset.addValue(Week12, "Weeks", "Week 12");
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
