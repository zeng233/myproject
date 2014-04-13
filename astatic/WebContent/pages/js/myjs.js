// foo:类似于java for循环中的标记
var x = 1;
foo: {
	x = 2;
	break foo;
	x = 3;
}

console.log(x);

//$("a").val().trim();