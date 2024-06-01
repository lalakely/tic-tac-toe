

public class MainApp{
	public static void main(String[] args){
			
		/// Create the window 
		Window w = new Window(200 , 200 , 400 , 420);
		w.setName("tic tac toe");

		addButtons(w);


	}

	public static void addButtons(Window window){
		for (int i = 0 ; i < 3 ; i++){
			for (int j = 0 ; j < 3 ; j++){
				int x = (window.width / 3) * i;
                		int y = ((window.height / 3) * j )- 20;
                		int w = 130;
                		int h = 130;
	
        	        	Button button = new Button(x , y , w, h , "" );
        	        	window.addButton(button);
			}
		}
	}

}
