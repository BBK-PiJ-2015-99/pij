println "input a sequence of numbers"
int num = 0
int highest
String input_num
boolean first_time = true

while (num != -1  || first_time) {
	print "Number: "
	input_num = System.console().readLine()
	num = Integer.parseInt(input_num)
	if (first_time){
		highest = num
		first_time = false
	} else {
		if (num>  highest){
				highest = num
		}
	}
}

print "The highest number was: "
println highest


