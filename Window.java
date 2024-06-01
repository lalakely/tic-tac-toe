import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Window extends JFrame{
	public int width;
	public int height;
	public int counter;

	public Window(int x , int y,int w , int h){
		this.setVisible(true);
		this.setLocation(x, y);
		this.setResizable(false);
		this.setSize(w , h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		width = w;
		height = h;
		counter = 0;
	}

	public void setName(String title){
		this.setTitle(title);
	}
	
	public void addButton(Button button ){
		this.add(button.button);
		this.setVisible(true);
		this.onButtonClicked(button);
	}

	public void onButtonClicked(Button button){
		button.button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(counter % 2 == 0){
					button.setName("X");
				}
				else{
					button.setName("O");
				}
				counter++;
				System.out.println(counter);
			}
			
		});
	}
}
