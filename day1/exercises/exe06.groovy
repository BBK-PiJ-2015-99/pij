int a,b, tracker
String input_number

println "This program will divide two number"
print "Please input the first number: "
input_number = System.console().readLine()
a = Integer.parseInt(input_number)

print "Please input the second number: "
input_number = System.console().readLine()
b = Integer.parseInt(input_number)

tracker = 0

while (a >= b){
	a = a - b
	tracker ++
}

print "The quotient of these two numbers is: "
println  tracker
print "The remainder is: "
println a

