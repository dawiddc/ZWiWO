package zwiwo.groovy

class Rectangle {
    int width = 5
    int height = 5
    String fill = '#'
    
    public void execute() { 
		height.times {
			println fill * width
		}
    }
}
