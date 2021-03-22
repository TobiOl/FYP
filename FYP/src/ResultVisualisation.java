import java.util.Random;


import javax.swing.JFrame;  
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  
import java.util.ArrayList;
import java.util.Iterator;
public class ResultVisualisation extends JFrame{
	//visualisation of the data calculated in the Simulation class in form of a bar chart
	//code gotten from https://www.javatpoint.com/jfreechart-bar-chart
	  private static final long serialVersionUID = 1L;  
	  
	  
	  
	  private int LengthOfStay;
	  
	  static ArrayList<Integer> Weeks = new ArrayList<Integer>();

	private int SplitHospitalised;
	  
	  
	  public ResultVisualisation(String apptitle) {
		  super(apptitle);
		  
		  //Dataset of the admissions declared
		  CategoryDataset Admissions = createDataset();
		  
		  //Chart created here
		  JFreeChart chart = ChartFactory.createBarChart("Hospital admissions per week", "Weeks", "Total admissions", Admissions, PlotOrientation.VERTICAL,true,true,false);
		  ChartPanel panel = new ChartPanel(chart);
		  setContentPane(panel);
		  
		  }
	  

	  
	  private CategoryDataset createDataset() {
		  DefaultCategoryDataset WeeksDataset = new DefaultCategoryDataset(); 
		  
		  //Splits the total hospitalised into 12 to represent increase per week and then added to each other
		  SplitHospitalised =  (int) (Simulation.TotalHospitalised/12);
		  int counter = SplitHospitalised;
		  


		  //calculates the length of stay for 
		  for (int i = 0; i < 12; i++) {
			  int z = LengthOfStay();
			  Weeks.add(z);
		  }
		  
		  for (int y = 0; y < Weeks.size(); y++) {
			  Weeks.set(0, SplitHospitalised);
			if (Weeks.get(y)>=7) {
				Weeks.set(y, counter+SplitHospitalised);
				counter = counter + SplitHospitalised;
			}
			else {
				Weeks.set(y, counter);
			}
		}
		  
		  	
		  

		  
		//First parameter is the actual value of the data, second is the grouping of the data and third is the actual labelling. 
		  WeeksDataset.addValue(Weeks.get(0), "Weeks", "Week 1");
		  WeeksDataset.addValue(Weeks.get(1), "Weeks", "Week 2");
		  WeeksDataset.addValue(Weeks.get(2), "Weeks", "Week 3");
		  WeeksDataset.addValue(Weeks.get(3), "Weeks", "Week 4");
		  WeeksDataset.addValue(Weeks.get(4), "Weeks", "Week 5");
		  WeeksDataset.addValue(Weeks.get(5), "Weeks", "Week 6");
		  WeeksDataset.addValue(Weeks.get(6), "Weeks", "Week 7");
		  WeeksDataset.addValue(Weeks.get(7), "Weeks", "Week 8");
		  WeeksDataset.addValue(Weeks.get(8), "Weeks", "Week 9");
		  WeeksDataset.addValue(Weeks.get(9), "Weeks", "Week 10");
		  WeeksDataset.addValue(Weeks.get(10), "Weeks", "Week 11");
		  WeeksDataset.addValue(Weeks.get(11), "Weeks", "Week 12");
		  return WeeksDataset;
	  }
	  
	  //length of stay for each week randomly generated in terms of days
	  //will calculate a random amount of days a patient needs to stay in hospital
	  //per week and return this value
	  private int LengthOfStay() {
		  Random random = new Random();
		  int lengthofstay = random.nextInt(15);
		  return lengthofstay;
		  
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
