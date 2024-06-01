import javax.swing.JButton;
import java.awt.*;

public class Button{
	public JButton button;
	public String name;
	private int x;
	private int y;
	private int width;
	private int height;

	public Button(int x , int y , int w , int h , String name){
		this.name = name;
		button = new JButton(this.name);
		button.setVisible(true);
		button.setBounds(x , y , w , h);
		button.setContentAreaFilled(true);

		Font font = button.getFont();
		button.setFont(new Font(font.getName() , font.getStyle() , 50));
	};

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
		button.setText(name);
	}
}
