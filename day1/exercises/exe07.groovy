/*
Naive sorting
*/

int a,b,c
String input_string

print "Input the first number: "
input_string = System.console().readLine()
a = Integer.parseInt(input_string)

print "Input the second number: "
input_string = System.console().readLine()
b = Integer.parseInt(input_string)

print "Input the third number: "
input_string = System.console().readLine()
c = Integer.parseInt(input_string)


if (a <b ) {
	if (b < c) {
		print a
		print b
		print c
	} else if (c < b ) {
		print a
		print c
		print b
	} else if (a <c ){
		print c
		print a
		print b
	
	}
}
