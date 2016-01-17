int iterations, counter 
String input_num
float pi
boolean plus = true

counter = 1


println "This program calculates Pi using an infinite sum"
print "Please input the number of iterations you would like to see:"
input_num = System.console().readLine()
iterations = Integer.parseInt(input_num)
println iterations
while (counter <=  iterations ) {

	if (counter % 2 != 0){
	//print "Running here!!"
	//println counter
		if (plus){
			pi += (4/counter)
			plus = false
			//println "Adding"
			//print (4/counter)
		}else{
			pi -= (4/counter)
			plus = true
			//println "Subtracting"
			
			//print (4/counter)
		}
	}
	counter = counter + 1
}

print "Pi is:"
println pi