
int a,b, tracker
String input_number

println "This program will multiply two number"
print "Please input the first number: "
input_number = System.console().readLine()
a = Integer.parseInt(input_number)

print "Please input the second number: "
input_number = System.console().readLine()
b = Integer.parseInt(input_number)

tracker = 0

while (a > 0){
	tracker = tracker + b
	a--
}

println "The product of these two numbers is: "
print  tracker


