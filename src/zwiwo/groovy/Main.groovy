package zwiwo.groovy

class Main {
	
	def hello() {
		println "Hello world!"
	}
	
	def testPower() {
		(1..10).each{power -> println 2 ** power}
	}
	
	def testAnotherPower() {
		//collect - iterate over collection and transform each element of the collection using closure (gets new collection)
		println ([1, 2, 3, 5, 7, 11].collect{
			2 ** it
		}.join(" | "))
	}
	
	def switchCase(text) {
		def letters = text.collect{
			letterString ->
			
			def letter = letterString as Character
			
			if (!letter.isLetter()) {
				letter
			} else {
				letter.isUpperCase() ? letter.toLowerCase() : letter.toUpperCase()
			}
		}
		
		letters.join()
	}
	
	def testSwitchCase() {
		println switchCase("qWeRtY_3")
	}
	
	def run() {
		hello()
		testPower()
		testAnotherPower()
		testSwitchCase()
		def rectangle = new Rectangle();
		rectangle.execute();
	}
	
	/**
	 * Application entry point
	 */
	static main(args) {
		new Main().run();
	}
}
