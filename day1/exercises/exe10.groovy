println "input a sequence of numbers"
int num = 0
int last_num, diff
String input_num
boolean first_time = true
boolean yes = true

while (1) {
	print "Number: "
	input_num = System.console().readLine()
	num = Integer.parseInt(input_num)
	if (num== -1 ) {
		break;
	}
	if (first_time){
		last_num = num
		first_time = false
	} else {
		diff = last_num - num
		if (diff != 1 || diff != -1 ){
				println "here"
				yes = false
		}
	}
	last_num = num
}

if (yes){
	println "Yes!"
} else {
	println "No :("
}