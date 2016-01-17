
/*
Exercise 4 - Prime Numbers
*/


println "This program will test if a number if prime"
print "Please input a number:"
String input_num_to_test = System.console().readLine()
int num_to_test = Integer.parseInt(input_num_to_test)
println "here"
int counter = num_to_test
int divisors = 0
while (counter>1){
	if (num_to_test %counter == 0){
		divisors ++
	}
	counter--
}

if (divisors > 1){
	println "This numbers is not a prime"
} else {
	println "This number is a prime"
}

